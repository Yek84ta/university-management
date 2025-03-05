package uni;
import java.util.ArrayList;

public class PresentedCourse{
    public int presentedCourseID;
    public int  courseID;
    public final int maxCapacity;//
    public int professorID;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public static ArrayList<Integer> studentIDList = new ArrayList<>();

    public PresentedCourse (int  newCouID, int newProID, int newMaxCap ) {
        this.courseID = newCouID;
        this.maxCapacity = newMaxCap;
        this.professorID = newProID;
        presentedCourseList.add(this);
        this.presentedCourseID = presentedCourseList.size();
        studentIDList.ensureCapacity(maxCapacity);
    }

    public static PresentedCourse findByID (int newPreCouID){
        for (PresentedCourse presentedCourse : presentedCourseList)
            if (presentedCourse.presentedCourseID == newPreCouID)
                return presentedCourse;
        return null;
    }

    public void addStudent(int newStudentID) {
        if (maxCapacity == studentIDList.size())
            System.out.println("The class is full.");
        else
            studentIDList.add(newStudentID);
    }

}