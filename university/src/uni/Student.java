package uni;
import java.util.ArrayList;

public class Student{
    public int studentID;
    public String studentCode;
    public int  majorID;
    public final int entranceYear;
    public int personID;
    public static ArrayList<Student> studentList = new ArrayList<>();

    public Student (int  newPersonalID, int newMajorID, int newEntranceYear ) {
        this.personID = newPersonalID;
        this.entranceYear = newEntranceYear;
        this.majorID = newMajorID;
        Major major = Major.findByID(newMajorID);
        if (major != null)
            major.addStudent();
        studentList.add(this);
        this.studentID = studentList.size();
        this.setStudentCode();

    }

    public static Student findByID (int newStID){
        for (Student student : studentList)
            if (student.studentID == newStID)
                return student;
        return null;
    }

    public void setStudentCode() {
        studentCode = String.valueOf(entranceYear) + "0" + String.valueOf(majorID) + "0" + String.valueOf((studentList.size()));
    }
}