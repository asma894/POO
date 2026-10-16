package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        setName(name);
        setAge(age);
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal a = (Animal) o;
        return age == a.age && isMammal == a.isMammal
                && Objects.equals(family, a.family) && Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name, age, isMammal);
    }

    public String getFamily() { return family; }
    public void setFamily(String family) { this.family = family; }

    public String getName() { return name; }
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Erreur : le nom de l'animal ne peut pas être vide.");
        }
    }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Erreur : l'âge de l'animal ne peut pas être négatif.");
        }
    }

    public boolean isMammal() { return isMammal; }
    public void setMammal(boolean mammal) { isMammal = mammal; }
}