import base.*;
import uni.*;

public class Main {
    public static void main(String[] args) {
        Major major1 = new Major("Computer Science", 26);
        Major major2 = new Major("Electrical Engineering", 34);

        Person person1 = new Person("Saba Maghsoudi", "6838291991");
        Person person2 = new Person("Aynaz Vazirian", "7391850481");
        Person person3 = new Person("Sara Shamsi", "8376084173");
        Person person4 = new Person("Yasamin Alibabie", "4328767591");
        Person person5 = new Person("Fatemeh Taefi", "4569879817");


        Student student1 = new Student(person1.personID, major1.majorID, 403 );
        Student student2 = new Student(person2.personID, major1.majorID, 404 );
        Student student3 = new Student(person3.personID, major2.majorID,403 );

        System.out.println("Students:");
        System.out.println("Name: " + person1.name + "       " + "StudentCode:" + student1.studentCode);
        System.out.println("Name: " + person2.name + "       " + "StudentCode:" + student2.studentCode);
        System.out.println("Name: " + person3.name + "          " + "StudentCode:" + student3.studentCode);
        System.out.println();

        Professor professor1 = new Professor(person4.personID, major1.majorID );
        Professor professor2 = new Professor(person5.personID, major2.majorID);

        System.out.println("Professors:");
        System.out.println("Name: " + person4.name + "     " + "ProfessorID:" + professor1.professorID);
        System.out.println("Name: " + person5.name + "        " + "ProfessorID:" + professor2.professorID);
        System.out.println();

        Course course1 = new Course("Basic Programming", 4);
        Course course2 = new Course("literature", 3);
        Course course3 = new Course("Advanced Programming", 4);


        PresentedCourse presentedCourse1 = new PresentedCourse(course1.courseID, professor1.professorID,  28);
        PresentedCourse presentedCourse2 = new PresentedCourse(course2.courseID, professor1.professorID,40 );
        PresentedCourse presentedCourse3 = new PresentedCourse(course3.courseID, professor2.professorID, 32);

        presentedCourse3.addStudent(student3.studentID);
        presentedCourse2.addStudent(student3.studentID);
        presentedCourse2.addStudent(student2.studentID);
        presentedCourse2.addStudent(student1.studentID);
        presentedCourse1.addStudent(student1.studentID);
        presentedCourse1.addStudent(student2.studentID);


        Transcript transcript2 = new Transcript(student2.studentID);
        Transcript transcript1 = new Transcript(student1.studentID);
        Transcript transcript3 = new Transcript(student3.studentID);

        transcript1.setGrade(presentedCourse1.presentedCourseID, 16.78);
        transcript1.setGrade(presentedCourse2.presentedCourseID, 19.5);
        transcript2.setGrade(presentedCourse1.presentedCourseID, 19.89);
        transcript2.setGrade(presentedCourse2.presentedCourseID, 17);
        transcript3.setGrade(presentedCourse3.presentedCourseID, 19.48);
        transcript3.setGrade(presentedCourse2.presentedCourseID, 17.94);

        System.out.println("Transcripts:");
        transcript1.printTranscript();
        System.out.println();
        transcript2.printTranscript();
        System.out.println();
        transcript3.printTranscript();
        System.out.println();

        System.out.println("GPAs:");
        System.out.println("GPA for student1: " + transcript1.getGPA());
        System.out.println("GPA for student2: " + transcript2.getGPA());
        System.out.println("GPA for student3: " + transcript3.getGPA());


    }
}

