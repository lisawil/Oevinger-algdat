import java.util.Date;
import java.util.HashMap;

public class HashTableClient {
    public static void main(String[] args){
        Help helper = new Help();
       //Oppgave 1

        String[] names = helper.getNames();

        HashTable hTable = new HashTable();
        for(int i = 0; i<names.length; i++){
            hTable.add(names[i]);
        }
        hTable.displayTable();

        //Oppgave 2
        int[] tab = helper.getTable(5000000);
        DoubleHash dh = new DoubleHash();


        for(int i = 0; i<tab.length; i++){
            dh.add(tab[i]);
        }

        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            for(int i = 0; i<tab.length; i++){
                dh.add(tab[i]);
            }
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. tabell/5mill med egen metode:" + tid);

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(5000000,0.75f);
        start = new Date();
        runder = 0;
        do {
            for(int i = 0; i<tab.length; i++){
               hm.put(DoubleHash.getHash(tab[i],tab), tab[i]);
            }
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. tabell/5mill med java hashmap:" + tid);

    }



}
