/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linked_list;

/**
 *
 * @author N TECH
 */
public class Linked_list {
    // Inner class Node
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    Linked_list() {
        this.head = null;
    }

    // Method to insert at start
    public void InsertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert at end
    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node Current = head;
            while (Current.next != null) {
                Current = Current.next;
            }
            Current.next = newNode;
        }
    }

    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete the first node
    public void DeleteAtStart() {
        head = head.next;
    }

    // Method to delete the last node
    public void DeleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node Current = head;
            while (Current.next != null) {
                Current = Current.next;
            }
            Current.next = null;
        }
    }

    // Method to search for a value
    public void search(int value) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == value) {
                System.out.println("Value " + value + " found at position " + index);
                return;
            }
            current = current.next;
            index++;
        }

        System.out.println("Value not found.");
    }

    // Method to reverse the list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        display();
    }

    // Method to count the number of nodes in the list
    public int count() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.InsertAtStart(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.InsertAtEnd(50);

        // Display list
        System.out.println("Original list:");
        list.display();

        // Search for a value
        list.search(20);  
        list.search(100);   

        // Reverse the list
        System.out.println("Reversed list:");
        list.reverse();

        // Display the reversed list
        list.display();

        // Count the nodes
        System.out.println("Total number of nodes: " + list.count());
    }
}

