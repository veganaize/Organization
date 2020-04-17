import java.util.ArrayList;

public class Organization extends Identity {

    String address;

    ArrayList<Person> persons = new ArrayList<>();
    ArrayList<Department> departments = new ArrayList<>();

    void add(Person person) {
        persons.add(person);
    }

    void add(Department department) {
        departments.add(department);
    }
    
    String peopleAsString() {
        String string = "";
        for (Person person : persons) {
            string += person.asString();
        }
        
        return string;
    }

    String departmentsAsString() {
        String string = "";
        for (Department department : departments) {
            string += "\n";
            string += "Department Name: " + department.nameAsString() + "\n";
            string += "Department ID: " + department.idAsString() + "\n";
            string += "Department Personnel: " + department.personsAsString() + "\n";
        }
        
        return string;
    }
}
