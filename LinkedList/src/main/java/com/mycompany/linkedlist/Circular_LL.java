/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author N TECH
 */
public class Circular_LL {
      public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     private Node head;
     private Node tail;

  public Circular_LL(){
      this.head=null;
      this.tail=null;
  }
  public void InsertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
  
  public void display(){
      if (head ==null){
          System.out.println("list is empty");
          return;
  }
      Node Current=head.next;
      while(Current!=head){
          System.out.println(Current.data +"->");
          Current= Current.next;
      }
  }
        public static void main(String[] args) {
        Circular_LL clist = new Circular_LL();
clist.InsertAtStart(10);
clist.InsertAtStart(20);
clist.InsertAtStart(30);
clist.display();
        }
}
