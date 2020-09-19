/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author Safofoh
 */
public class JavaApplication1 extends JFrame {

    
    private  JList cursor;
    private  JScrollPane scroll;
   private  String[] cursorName ={"c","c++","java","FORTRAN","paythone"};
   private String s;
   private  JLabel l1;
   private  JButton b1 ;
 
   public JavaApplication1 () {
       super("Courses");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
       setVisible(true);
        setSize(800,900);
   setLayout(new FlowLayout());

   s = "nothing";
   
   
   
   cursor = new JList(cursorName);
   cursor.setVisibleRowCount(5);
   cursor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
   scroll =new JScrollPane(cursor);
   add(scroll);

      b1 =new JButton ("submit");
  add(b1);
   l1=new JLabel("your favorate parogramming language is/are");
   add(l1);
  
   cursor.setFixedCellWidth(200);
   cursor.setFixedCellHeight(30);
   
 Handler h = new Handler();
 b1.addActionListener(h);
 cursor.addListSelectionListener(h);
       
   }
   
    private class Handler implements ActionListener, ListSelectionListener{
        
        public void valueChanged (ListSelectionEvent e){
            int selections[] = cursor.getSelectedIndices();
            s = "";
            for (int i = 0; i < selections.length ; i++){
                int a = selections[i];
                s += cursorName[a] + ", ";
                
            }
        }
   public void actionPerformed(ActionEvent e){
       
       JOptionPane.showMessageDialog(JavaApplication1.this, "Your Selections:" + s, "Courses", JOptionPane.INFORMATION_MESSAGE);
       
       
       
   }
     }
    public static void main(String[] args) {
      
        new JavaApplication1 ();
    }
    
}


