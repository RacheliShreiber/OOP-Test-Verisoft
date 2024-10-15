package OOP.Test.Rachel.Shreiber;

// Subclass Professor extending Person
public class Professor extends Person{

    private String department;

    // Constructor
    public Professor(String name, int age, String address,String department) {
        super(name, age);
        this.address=address;
        this.department=department;
    }

    // Override method to get the role for a professor
    @Override
    public String getRole() {
        return "Professor";
    }

    // Method specific to professors
    public String teach(){
        return "Teaching";
    }


}
