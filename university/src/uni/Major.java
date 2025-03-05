package uni;

import java.util.ArrayList;

public class Major{
    public int majorID;
    public String name;
    public final int maxCapacity ;
    public static int numberOfStudent = 0;
    public static ArrayList<Major> majorList = new ArrayList<>();

    public Major(String newMajName, int newMaxStudentNumber) {
        this.name = newMajName;
        this.maxCapacity = newMaxStudentNumber;
        majorList.add(this);
        this.majorID = majorList.size();

    }

    public static Major findByID (int newMajID){
        for (Major major : majorList)
            if (major.majorID == newMajID)
                return major;
        return null;
    }

    public  void addStudent() {
        numberOfStudent++;
        if (numberOfStudent == maxCapacity)
            System.out.println("The major is currently at full capacity for this intake period.");
    }
}
