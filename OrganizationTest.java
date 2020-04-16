public class OrganizationTest {

    public static void main(String[] args) {
    
        Person person = new Person();
        person.name = "Person's Name Here";
        person.id = "THX-1138";
        person.address = "1234 Some Road";
        person.mobileNumber = "555-555-5555";
        person.email = "person@example.com";
        person.salary = "$80,000";

        Organization organization = new Organization();
        organization.addPerson(person);
        
        Department department = new Department();
        department.name = "Dept Zero";
        department.id = "OMM-0000";
        
        organization.addDepartment(department);
        
        System.out.println("Organization has these people: "
                + organization.peopleAsString());
        System.out.println("Organization has these departments: "
                + organization.departmentsAsString());
                
    }

}
