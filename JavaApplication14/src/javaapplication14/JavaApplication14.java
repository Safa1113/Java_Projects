
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


class Form1 extends JFrame {
    JLabel l1,l2;
    public static JTextField t1;
    JPasswordField pt1;
    JPanel p1,p2, p3;
    JButton b1;
    Form2 f2;
    
    Form1 (){
        
        super("Booking");
        
        l1 = new JLabel("Name:");
        l2 = new JLabel ("Password:");
        t1 = new JTextField(13);
        pt1 = new JPasswordField(13);
        
        b1 = new JButton("Login");
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        p1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p1.add(l1);
        p1.add(t1);
        
        
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p2.add(l2);
        p2.add(pt1);
        
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.add(b1);


        setLayout(new FlowLayout());
        add(p1);
        add(p2);
        add(p3);
        
        handler h =new handler();
        b1.addActionListener(h);
        
    }
    
    private class handler implements ActionListener {
        public void actionPerformed (ActionEvent e){
            String user = t1.getText();
            String pass = pt1.getText();
            
            if (user.equals("Java2")&&pass.equals("11111")){
                f2 = new Form2();
                Form1.this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"incorrect username or password","Massege", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
  
}


class Form2 extends JFrame {
    private JLabel l1,l2,l3,l4,l5,l6,l7;
    private JTextField t1,t2;
    private JTextArea a1;
    private JPanel p1,p2,p3,p4;
    private JCheckBox c1;
    private JRadioButton r1,r2;
    private ButtonGroup radio;
    private JComboBox com1,com2,com3;
    private JList lis1;
    private JScrollPane s1;
    private String sub, trav, room, adul, child, nat;
    private JMenuItem m1, m2, m3, m4;
    private JPopupMenu up1; 
    private Color color = Color.BLACK;
    String[] slis1 = {"Saudi", "Qatari", "Omani", "eygption"};
    
    
    
    
    Form2(){
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,680);
        setLocationRelativeTo(null);
        setVisible(true);
        
        JMenu file = new JMenu ("File");
        
        m1 = new JMenuItem("Change Color");
        m2 = new JMenuItem("Report");
        m3 = new JMenuItem("Exit");
        m4 = new JMenuItem("clear");
        
        file.add(m1);
        file.add(m2);
        file.add(m3);

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(file);
        
        up1 = new JPopupMenu();
        up1.add(m4);
        
        
        l1 = new JLabel("Destination, property name or address:");
        l1.setForeground(Color.red);
        l2 = new JLabel("Are you travelling for work?");
        l2.setForeground(Color.red);
        l3 = new JLabel("Rooms:");
        l3.setForeground(Color.red);
        l4 = new JLabel("Adults:");
        l4.setForeground(Color.red);
        l5 = new JLabel("Children:");
        l5.setForeground(Color.red);
        l6 = new JLabel("Full name");
        l6.setForeground(Color.blue);
        l7 = new JLabel("Nationality");
        l7.setForeground(Color.blue);
        t1 = new JTextField(10);
        t2 = new JTextField(8);
        
        p1 = new JPanel(new GridLayout(12,0));
        p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Booking Information"));
        p2 = new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Personal Information"));     
        p3 = new JPanel(new BorderLayout());
        p3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Report Information"));
     

        p4=new JPanel();
        p4.setLayout(new BorderLayout());

        
        c1 = new JCheckBox("Subscribe by Email");
        c1.setForeground(Color.red);
        
        
        r1 = new JRadioButton ("Yes");    
        r1.setSelected(true);
        r2 = new JRadioButton ("No");
  
        String[] scom1 = {"1", "2", "3", "4", "5"};
        String[] scom2 = {"1", "2", "3", "4", "5"};
        String[] scom3 = {"0", "1", "2", "3"};
        
                
                   
        com1 = new JComboBox(scom1);
        com2 = new JComboBox(scom2);
        com3 = new JComboBox(scom3);
        
        lis1 = new JList (slis1);
        lis1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lis1.setVisibleRowCount(3);
        s1 = new JScrollPane(lis1);
        
 
        a1 = new JTextArea(10,15);
        a1.setLineWrap(true);
        
        radio = new ButtonGroup();
        radio.add(r1);
        radio.add(r2);
        
        
        sub = new String("");
        trav = new String (" As business trip");
        room = new String ("You booked 1 room(s), ");
        adul = new String ("with 1 adult(s), ");
        child = new String ("");
        nat = new String ("Saudi");
        

        
        handler h = new handler ();
        c1.addItemListener(h);
        r1.addItemListener(h);
        r2.addItemListener(h);
        com1.addItemListener(h);
        com2.addItemListener(h);
        com3.addItemListener(h);
        lis1.addListSelectionListener(h);
        a1.addMouseListener(h);
        m1.addActionListener(h);
        m2.addActionListener(h);
        m3.addActionListener(h);
        m4.addActionListener(h);
 
       p1.add(l1);
       p1.add(t1);
       p1.add(l2);
       p1.add(r1);
       p1.add(r2);
       p1.add(l3);
       p1.add(com1);
       p1.add(l4);
       p1.add(com2);
       p1.add(l5);
       p1.add(com3);
       p1.add(c1);
       
       p2.add(l6);
       p2.add(t2);
       p2.add(l7);
       p2.add(s1);
       
       p3.add(a1);
       
       p4.add(p2,BorderLayout.NORTH);
       p4.add(p3,BorderLayout.SOUTH);

        
       setLayout(new FlowLayout(FlowLayout.LEFT));

        add(p1);
        add(p4);

        
    }

 
    
    public class handler extends MouseAdapter implements ItemListener, ListSelectionListener, ActionListener{
        @Override
        public void itemStateChanged (ItemEvent e){
            if (c1.isSelected())
                sub = "The new offers will be sent to you";
            
            if (r1.isSelected())
                trav = " As bussiness trip";
            else trav = " As tourial trip";
            
            int index1 = com1.getSelectedIndex();
            int index2 = com2.getSelectedIndex();
            int index3 = com3.getSelectedIndex();
            
            room = String.format("You booked %d rooms(s), ", index1+1);
            adul = String.format("with %d adult(s), ", index2+1);
            if (index3 != 0)
                child = String.format("and %d children", index3);
            
    
            
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
         
            int index = lis1.getSelectedIndex();
            
            nat = slis1[index];
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
       if (e.getSource() == m4)
           a1.setText("");
       if (e.getSource() == m3)
           System.exit(0);
       if (e.getSource() == m1){
           color = JColorChooser.showDialog(Form2.this, "Choose a color", color);
           if (color != null)
               a1.setForeground(color);
           t2.setForeground(color);
           t1.setForeground(color);
                   }
       if (e.getSource() == m2)
       {
           String tt1 = t1.getText();
           String tt2 = t2.getText();
           if ( !tt1.equals("")&& !tt2.equals(""))
           
               a1.setText("Hello " + t2.getText() + "(" + nat +")\nYou will go to " + t1.getText() + trav +"\n"+adul + child+ "\n"+room +"\n" + sub);
               else
                 JOptionPane.showMessageDialog(null,"Error. All fields are required","Error...", JOptionPane.ERROR_MESSAGE);
       }
        }
        @Override
        public void mouseReleased(MouseEvent e){
            if (e.isPopupTrigger())
                up1.show(a1, e.getX(), e.getY());
                
            
        }
    }
    
    
    
    
}


public class JavaApplication14 {

   public static Form1 f;
    public static void main(String[] args) {
        f = new Form1();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,180);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        
        
    }
    
}
