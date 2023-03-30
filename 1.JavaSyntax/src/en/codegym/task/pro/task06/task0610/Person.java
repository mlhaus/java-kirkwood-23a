package en.codegym.task.pro.task06.task0610;

public class Person {
    // instance variables, member variables, fields
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
//        return firstName + " " + lastName;
        return String.format("%s %s", firstName, lastName);
    }
}
