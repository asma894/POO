public class Animal {
<<<<<<< HEAD
=======

>>>>>>> dad8ed7103f273dae244bad33d03b2f432dc50b3
    String family;
    String name;
    int age;
    boolean isMammal;
<<<<<<< HEAD
    public Animal(){}
    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }

=======

    public Animal (String family, String name , int age , boolean isMammal ){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;


    }
    public class Animal {

        String family;
        String name;
        int age;
        boolean isMammal;

        // Constructor
        public Animal(String family, String name, int age, boolean isMammal) {
            this.family = family;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;
        }

        @Override
        public String toString() {
            return "Family: " + family + ", Name: " + name + ", Age: " + age + ", Mammal: " + isMammal;
        }
    }
>>>>>>> dad8ed7103f273dae244bad33d03b2f432dc50b3
}
