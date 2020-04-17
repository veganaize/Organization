public class Person extends Identity {

    String address;
    String mobileNumber;
    String email;
    String salary;
    
    String asString() {        
        String string = "\n";
        string += "Name: " + nameAsString() + "\n";
        string += "ID: " + idAsString() + "\n";
        string += "Email: " + email + "\n";
        
        return string;
    }

}