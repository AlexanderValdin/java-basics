package ListAssignment;

public class SinglyLinkedList {
	private Node head;
    public SinglyLinkedList(){
        this.head = null;
    }
    public SinglyLinkedList add(int value) {
        if(this.head == null){
            this.head = new Node(value);
        } else{
            Node runner = this.head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = new Node(value);
        }
        return this;
    }
    public SinglyLinkedList remove() {
        Node runner = this.head;
        while(runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
        return this;
    }
    public void printValues() {
        Node runner = this.head;
        if(runner == null) {
            System.out.println(runner);
        } else {
            while(runner != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }
    public Node find(int value) {
        Node pointer = this.head;
        while(pointer.value != value){
            pointer = pointer.next;
        }
        return pointer;
    }
    public SinglyLinkedList removeAt(int index) {
        Node runner = this.head;
        if(runner == null) {
            return this;
        }
        if(index == 0){
            this.head = runner.next;
            return this;
        }
        for(int i=0; i<index-1; i++){
            runner = runner.next;
        }
        runner.next = runner.next.next;
        return this;
    }	
}
