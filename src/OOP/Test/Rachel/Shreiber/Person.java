package OOP.Test.Rachel.Shreiber;

// Abstract class representing a Person
public abstract class Person {

    private String name;
    private int age;
    protected String address;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Abstract method to get the role of the person
    public abstract String getRole();
}
