import java.util.Date;

public class Sorter {

    public static void quicksort(int[] tab, int venstre, int hoyre){
        if(hoyre-venstre>10){
            int delepos = splitt(tab, venstre, hoyre);
            quicksort(tab, venstre, delepos-1);
            quicksort(tab, delepos+1, hoyre);
        }else{
            boubleSort(tab, venstre, hoyre);

        }
    }
    private static int splitt(int[] tab, int venstre, int hoyre){
        int iv, ih;
        int midten = medians3Sort(tab, venstre, hoyre);
        int deleverdi = tab[midten];
        bytt(tab, midten, hoyre-1);
        for(iv = venstre, ih = hoyre-1;; ){
            while(tab[++iv]<deleverdi);
            while(tab[--ih]>deleverdi);
            if(iv>=ih)break;
            bytt(tab, iv, ih);
        }
        bytt(tab, iv, hoyre-1);
        return(iv);
    }

    private static int medians3Sort(int[] tab, int venstre, int hoyre){
        int midten = (venstre + hoyre)/2;
        if(tab[venstre]> tab[midten]){
            bytt(tab, venstre, midten);
        }if(tab[midten]>tab[hoyre]){
            bytt(tab, midten, hoyre);
            if(tab[venstre]>tab[midten]){
                bytt(tab, midten, venstre);
            }
        }
        return(midten);
    }

    private static void bytt(int[] tab, int venstre, int hoyre){
        int k =tab[hoyre];
        tab[hoyre] = tab[venstre];
        tab[venstre] = k;
    }
/*
    private static void shellSort(int[] tab, int venstre, int hoyre){
        int midten = (hoyre-venstre)/2 +venstre;
        while(midten>venstre){
            for(int i = midten; i<hoyre;i++){
                int j = i, flytt= tab[i];
                while(j>=midten && flytt<tab[j-midten]){
                    tab[j] = tab[j-midten];
                    j-=midten;
                }
                tab[j]= flytt;
            }
            midten=(midten==2)?1:(int)(midten/2.2);
        }
    }
*/

    private static void boubleSort(int[] tab, int venstre, int hoyre){
        for(int i = hoyre; i>venstre; i--){
            for(int j = venstre; j<i; j++){
                if(tab[j]>tab[j+1]){
                    bytt(tab, j,(j+1));
                }
            }
        }
    }

    public static int[] lagTabell(int ant){
        int[] tab = new int[ant];
        for(int i = 0; i<ant; i++){
            tab[i] = (int)(Math.random()*100000)-500;
        }
        return tab;
    }
    public static String test(int[] tab){
        for(int i = 0; i<tab.length-2; i++){
            if(!(tab[i+1]>=tab[i])){
                return("Tabellen er feil sortert");
            }
        }
        return("Tabellen er korrekt sortert");
    }

    public static int sjekksum(int[] tab){
        int sSum = 0;
        for(int i = 0; i<tab.length; i++){
            sSum+= tab[i];
        }
        return(sSum);
    }

    public static void main(String[] args){

        int[] tab = lagTabell(1000000);//1000 000
        int lang = tab.length;
        int sjekksum1 = sjekksum(tab);
        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            quicksort(tab, 0,lang-1);
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. runde:" + tid);
        System.out.println(test(tab));
        if(sjekksum1 == sjekksum(tab)) {
            System.out.println("Besto sjekksumtest");
        }else{
            System.out.println("Besto ikke sjekksumtest");
        }
    }
}
