public class CreateList {
    //Represents the node of list.
    public class Node{
        int data;
        private Node next;
        public Node next(){
            return(next);
        }
        public Node(int data) {
            this.data = data;
        }
        public int getData(){
            return data;
        }
    }

    public void killNext(Node nabo){
       nabo.next = nabo.next().next();
    }
    //Declaring head and tail pointer as null.
    public Node head = null;
    public Node tail = null;

    //This function will add the new node at the end of the list.
    public void add(int data){
        //Create new node
        Node newNode = new Node(data);
        //Checks if the list is empty.
        if(head == null) {
            //If list is empty, both head and tail would point to new node.
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            //tail will point to new node.
            tail.next = newNode;
            //New node will become new tail.
            tail = newNode;
            //Since, it is circular linked list tail will point to head.
            tail.next = head;
        }
    }

    //Displays all the nodes in the list
    public void display(int ant, Node node1) {
        Node current = node1;
        int i = 0;

            System.out.println("Nodes of the circular linked list: ");
            do{
                //Prints each node by incrementing pointer.
                System.out.println(" "+ current.data);
                current = current.next;
                i++;
            }while(i<=ant);
            System.out.println();

    }

    public static void main(String[] args) {
        CreateList cl = new CreateList();
        //Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        //Displays all the nodes present in the list

    }
}