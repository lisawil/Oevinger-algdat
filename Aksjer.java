
public class Aksjer{
    private int[] kursendring;
    public void lagTabell(){
       kursendring = new int[100];
        for(int i = 0; i<100; i++){
            kursendring[i] = (int)(Math.random()*21) -10;
        }
    }
    public void eksempelData(){
        kursendring = new int[]{-1,3,-9,2,2,-1,2,-1,-5};
    }
    public int[] aksjeberegner() {
        int[] kjoepSelg = {0, 0};
        int[] kurs = new int[kursendring.length];
        kurs[0] = kursendring[0];

        for(int i = 1; i<kursendring.length; i++){ //n
            kurs[i] = kurs[i-1] + kursendring[i];
        }
        for (int k_dag = 0; k_dag < kursendring.length-1; k_dag++) {//n
           for(int s_dag = k_dag+1; s_dag < kursendring.length; s_dag++){//n^2
               if(kurs[s_dag]-kurs[k_dag]>kurs[kjoepSelg[1]]-kurs[kjoepSelg[0]]){
                   kjoepSelg[0] = k_dag;
                   kjoepSelg[1] = s_dag;
               }
           }
        }
        return (kjoepSelg);
    }
}

