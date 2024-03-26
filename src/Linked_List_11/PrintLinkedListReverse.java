package Linked_List_11;

public class PrintLinkedListReverse {
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
        void reverseDisplay(Node temp){
            if(temp == null){
                return;
            }
            reverseDisplay(temp.next);
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.size();
        list.reverseDisplay(list.head);
    }
}
