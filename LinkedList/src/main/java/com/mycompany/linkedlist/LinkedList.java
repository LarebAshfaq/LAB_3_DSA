/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.linkedlist;

/**
 *
 * @author N TECH
 */
public class LinkedList {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    LinkedList() {
        this.head = null;
    }

    public void InsertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.print ("list is empty");
        }
        Node Current = head;
        while (Current != null) {
            System.out.print(Current.data + "->");
            Current = Current.next;

        }
        System.out.print("null");
    }

  public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
  public void DeleteAtStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
 public void DeleteAtEnd() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
 }
 public int Size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    } // Size of Linked List

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.InsertAtStart(10);
        l.InsertAtStart(20);
        l.InsertAtStart(30);
        l.InsertAtStart(40);
        l.InsertAtEnd(50);  // Inserting at the end
        l.display();

        System.out.println("Size of the list: " + l.Size());

        l.DeleteAtEnd();  // Deleting from the end
        l.display();

        System.out.println("Size of the list: " + l.Size());

        l.DeleteAtStart();  // Deleting from the start
        l.display();

        System.out.println("Size of the list: " + l.Size());
    }
}
