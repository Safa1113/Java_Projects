/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
class queue2 {
 int size =5 ;
 int[] qu_s=new int[size];
 int tail=-1, head=-1;


public boolean isfull(){
	return tail==size-1;
}
public boolean isEmpty(){
	return (tail<0 || head >tail);
}
public void add_qu(int y){
	if(isfull()){
		System.out.println("queue is full");
	}
	else{
		if(tail==-1){
			head = tail = 0;
			qu_s[tail]=y;
		}
else {
qu_s[++tail]=y;


}




}
}
public int de_qu(){
	if(isEmpty()){
		System.out.println("queue is Empty");
	System.exit(0);
	}
	return qu_s[head++];
}}


public class JavaApplication4 {


    public static void main(String[] args) {
      Scanner enter=new Scanner(System.in);
		System.out.println("enter point");
		int p=enter.nextInt();
		queue2 q1=new queue2();
		queue2 q2=new queue2();
		
		
		while(!q1.isfull()){
                 System.out.println("enter num");
		   int num=enter.nextInt();


			if(num>=p)
					
                          q1.add_qu(num);
                                        
			 else
                        {
				if(!q2.isfull())
				
                                    q2.add_qu(num);
                                
                                
			 
		  }
                   }
                
                
                
		while(!q1.isEmpty()){
			System.out.println("queue 1 = "+q1.de_qu());
		}
                
		while(!q2.isEmpty()){
			System.out.println("queue 2 = " + q2.de_qu());	
		}
    
    
}
}




