import java.util.ArrayList;

public class HashTable {
    private Node[] table = new Node[113];
    //inserts new value into the hashtable
    public void add(String name){
        int hash = getHash(name);
        if(table[hash] == null){
            table[hash] = new Node(name);
        }else{
            Node current = table[hash];
            while(current.next()!=null) {
                current = current.next();
            }
            current.setNext(new Node(name));
        }
    }
    //finds the hash with mod
    private int getHash(String name){
        int hash = 0;
        for(int i = 0; i<name.length(); i++ ){
            hash += (i+1)*10*name.charAt(i);
        }
        hash = hash % table.length;

        return(hash);
    }
    //displays the table
    public void displayTable(){
        int teller = 0;
        int kollisjoner=0;
        for(int i = 0; i<table.length; i++){
            if(table[i] == null){

            }else if(table[i].next() == null){
                teller++;
            }else {
                Node current = table[i];
                teller++;
                while (current.next() != null){
                    System.out.println(current.getName()+ " & " + current.next().getName());
                    current = current.next();
                    kollisjoner++;
                }
            }
        }
        System.out.println("Kollisjoner" + kollisjoner);
        System.out.println("kolisjoner pr. personer " + (double)kollisjoner/96);
        System.out.println("lastFaktor: " + teller + " av " + table.length);
    }
}
