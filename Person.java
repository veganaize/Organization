class Person implements Identifiable {

    String address;
    String mobileNumber;
    String email;
    String salary;
    
    Identity identity = new Identity();
    
    void name(String string) { identity.name(string); }
    void id(String string) { identity.id(string); }
    
    public String nameAsString() { return identity.nameAsString(); }
    public String idAsString() { return identity.idAsString(); }
    
    String asString() {        
        String string = "\n";
        string += "Name: " + nameAsString() + "\n";
        string += "ID: " + idAsString() + "\n";
        string += "Email: " + email + "\n";
        
        return string;
    }
}