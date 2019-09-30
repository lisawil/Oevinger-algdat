public class Node{
    private final String data;
    private Node next =null;

    public Node next(){
        return(next);
    }
    public void setNext(Node neste){
        next = neste;
    }
    public Node(String data) {
        this.data = data;
    }
    public String getName(){
        return data;
    }
}