package coursBase;
public class OCBoucleWhile {
    

    public static void main(String[] args){

        int i = 0;

        while (i<90){
            i = randomNumber();
            print(i);
        }
    }

    static void print(int nombre){
        System.out.println("Nombre " + Integer.toString(nombre));
    }

    static int randomNumber() {
        return (int) ((Math.random() * ((100 - 1) + 1 )) + 1);
    }
}

