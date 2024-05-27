package singlylinkedlist;

public class Stack  {
    Node top;

    // Push a new element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop the top element from the stack
    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack Underflow");
        }

        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek the top element of the stack
    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack Underflow");
        }

        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

