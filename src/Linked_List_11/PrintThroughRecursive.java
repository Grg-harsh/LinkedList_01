package Linked_List_11;

public class PrintThroughRecursive {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insert(int var){
            Node temp = new Node(var);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void size(){
            System.out.println(size);
        }
        void displayRecursive(Node temp){
            if(temp == null){
                return;
            }
            System.out.print(temp.data+"\t");
            displayRecursive(temp.next);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(40);
        list.displayRecursive(list.head);
        System.out.println();
        System.out.println("The Size of likedList is ");
        list.size();
    }
}
