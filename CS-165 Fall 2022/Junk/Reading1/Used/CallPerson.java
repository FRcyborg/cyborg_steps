public class CallPerson {
    public static void main(String[] args) {
        String userName;
        Person person1 = new Person();

        userName = "Ron";

        person1.setFirstName(userName);
        System.out.print("\nYou are " + person1.getFirstName() + "\n");
    }
}


