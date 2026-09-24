public class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;

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
}
