/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidlab3;

 class NewThread implements Runnable {
     Thread t;
     
     NewThread(){
     
     t = new Thread(this, "Demo Thread");
     t.start();
 }
     public void run() {
         try{
             for (int i = 0; i<=20; i++){
                 System.out.println(i+"\n");
             Thread.sleep(1000);
             }
         }
         catch (InterruptedException e){
             System.out.println("thread is interrupted");
         }
     }
}




public class Androidlab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new NewThread();
    }
    
}
