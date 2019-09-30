import java.util.ArrayList;

public class FeilFinner {
    private ArrayList<Character> list = new ArrayList<>();
    private String text;

    public FeilFinner(String inText){
        text = inText;
    }

    public void finnFeil(){
        char myChar;
        for(int i = 0; i<text.length(); i++){
            myChar = text.charAt(i);

            if(myChar=='(' || myChar=='[' || myChar=='{'){
                list.add(myChar);
            }else if(myChar == ')'){
                if(list.get(list.size()-1)=='('){
                    list.remove(list.size()-1);
                }else{
                    System.out.println("//Det er en nestefeil i teksten!");
                    break;
                }
            }else if(myChar==']'){
                if(list.get(list.size()-1)=='['){
                    list.remove(list.size()-1);
                }else{
                    System.out.println("Det er en nestefeil i teksten!");
                    break;
                }
            }else if(myChar=='}'){
                if(list.get(list.size()-1)=='{'){
                    list.remove(list.size()-1);
                }else{
                    System.out.println("Det er en nestefeil i teksten!");
                    break;
                }
            }
        }
        if(list.size()!=0){
            System.out.println("Det er en nestefeil i teksten!");
        }
    }
    public static void main(String[] args){

        FeilFinner fi = new FeilFinner("heil på deg {}String hei = god dag");
        fi.finnFeil();
    }
}
