class Person implements Identifiable, Addressable {

    String mobileNumber;
    String email;
    String salary;
    
    Identity identity = new Identity();
    Address address = new Address();
    
    void name(String string) { identity.name(string); }
    void id(String string) { identity.id(string); }
    public void address(String string) { address.address(string); }
    
    public String nameAsString() { return identity.nameAsString(); }
    public String idAsString() { return identity.idAsString(); }
    public String address() { return address(); }
    
    String asString() {        
        String string = "\n";
        string += "Name: " + nameAsString() + "\n";
        string += "ID: " + idAsString() + "\n";
        string += "Email: " + email + "\n";
        
        return string;
    }
}