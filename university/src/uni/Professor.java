package uni;
import java.util.ArrayList;

public class Professor{
    public int majorID;
    public int personID;
    public int professorID;
    public static ArrayList<Professor> professorList = new ArrayList<>();

    public Professor (int  newPersonalID, int newMajorID ) {
        this.personID = newPersonalID;
        this.majorID = newMajorID;
        professorList.add(this);
        this.professorID = professorList.size();
    }

    public static Professor findByID (int newProID){
        for (Professor professor : professorList)
            if (professor.professorID == newProID)
                return professor;
        return null;
    }
}
