package Linked_List_11;

public class BasicsOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        a.next = b;
        System.out.println(a.data);
        System.out.println(b.data);
    }
}
