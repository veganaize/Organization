import java.util.ArrayList;

class Department implements Identifiable {

    ArrayList<Person> personnel = new ArrayList<>();
    Identity identity = new Identity();
    
    void name(String string) { identity.name(string); }
    void id(String string) { identity.id(string); }
    
    public String nameAsString() { return identity.nameAsString(); }
    public String idAsString() { return identity.idAsString(); }
    
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