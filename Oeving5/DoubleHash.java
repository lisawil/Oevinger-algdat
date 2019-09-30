public class DoubleHash {
    int[] table = new int[5007283];//et prime number slightly larger than 5mill
    public void add(int numberIn){
        int hash = getHash(numberIn, table);
        if(table[hash] == 0){
            table[hash] = numberIn;
        }else{
            int doubleHash = doubleHash(numberIn);
            while(table[hash+doubleHash] != 0) {
                hash= (hash+doubleHash)%table.length;
            }
            table[hash] = numberIn;
        }
    }
    public static int getHash(int number, int[] table){
        return(number % table.length);
    }
    private int doubleHash(int number){
        int doubleHash= number%(table.length-1)+1;
        return(doubleHash>0&& doubleHash<table.length-1 ? doubleHash:1);
    }

}
