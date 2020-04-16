import java.util.ArrayList;

public class Organization {

    String name;
    String address;
    String id;

    ArrayList<Person> persons = new ArrayList<>();
    ArrayList<Department> departments = new ArrayList<>();

    void addPerson(Person person) {
        persons.add(person);
    }

    void addDepartment(Department department) {
        departments.add(department);
    }
    
    String peopleAsString() {
        String string = "";
        for (Person person : persons) {
            string += "\n";
            string += "Name: " + person.name + "\n";
            string += "ID: " + person.id + "\n";
            string += "Email: " + person.email + "\n";
        }
        
        return string;
    }

    String departmentsAsString() {
        String string = "";
        for (Department department : departments) {
            string += "\n";
            string += "Department Name: " + department.name + "\n";
            string += "Department ID: " + department.id + "\n";
        }
        
        return string;
    }
}
