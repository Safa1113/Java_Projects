/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JavaApplication3 extends JFrame {
    
   private JLabel l1;
    private JList ls1;
    private JScrollPane s1;
    private JButton b1;
    private String[] st1 = {"C", "C++", "JAVA", "Paython", "FORTRAN", "Paskal"};
    private String st2 = "Your Selections:[]";
    private JPanel p1;
      private JPanel p2;
    
    public JavaApplication3 (){
        
          super("Courses");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
       setVisible(true);
        setSize(400,400);
       setLayout(new FlowLayout());
       setLocationRelativeTo (null);
       
       l1 = new JLabel("Your Faviorate Programming Language is/are:");
       
       
       ls1 = new JList(st1);
       ls1.setVisibleRowCount(5);
       ls1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
     
       s1 = new JScrollPane(ls1);
       
       b1 = new JButton("Submit");
       
         p2 = new JPanel();
          p2.add(l1);
          
       p1 = new JPanel();
       p1.add(s1);
       p1.add(b1);
       
       
   
         add(p2);
         
       add(p1);
       

         Handler h = new Handler();
         b1.addActionListener(h);
         ls1.addListSelectionListener(h);
    }
    
     private class Handler implements ActionListener, ListSelectionListener{
        
        public void valueChanged (ListSelectionEvent e){
            int selections[] = ls1.getSelectedIndices();
            
            st2 = "Your Selections:[";
           
            for (int i = 0; i < selections.length ; i++){
                int a = selections[i];
               
                if (i != selections.length -1 )
                     st2 += st1[a] + ", ";
                else
                    st2 += st1[a]; 
                
            }
            st2 += "]";
            
        }
   public void actionPerformed(ActionEvent e){
       
       JOptionPane.showMessageDialog(JavaApplication3.this,  st2, "Courses", JOptionPane.INFORMATION_MESSAGE);
       
       
       
   }
     }


    public static void main(String[] args) {
        JavaApplication3 f1 = new JavaApplication3();
    }
    
}
