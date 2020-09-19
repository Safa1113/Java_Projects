/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofi;

import java.util.Scanner;

class Facts{
    private String[] fact = {"banana is yellew"};
    private String[] subjects = {"banana"};
    
    boolean isUnderstandable (String s){
          boolean t = false;
       for (int i =0; i < subjects.length; i++)
           if (s.equals(subjects[i])){
               t = true;
               break;
           }
       return t;
    }
    boolean isTrue (String s){
         boolean t = false;
       for (int i =0; i < fact.length; i++)
           if (s.equals(fact[i])){
               t = true;
               break;
           }
       return t;
        
        
    }
    }
    
    


class Sentence {
   private String[] verbs = {"kill","do", "eat", "read"};
   private String[] nouns = {"banana","book", "you"};
   private String[] adjectives = {"yellow","useful"};
   private String[] helpingVerbs = {"are","is", "were", "was", "am"} ;
   private String[] questions = {"why","which", "how"};
   private String[] etc = {"",""};
   
   private String sen;
   private int category;
    
   Sentence (String s){
       sen = s;
       category = -1;
   }
   
   void categorize(){
       
       int fi = sen.indexOf (" ");
       int fic = -1;
       String fw = sen.substring(0, fi);
       
       for (int i =0; i < verbs.length; i++)
           if (fw.equals(verbs[i])){
               category = 2;
               break;
           }
       for (int i =0; i < questions.length; i++)
           if (fw.equals(questions[i])){
               category = 4;
               break;
           }
       for (int i =0; i < nouns.length; i++)
           if (fw.equals(nouns[i])){
               category = 1;
               break;
           }
       for (int i =0; i < helpingVerbs.length; i++)
           if (fw.equals(helpingVerbs[i])){
               category = 3;
               break;
           }
       
   
   }
   
   void excute (){
       if (category == -1)
           System.out.println("Sorry, I didn't understand");
       if (category == 1)
           System.out.println("info");
       if (category == 2)
           System.out.println("order");
       if (category == 3)
           answer1();
       if (category == 4)
           answer2();
       
   }
   void answer1 (){
       int fi = sen.indexOf (" ");
       int fic = -1;
       String fw = sen.substring(0, fi);
       
       int si = sen.indexOf (" ", fi);
       int sic = -1;
       String sw = sen.substring(fi+1, si);
       
       String sub = sw;
       
       Facts f = new Facts();
       if (!f.isUnderstandable(sub))
           System.out.println("I didn't understand");
       else
       if (f.isTrue(sen))
           System.out.println ("yes");
       
       
   }
   void answer2 (){
       
   }
   
    
}



public class Sofi {

  
    public static void main(String[] args) {
        System.out.println("Program Start");
        Scanner s = new Scanner(System.in);
        
        String read = s.nextLine();
        
        Sentence sen = new Sentence(read);
        sen.categorize();
        sen.excute();
        
    }
    
}
