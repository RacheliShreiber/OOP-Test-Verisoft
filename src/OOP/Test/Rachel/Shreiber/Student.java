package OOP.Test.Rachel.Shreiber;

// Subclass Student extending Person
public class Student extends Person{

    private String studentId;

    // Constructor
    public Student(String name, int age, String address,String studentId) {
        super(name, age);
        this.address=address;
        this.studentId=studentId;
    }

    // Override method to get the role for a student
    @Override
    public String getRole() {
        return "Student";
    }

    // Method specific to students
    public String study(){
        return "Studying";
    }


}
