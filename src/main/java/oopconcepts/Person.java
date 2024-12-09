package oopconcepts;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

   public void displayDetails() {
        System.out.println("Person's details are - Name: " + name + ", Age: " + age);
    }
}
