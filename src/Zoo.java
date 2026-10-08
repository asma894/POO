<<<<<<< HEAD
public class Zoo {
    Animal[] animals = new Animal[25]; // max 25 animaux
    String name;
    String city;
    final int NBRCAGES = 25;
    public Zoo(){}
    int getNbrAnimals;
    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
       // this.nbrCages = nbrCages;
    }
    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + NBRCAGES);
    }
    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBRCAGES + "]";
    }
    int nbrAnimals=0;

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal.name) != -1) {
            return false;
        }
        if (nbrAnimals < animals.length) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }
    public void DisplayAnimals (){
        for (int i = 0; i<nbrAnimals; i++) {
            System.out.println(animals[i]);
        }   }
    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }}
            return -1;

    }
    public boolean removeAnimal(String name){
        int index = searchAnimal(name);
        if (index == -1){
            return false;
        }
        for (int i = index ; i < nbrAnimals -1 ; i++){
            animals[i] = animals[i+1];
        }
        animals[nbrAnimals - 1]= null;
        nbrAnimals--;
        return true;
    }
    public boolean isFull(){
        return nbrAnimals==NBRCAGES;
    }
    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {

        if (zoo1.nbrAnimals > zoo2.nbrAnimals) {
            return zoo1;
        } else {
            return zoo2;
        }
=======
public class Zoo
{
    Animal[] animals = new Animal[25];
    String name ;
    String city;
    int nbrCages;
    public Zoo (String name, String city, int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;

    }
    public void displayZoo(){
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
    }
    @Override
    public String toString (){
        return "zoo name :" +name+ "city:" +city + "nuber of cages :"+ nbrCages ;
>>>>>>> dad8ed7103f273dae244bad33d03b2f432dc50b3
    }
}
