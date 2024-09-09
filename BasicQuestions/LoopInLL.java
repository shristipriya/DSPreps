import java.util.*;

public class LoopInLL {

    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static boolean detectLoop(Node h){
        HashSet<Node> s = new HashSet<Node>();
        while(h!=null){
            if(s.contains(h)){
                return true;
            }
            s.add(h);
            h = h.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LoopInLL ll = new LoopInLL();
        ll.push(20);
        ll.push(4);
        ll.push(15);
        ll.push(10);
        ll.head.next.next.next.next = ll.head;
        if(detectLoop(head)){
            System.out.println("Loop Found!");
        }
        else{
            System.out.println("No loop");
        }

    }
}
