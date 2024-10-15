package OOP.Test.Rachel.Shreiber;

import java.util.List;

// Interface representing a Course
public interface Course {

    public String getCourseName();

    public String getCourseCode();

    public void addParticipant(Person person);

    public List<Person> getParticipants();
}
