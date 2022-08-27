public class Person {

    /*
     The Person class

    We start with a Person class, which simply stores a name and an age. It also has some getters, which provide access to the private name and age variables. The class should have setters too; it is your job to write those.

    TO DO in this class:
    - Finish the setters for name and age  

    */

    // Every person needs, minimally, a name and an age.
    private String name;
    private int age;

    // We can build a person with a specific name and age with this constructor.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Since the fields for name and age are private, we need getters and
    // setters if we want people to be able to change and access them.
    public String getName() {
        return this.name;
    }

    public int getAge() { 
        return age;
    }

    /* YOUR CODE HERE
     * Create setters for name and age somewhere below this comment.
     * Make sure they are called "setName" and "setAge".
     * What should they return? What should their parameters be?
     */

    // -----------------------------------------------------------------------------
    // 20220826  -  JLF

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // -----------------------------------------------------------------------------

    public String toString() {
        return String.format("%s is %d years old.", name, age);
    }

    public static void main(String[] args) {
        Person jim = new Person("Jim", 22);
        System.out.println(jim.toString());
        jim.setName("John");
        jim.setAge(30);
        System.out.println(jim.toString());
    }
}