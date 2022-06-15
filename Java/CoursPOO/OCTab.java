package CoursPOO;

public class OCTab {
    public static void main(String[] args) {

        String[] tableau = new String[10];

        tableau[3] = "index 3";

        tableau[1] = "index 1";

        tableau[3] = "Nouvelle donnée";

        for ( int i = 0 ; i < tableau.length; i++ ){
            System.out.println(tableau[i]);
        }

    }
}
