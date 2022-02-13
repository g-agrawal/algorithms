package custom.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CustomLinkedList {
    public Node head;

    public void display(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
    }

    public void deleteBackHalf(Node head) {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
    }

    public Node deleteKthNode(Node head, int kth) {
        if(head == null) {
            return head;
        }
        Node current = head;
        int count = 0;
        while(current != null) {
            current = current.next;
            count++;
        }
        current = head;
        int deleteIdx = count - (kth % count);
        if(deleteIdx == count) {
            head = head.next;
            return head;
        }
        for(int i = 1; i < deleteIdx; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    public Node deleteKthNode2(Node head, int kth) {
        Map<Integer, Node> map = new HashMap<>();
        Node current = head;
        int nodeIdx = 0;
        while(current != null) {
            nodeIdx++;
            map.put(nodeIdx, current);
            current = current.next;
        }
        int index = nodeIdx - (kth % nodeIdx);

        if(kth == 1) { // last node
            current = map.get(nodeIdx - 1);
            current.next = null;
        } else if(kth == nodeIdx) { // first node
            current = map.get(1);
            current = current.next;
            head = current;
        } else {
            current = map.get(index - 1);
            current.next = current.next.next;
        }
        return head;
    }

    // Empty
    // Middle
    // First Node
    // Last Node
    // One Node
    public Node deleteKthNodeFromEnd(Node head, int kth) {
        if(head == null || kth == 0) {
            return head;
        }
        Node prev = null;
        Node slow = head;
        Node fast = head;
        for(int i = 1; i < kth; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(prev == null) {
            head = head.next;
            return head;
        }
        prev.next = slow.next;
        return head;
    }
}
