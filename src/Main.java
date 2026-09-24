public class Main {

    public static void main(String[] args) {

        //Animal lion = new Animal();
        //Zoo myZoo = new Zoo();

        //lion.family="A";
        //lion.name="simba";
        //lion.age=5;
        //lion.isMammal= true;

        //myZoo.name="ZOO";
        //myZoo.city="tunis";
        //myZoo.nbrCages=50;

        Zoo myZoo = new Zoo("ZOO","tunis",50);
        Animal lion = new Animal("A" , "simba", 5 , true);
        Animal elephant = new Animal("B" , "elephant", 10 , true);
        Animal giraffe = new Animal("C" , "giraffe", 8 , true);

        myZoo.displayZoo();
        //System.out.println(myZoo) ;
        //System.out.println(myZoo.toString()) ;

        System.out.println(myZoo);
        System.out.println(lion);

    }
}