package Linked_List_11;

public class DeleteNodeAt {
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
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        void deleteAtAny(int idx){
            Node temp = head;
            if(idx > size || idx < 1) {
                System.out.println("Invalid");
            }else if(idx == size){
                for(int i = 1; i < idx-1; i++){
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
            }else{
                for(int i = 1; i < idx-1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.deleteAtAny(0);
        list.deleteAtAny(6);
        list.deleteAtAny(4);
        list.display();
    }
}
