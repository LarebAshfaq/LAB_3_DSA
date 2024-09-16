/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author N TECH
 */
public class Doubly_LL {
  public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
   private Node head; 
   private Node tail;
   // constructor of claa
   public Doubly_LL(){
       this.head=null;
       this.tail=null;
   }
   public void insertAtStart(int data){
       Node newNode= new Node(data);
       if(head==null){
           head=tail=newNode; //because initially our linked list we make is empty and the head is teh tail also
       }
       else{
           newNode.next=head;
           head.prev=newNode;
           head= newNode;
        }        
   }
   public void insertAtEnd(int data){
      Node newNode= new Node(data);
      if(head==null){
          head=tail=newNode;  
      }
      else{
          newNode.prev=tail;
          tail.next=newNode;
          tail= newNode;
      }
   }
   public void displayFromStart(){
       Node Current=head;
       while(Current!=null){
           System.out.print(Current.data +"-->");
           Current=Current.next;
       }
       System.out.print("null");
   }
   public void displayFromEnd(){
      Node Current=tail;
      while(Current!=null){
          System.out.print(Current.data + "-->");
                Current=Current.prev;

      }
   }
             
   public void removeall(){
       head=null;
   }

 public static void main(String[] args) {
Doubly_LL l=new Doubly_LL();
l.insertAtStart(74);
l.insertAtEnd(84);
l.displayFromStart();
}
}
