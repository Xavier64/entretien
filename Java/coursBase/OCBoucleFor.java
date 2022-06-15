package coursBase;
public class OCBoucleFor {
    
    public static void main(String[] args){

        bonjour("Jean");
        bonjour("Jean");
        for (int i = 1 ; i <= 5 ; i++ ){
            bonjour(Integer.toString(i));
        }

    }

    static void bonjour(String nom) {
        System.out.println("Bonjour " + nom + "!!" );
    }
}
