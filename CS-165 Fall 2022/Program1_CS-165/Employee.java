/*

The Employee class

The Employee class extends the Person class; it is a subclass of Person. You will need to fill out another field in this class and make a new toString() method which uses the parent class's toString(). Remember that to call a parent class's methods, you can use super, as in super.someCoolParentMethod().

TO DO in this class:
- Add an "employer" field to the class, and set it from the constructor
- Make a toString() method that follows the format specified in the comments

*/

public class Employee extends Person {
    // An Employee IS A Person. It contains all of the data from Person, but a
    // little bit more.
    private long salary;

    /* YOUR CODE HERE 
     * It would make sense to record the company that this person
     * works for as well. Under this comment, declare a new String field called
     * "employer", and update the constructor below so that we can set it when
     * we construct a new Employee object.
     *
     * Make your new employer parameter the LAST parameter in the constructor.
     */

    // JLF
    private String employer;

    // JLF
    public Employee(String name, int age, long salary, String employer /* fourth param here */) {
        super(name, age);
        this.salary = salary;
        /* ... more code here! */
        this.employer = employer;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    // Getters and setters for the new "employer" field.
    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }
   
    /* YOUR CODE HERE
     * Create a new toString that prints in the following format:
     * "<name> is <age> years old. They make $<salary> a year at <employer>."
     * Try to use super.toString().
     */

    // JLF
    public String toString() {
       
        return super.toString() + String.format("  They make $%d a year at %s.", salary, employer);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Samir", 28, 120000, "Initech");
        System.out.println(e.toString());
    }
}
