package CoursPOO;

public class OC2Poo {

    public static void main(String[] args) {

        Voiture voiture = new Voiture();
        voiture.start();

        Bateau bateau = new Bateau();
        bateau.start();
    }
}

class Vehicule{
    void start(){
        System.out.println("Vroooom!");
    }
}

    class Voiture extends Vehicule{


        @Override
        void start(){
            super.start();
            allumerFeux();
        }

       void allumerFeux(){
           System.out.println("Allumage feux");
       }
    }
    
    class Bateau extends Vehicule{

    }
 
    