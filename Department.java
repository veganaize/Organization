import java.util.ArrayList;

public class Department extends Identity {

    ArrayList<Person> personnel = new ArrayList<>();
    
    void add(Person person) {
        personnel.add(person);
    }
    
    void remove(Person person) {
        personnel.remove(person);
    }

    String personsAsString() {
        String string = "";
        for (Person person : personnel)
            string += person.asString();
        
        return string;
    }
}