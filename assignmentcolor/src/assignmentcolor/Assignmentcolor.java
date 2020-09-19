/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentcolor;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


class Form1 extends JFrame {
    private JPanel p1, p2;
    private JList l1;
    private JScrollPane sc1;
    String[] s1 = {"red", "yellow", "Omani", "eygption"};
    
    
    Form1 (){
        
        super("");
        
       
        p1 = new JPanel();
        p2 = new JPanel();
        
        l1 = new JList(s1);
        l1.setVisibleRowCount(3);
        sc1 = new JScrollPane(l1);
       
        
     
        
        
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p2.add(l1);
        
        
        


        setLayout(new GridLayout(2,1));
        add(p1);
        add(p2);
        
        
        handler h =new handler();
        l1.addListSelectionListener(h);
        
        
    }
    
    private class handler implements ListSelectionListener {
        public void valueChanged (ListSelectionEvent e){

            
        //     int index = lis1.getSelectedIndex();
            
       //     nat = slis1[index];
    }
    
  
}
}




public class Assignmentcolor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Form1 f = new Form1();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,180);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
}
