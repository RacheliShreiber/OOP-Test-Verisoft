package OOP.Test.Rachel.Shreiber;

import java.util.ArrayList;
import java.util.List;

// Class representing an Undergraduate Course implementing the Course interface
public class UndergraduateCourse implements Course{

    private String courseName;
    private String courseCode;
    private List<Person> participantsUndergraduateCourse=new ArrayList<>();

    // Constructor
    public UndergraduateCourse(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Implementing interface methods
    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public void addParticipant(Person person) {
        participantsUndergraduateCourse.add(person);
    }

    @Override
    public List<Person> getParticipants() {
        return participantsUndergraduateCourse;
    }
}
