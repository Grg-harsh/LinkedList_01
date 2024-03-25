package Linked_List_11;

public class InsertBeginning {
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
        void insertBegin(int val){
            Node temp = new Node(val);
            if(head == null){
                tail = temp;
            }else{
                temp.next = head;
            }
            head = temp;
            size++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.println("Size of linkedList");
        list.size();
        System.out.println("LinkedList");
        list.display();
        list.insertBegin(10);
        list.insertBegin(5);
        System.out.println("After Insertion");
        list.display();
        System.out.println("Size");
        list.size();
        System.out.println("LinkedList");
        list.display();

    }
}
