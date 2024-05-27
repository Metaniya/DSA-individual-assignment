package singlylinkedlist;

public class LinkedList {
    Node head;


    // Insert a new node at a specified position
    public void insertAtPos(int data, int pos) {
        // Create a new node
        Node newNode = new Node(data);

        // If the list is empty or the position is 1, insert at the beginning
        if (head == null || pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the (pos-1)th node
        Node current = head;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        // If the position is out of bounds, insert at the end
        if (current == null) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            return;
        }

        // Insert the new node at the specified position
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtPosition(int pos) {
        // If the list is empty or the position is 1, delete the first node
        if (head == null || pos == 1) {
            head = (head == null) ? null : head.next;
            return;
        }

        // Traverse to the (pos-1)th node
        Node current = head;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        // If the position is out of bounds noting done
        if (current == null || current.next == null) {
            return;
        }

        // Delete the node at the specified position
        Node toDelete = current.next;
        current.next = toDelete.next;
        toDelete = null;
    }


    // Delete the node that occurs after a given node
    public void deleteAfterNode(Node givenNode) {
        // If the list is empty or the given node is the last node, do nothing
        if (head == null || givenNode.next == null) {
            return;
        }

        // Get the node that comes after the given node
        Node nodeToDelete = givenNode.next;

        // Update the next pointer of the given node to skip the node to be deleted
        givenNode.next = nodeToDelete.next;

        // Delete the node
        nodeToDelete = null;
    }

    public boolean searchNode(int value) {
        // If the list is empty, return false
        if (head == null) {
            return false;
        }

        // Traverse the list and search for the node
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }

        // If the node is not found, return false
        return false;
    }
    //additional methode to append and display elements in the linked list

    public void append(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);

        // If the list is empty, set the head to the new node
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node in the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Append the new node to the end of the list
        current.next = newNode;
    }

    public void display() {
        Node current;
        current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current=current.next;
        }


    }
}



