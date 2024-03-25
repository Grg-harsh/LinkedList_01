package Linked_List_11;

public class BasicsToCreation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;
        void insert(int var) {
        Node temp = new Node(var);
        if(head == null){
            head = temp;
        }else{
            tail.next = temp;
        }
        tail = temp;
        size++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        void size(){
            System.out.println(size);
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.size();
    }
}
