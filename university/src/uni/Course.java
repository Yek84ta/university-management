package uni;
import java.util.ArrayList;

public class Course{
    public int courseID;
    public int units;
    public String title;
    public static ArrayList<Course> courseList = new ArrayList<>();

    public Course (String  newTitle, int newUnits) {
        this.title = newTitle;
        this.units = newUnits;
        courseList.add(this);
        this.courseID = courseList.size();
    }

    public static Course findByID (int newCouID){
        for (Course course : courseList)
            if (course.courseID == newCouID)
                return course;
        return null;
    }
}
