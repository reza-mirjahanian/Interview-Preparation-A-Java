package org.example;

import java.util.Stack;

class L155 {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public void MinStack() {
        allData = new Stack<>();
        minData = new Stack<>();
    }

    public void push(int val) {
        allData.push(val);
        if (minData.size() == 0 || val <= minData.peek()) minData.push(val);
    }

    public void pop() {
        int val = allData.pop();
        if (val == minData.peek()) minData.pop();
    }

    public int top() {
        return allData.peek();
    }

    public int getMin() {
        return minData.peek();
    }
}