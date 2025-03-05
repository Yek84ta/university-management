package base;

import java.util.ArrayList;

public class  Person {
    public int personID;
    public String name;
    public String nationalID;
    public static ArrayList<Person> personList = new ArrayList<>();

    public Person(String newPerName, String newPerNationalID) {
        this.name = newPerName;
        this.nationalID = newPerNationalID;
        personList.add(this);
        this.personID = personList.size();
    }

    public static Person findByID (int newPerID){
        for (Person person : personList)
            if (person.personID == newPerID)
                return person ;
        return null;
    }
}
