package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class L2Test {


    @Test
    void testSimple() {
        final L2.ListNode l1 = L2.createListNode(Arrays.asList(2, 4, 3));
        final L2.ListNode l2 = L2.createListNode(Arrays.asList(5, 6, 4));
        final L2.ListNode listNode = new L2().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[7,0,8]", listNode.toString());
    }

    @Test
    void testOverflow() {
        final L2.ListNode l1 = L2.createListNode(Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1));
        final L2.ListNode l2 = L2.createListNode(Arrays.asList(5, 6, 4));
        final L2.ListNode listNode = new L2().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]", listNode.toString());
    }

    @Test
    void testSingleDigit() {
        final L2.ListNode l1 = L2.createListNode(Arrays.asList(5));
        final L2.ListNode l2 = L2.createListNode(Arrays.asList(5));
        final L2.ListNode listNode = new L2().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[0,1]", listNode.toString());
    }

    @Test
    void testLimits() {
        final L2.ListNode l1 = L2.createListNode(Arrays.asList(1));
        final L2.ListNode l2 = L2.createListNode(Arrays.asList(9, 9));
        final L2.ListNode listNode = new L2().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[0,0,1]", listNode.toString());
    }

    @Test
    void testLimits2() {
        final L2.ListNode l1 = L2.createListNode(Arrays.asList(1));
        final L2.ListNode l2 = L2.createListNode(Arrays.asList(9, 9, 9));
        final L2.ListNode listNode = new L2().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[0,0,0,1]", listNode.toString());
    }

    @Test
    void testLimits3() {
        final L2.ListNode l1 = L2.createListNode(Arrays.asList(0, 1));
        final L2.ListNode l2 = L2.createListNode(Arrays.asList(0, 9));
        final L2.ListNode listNode = new L2().addTwoNumbers(l1, l2);
        System.out.println("Result: " + listNode.toString());
        assertEquals("[0,0,1]", listNode.toString());
    }
}
