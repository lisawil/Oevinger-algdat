public class JosephusProblem {
    CreateList list= new CreateList();
    public int getSurvivor (int ant, int interval){
        formCircle(ant);
        CreateList.Node myNode = killOff(ant-1, interval-1);
        System.out.println("the survivor is person nr. " + myNode.getData());
        return(0);
    }

    private void formCircle(int ant){
        for(int i = 0; i<ant; i++){
            list.add(i+1);
        }
    }

    private CreateList.Node killOff(int ant, int interval){
        CreateList.Node myNode = list.tail;

        for(int i = 0; i<ant; i++){
            for(int j = 0; j<interval; j++) {
                myNode = myNode.next();

            }
            list.killNext(myNode);
        }
        return myNode;
    }

    public static void main(String[] args){
        JosephusProblem Phus = new JosephusProblem();
        Phus.getSurvivor(41,3);
    }
}
