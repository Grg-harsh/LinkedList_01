package Linked_List_11;

public class FindingInsertion {
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
        void insertion(int data){
            Node temp = new Node(data);
            if(head == null){
                head=temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertion(10);
        list1.insertion(20);
        list1.insertion(30);
        list1.insertion(40);
        list1.insertion(50);
        list1.insertion(60);
        LinkedList list2 = new LinkedList();
        list2.insertion(10);
        list2.insertion(20);
        list2.insertion(40);
        list1.insertion(50);
        list1.insertion(60);


    }
}
