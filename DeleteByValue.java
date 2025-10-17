class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteByValue {
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void deleteByValue(int value){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.data == value){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null && temp.data != value){
            prev = temp;
            temp=temp.next;
        }
        if(temp == null){
            System.out.println("value not found in list");
            return;
        }
        prev.next = temp.next;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DeleteByValue list = new DeleteByValue();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.println("Original list:");
        list.display();
        list.deleteByValue(30);
        System.out.println("After deleting 30:");
        list.display();
    }
}
