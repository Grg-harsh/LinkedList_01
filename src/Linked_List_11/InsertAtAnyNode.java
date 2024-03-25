package Linked_List_11;

public class InsertAtAnyNode {
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
        int size(){
            System.out.println(size);
            return size;
        }
        void insertBegin(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        void insertAny(int idx, int val){
            if(idx == 0){
                insertBegin(val);
            }else if(idx == size()){
                insert(val);
            }else if(idx < 0){
                System.out.println("Wrong Index");
            }else{
                Node temp = new Node(val);
                Node tp = head;
                for(int i = 1; i < idx; i++){
                    tp = tp.next;
                }
                temp.next = tp.next;
                tp.next = temp;
            }
            size++;
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
        list.insertAny(1,32);
        list.display();
        list.insertAny(-1,33);
        list.display();


    }
}
