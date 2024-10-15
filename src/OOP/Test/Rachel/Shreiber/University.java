package OOP.Test.Rachel.Shreiber;

import java.util.List;

// Main class for demonstrating the university system
public class University {

    public static void main(String[] args) {

        // Creating instances of Students
        Student student1=new Student("Avi",20,"Ezra","123");
        Student student2=new Student("Daniel",32,"Ertzog","345");

        // Creating instances of Professors
        Professor professor1=new Professor("Gad",45,"Tverya","Computer Science");
        Professor professor2=new Professor("Dan",60,"Hevron","Social");

        // Creating an Undergraduate Course instance
        Course undergraduateCourse=new UndergraduateCourse("Computer Science intro","887");

        // Creating an Graduate Course instance
        Course graduateCourse=new GraduateCourse("the lower class","Social intro","766");


        undergraduateCourse.addParticipant(student1);
        undergraduateCourse.addParticipant(student2);
        undergraduateCourse.addParticipant(professor1);

        graduateCourse.addParticipant(student1);
        graduateCourse.addParticipant(student2);
        graduateCourse.addParticipant(professor2);


        // Getting the participants and displaying their details
        List<Person> participantsUndergraduateCourse=undergraduateCourse.getParticipants();
        List<Person> participantsGraduateCourse=graduateCourse.getParticipants();

        System.out.println("------participans in Undergraduate Course");
        for (Person participan:participantsUndergraduateCourse){
            System.out.println("name: "+participan.getName()+" , age:"+participan.getAge()+" , address:"+participan.getAddress()+
                    " , role:"+participan.getRole());
        }
        System.out.println("------participans in Graduate Course");
        for (Person participan:participantsGraduateCourse){
            System.out.println("name: "+participan.getName()+" , age:"+participan.getAge()+" , address:"+participan.getAddress()+
                    " , role:"+participan.getRole());
        }
    }
}
