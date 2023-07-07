import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> animali = new ArrayList<>();

        animali.add("leone");
        animali.add("gazzella");
        animali.add("gatto");
        animali.add("elefante");

        for (int i = 0; i < animali.size(); i++){
            System.out.println(animali.get(i));
         //fsgh
        }

        animali.set(2,"cane");

        for (int i = 0; i < animali.size(); i++){
            System.out.println(animali.get(i));
        }
    }
}