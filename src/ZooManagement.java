import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /* Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
         */
        //Instruction 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        //Prosit 2
        Animal lion = new Animal();
        lion.family = "Félidé";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Parc Animalier";
        myZoo.city = "Tunis";
       // myZoo.nbrCages = 20;

        System.out.println("Zoo : " + myZoo.name + " à " + myZoo.city);
        System.out.println("Animal : " + lion.name + " (" + lion.family + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
        //Zoo myZoo1 = new Zoo("Parc Animalier", "Tunis", 20);
        Zoo myZoo1 = new Zoo("Parc Animalier", "Tunis");
        System.out.println("Animal créé : " + lion1.name);
        System.out.println("Zoo créé : " + myZoo1.name + " (" + myZoo.city + ")");

        myZoo.displayZoo();
        System.out.println(myZoo);
        Animal lion2 = new Animal("A","lion2",5, true);
        Animal tiger = new Animal("B","Tiger",4, true);
        Animal elephant = new Animal("C","elephant",10,true);

        System.out.println(myZoo.addAnimal(lion2));
        System.out.println(myZoo.addAnimal(tiger));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.searchAnimal("elephant"));

        System.out.println(myZoo.removeAnimal("Tiger"));
        myZoo.DisplayAnimals();
        System.out.println(myZoo.isFull());

        Zoo zoo1 = new Zoo("Zoo 1", "Tunis");
        Zoo zoo2 = new Zoo("Zoo 2", "Ariana");
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        zoo2.addAnimal(elephant);
        Zoo result = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux : " + result.name);
    }
}
