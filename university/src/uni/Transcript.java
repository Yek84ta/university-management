package uni;
import base.Person;
import java.util.HashMap;
import java.util.Map;

public class Transcript{
    public int studentID;
    public Map<Integer, Double> transcript;

    public Transcript ( int newStudentID) {
        studentID = newStudentID;
        transcript = new HashMap<>();
    }

    public void setGrade(int newPresentedCourseID, double newGrade) {
        PresentedCourse wantedCourse = PresentedCourse.findByID(newPresentedCourseID);

        if (wantedCourse == null) {
            System.out.println("Course not found.");
            return;
        }

        if (wantedCourse.studentIDList.contains(studentID)) {
            this.transcript.put(newPresentedCourseID, newGrade);
        } else {
            System.out.println("Mentioned student doesn't have this course.");
        }
    }

    public void printTranscript() {
        Student student = Student.findByID(studentID);
        Person person = Person.findByID(student.personID);

        System.out.println("Name: " + person.name);
        System.out.println("StudentID: " + student.studentCode);
        System.out.println("Courses and Grades:");

        for (Map.Entry<Integer, Double> entry : transcript.entrySet()) {
            int presentedCourseID = entry.getKey();
            double grade = entry.getValue();

            PresentedCourse presentedCourse = PresentedCourse.findByID(presentedCourseID);
            if (presentedCourse != null) {
                Course course = Course.findByID(presentedCourse.courseID);
                if (course != null) {
                    System.out.println("Course: " + course.title + " | Grade: " + grade);
                }
            }
        }
    }

    public double getGPA() {
        double sum = 0;
        int totalUnits = 0;

        for (Map.Entry<Integer, Double> entry : transcript.entrySet()) {
            int presentedCourseID = entry.getKey();
            double grade = entry.getValue();


            PresentedCourse presentedCourse = PresentedCourse.findByID(presentedCourseID);
            if (presentedCourse != null) {
                Course course = Course.findByID(presentedCourse.courseID);
                if (course != null) {
                    sum += grade * course.units;
                    totalUnits += course.units;
                }
            }
        }

        if (totalUnits == 0) {
            System.out.println("No courses found for GPA calculation.");
            return 0;
        }


        double average = sum / totalUnits;
        return average;
    }


}
