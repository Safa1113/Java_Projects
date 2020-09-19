/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfile;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


class Form extends JFrame {
    private JTextArea t1;
    
    
    Form (){
        
        super("");
        
       
        t1 = new JTextArea();
        t1.setEditable(false);
        t1.setText(AssignmentFile.pathInfo);
        
     
        
       
        add(t1);
       
        
   
        
        
    }
    

    
  
}





public class AssignmentFile {

    
    private static String absolutePath = "";
    public static String pathInfo = "";
    
    public static void main(String[] args) throws IOException {
        
       
        // TODO code application logic here
        
JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());


                  jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int returnValue = jfc.showDialog(null, "Select");
		// int returnValue = jfc.showSaveDialog(null);
               
               

		if (returnValue == JFileChooser.APPROVE_OPTION) {
                    if (jfc.getSelectedFile().isDirectory()) {
				System.out.println("You selected the directory: " + jfc.getSelectedFile());
			}
			File selectedFile = jfc.getSelectedFile();
                        absolutePath = selectedFile.getAbsolutePath();
			System.out.println();
		}
        
    
        if (absolutePath != ""){
        Path path = Paths.get(absolutePath);
        
        if (Files.exists(path))
        {
            pathInfo += String.format("%n%s exists%n", path.getFileName());
            pathInfo += String.format("%s a directory%n", Files.isDirectory(path)? "Is" : "Is not");
            pathInfo += String.format("%s an absolute path%n" , path.isAbsolute()? "Is":"is not");
            pathInfo += String.format("Last modified: %s%n", Files.getLastModifiedTime(path));
            pathInfo += String.format("Size: %s%n", Files.size(path));
            pathInfo += String.format("Path: %s%n", path);
            pathInfo += String.format("Absolute path : %s%n", path.toAbsolutePath());
            
            if (Files.isDirectory(path))
            {
                pathInfo += String.format("%nDirectory contents:%n");
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for (Path p : directoryStream)
                    pathInfo += String.format("%s",p);
                
                        }
        } 
        else
        {
            pathInfo += String.format("%s does not exist%n", path);
        }
        
        Form f = new Form();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
        }
    
        
}
}