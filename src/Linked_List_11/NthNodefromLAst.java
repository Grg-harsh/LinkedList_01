package Linked_List_11;

public class NthNodefromLAst {
    public static int nthNode(Node head, int n){
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int var = size-n+1;
        temp = head;
        for(int i = 1; i < var; i++){
            temp = temp.next;

        }
        return temp.data;
    }
    public static void nthEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow  = slow.next;
        }
        System.out.println(slow.data);
    }
    public static Node removenth(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
            while(fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return head;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(3);
        Node c = new Node(14);
        Node d = new Node(19);
        Node e = new Node(118);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
       // int ans = nthNode(a,2);
      //  System.out.println(ans);
      //  nthEnd(a,2);
        display(a);
        Node head = removenth(a,5);
        System.out.println("-----------------------");
        display(head);
    }
}
