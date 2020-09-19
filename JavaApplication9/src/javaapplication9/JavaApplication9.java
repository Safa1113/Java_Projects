/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;


 class Node {

	
	private int data;
	private Node link;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	
	
}

 class LinkedStack {

	Node head;
	 int cap;
	
	public LinkedStack() {
		head=null;
		cap=0;
	}
	
	public boolean IsEmpty(){
		return ( head == null );
	}

	
	public boolean IsFull(){
	
		
		return ( getCount() == cap );
        }

	  int getCount(){
		int count=0;
		if (IsEmpty()) {
		}	else {
			Node q=head;
			while (q!=null) {
				q=q.getLink();
				count++;
			}
		}
		return count;
	}

	

	
	
	
	public void push(int DATA){
		if (IsFull()) {
			System.out.println("The Stack IsFull.");
		}else {
                  Node newNode=new Node();
                  newNode.setData(DATA);
			if (IsEmpty()) {
				
				
				head=newNode;
			}else {
				
				
				Node q=head;
				while (q.getLink() != null) {
					q=q.getLink();
				}
				q.setLink(newNode);
			}
			
		}
	}
	
	


public int pop(){
    int DATA =0;
		if (IsEmpty()) {
			System.out.println("The Stack IsEmpty.");
			System.exit(0);		}
		Node q=head;
                if (getCount() == 1) {
                     DATA = q.getData();
                     head = null;
            } else {
                    while (q.getLink().getLink() != null) {
                        q=q.getLink();
                    }
            
		 DATA=q.getLink().getData();
		q.setLink(null);
                }
		return DATA;
	}
	
	void display(){
		if (IsEmpty()) {
		}else {
			Node q=head;
			while (q!= null) {
				System.out.println(q.getData());
				q=q.getLink();
			}
		}
	}
	
	
	
}


public class JavaApplication9 {

    public static void menu(){
		System.out.println("1-push");
		System.out.println("2-pop");
		System.out.println("3-check Empty");
		System.out.println("4-check Full");
		System.out.println("5-Display Stack Content");
	}
    public static void main(String[] args) {
      
        
        
        
        	Scanner kb =new Scanner(System.in);
		LinkedStack LLS=new LinkedStack();
		LLS.cap=5;
		while (true) {
			menu();
			int choise=kb.nextInt();
			
			if (choise == 1) {
				System.out.println("Enter Element :");
				LLS.push(kb.nextInt());
			}else if (choise == 2) {
				System.out.println("The result is "+LLS.pop());
			}else if (choise == 3) {
				System.out.println("is Empty ? : "+LLS.IsEmpty());
			}else if (choise == 4) {
				System.out.println("is Full ? : "+LLS.IsFull());
			}else if (choise == 5) {
				LLS.display();
			}else {
				System.out.println("Entery Wrong");
			}
		}
	}
        
        
    }
    

