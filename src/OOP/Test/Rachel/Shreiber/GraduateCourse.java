package OOP.Test.Rachel.Shreiber;

import java.util.ArrayList;
import java.util.List;

// Class representing a Graduate Course implementing the Course interface
public class GraduateCourse implements Course{

    private String researchFocus;
    private String courseName;
    private String courseCode;
    private List<Person> participantsGraduateCourse=new ArrayList<>();

    // Constructor
    public GraduateCourse(String researchFocus, String courseName, String courseCode) {
        this.researchFocus = researchFocus;
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
        participantsGraduateCourse.add(person);
    }

    @Override
    public List<Person> getParticipants() {
        return participantsGraduateCourse;
    }
}
