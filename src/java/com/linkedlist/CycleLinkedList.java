package linkedlist;

//141. Linked List Cycle

import java.util.HashSet;
import java.util.Set;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some node in the
 * list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's
 * next pointer is connected to. Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class CycleLinkedList {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }

        }
        return false;

    }

    /**
     * Intuition
     * <p>
     * To detect if a list is cyclic,
     * we can check whether a node had been visited before.
     * A natural way is to use a hash table.
     * <p>
     * Algorithm
     * <p>
     * We go through each node one by one and record each node's
     * reference (or memory address) in a hash table.
     * If the current node is null,
     * we have reached the end of the list and it must not be cyclic.
     * If current node’s reference is in the hash table, then return true.
     */
    public boolean hasCycle2(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<>();
        while (head != null) {
            if (nodeSeen.contains(head)) {
                return true;
            } else {
                nodeSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }

}

