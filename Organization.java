import java.util.ArrayList;

class Organization implements Identifiable, Addressable {

    Identity identity = new Identity();
    Address address = new Address();
    
    ArrayList<Person> persons = new ArrayList<>();
    ArrayList<Department> departments = new ArrayList<>();

    public String nameAsString() { return identity.nameAsString(); }
    public String idAsString() { return identity.idAsString(); }
    public String address() { return address.address(); }
    public void address(String string) { address.address(string); };
    
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
