/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author N TECH
 */
public class Queue_LL {
public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;}
}
private Node front,rear;
Queue_LL(){
    this.front=null;
    this.rear=null;
}
public void Enqueue(int data){
   Node newNode=new Node(data);
   if(rear==null){
    front=rear=newNode;
    return;
   }
   rear.next=newNode;
   System.out.print("Enqueue:" + data);
}
public int dequeue(){
    if(front==null){
        System.out.print("queue is empty");
     front=rear=null;
     return -1;  
    }
    int value=front.data;
    front=front.next;
    return value;
}
public void display() {
        if (front == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
public static void main(String[] args){
 Queue_LL q=new Queue_LL();
 q.Enqueue(56);
 q.Enqueue(76);
 q.Enqueue(89);
 q.dequeue();
}
}
