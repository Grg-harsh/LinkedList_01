package Linked_List_11;

public class GetValueForPerticular {
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
        void insert(int val){
            Node temp = new Node(val);
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
        void getValue(int idx){
            Node temp = head;
            if(idx > size || idx <= 0){
                System.out.println("Invalid input");
            }else {
                for (int i = 1; i < idx; i++) {
                    temp = temp.next;
                }
            }
            System.out.println(temp.data);
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        list.size();
        list.getValue(3);
    }
}
