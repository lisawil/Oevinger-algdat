import java.util.Date;

public class AksjeKlient {
    public static void main(String[] args){
        Aksjer aksjer = new Aksjer();
        aksjer.lagTabell();
        int[] dager;
        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            dager = aksjer.aksjeberegner();
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. runde:" + tid);
        System.out.println("kjøpsdag: " + (dager[0]+1) + " , salgsdag " + (dager[1] +1));


    }

}