public class doubleTheNumber {

    static public void makeLine() {
        System.out.println("\n******************************************************\n");
    }

    static public int doublethenumber(int n) {
        for ( int i=0; i<5; i++ )
        {
        System.out.println("Hello");
        }
        return n * 2;
    }


    static public void main(String[] args) {

        makeLine();

        System.out.println("WTF, over?");

        makeLine();

        doublethenumber(2);

        makeLine();

        doublethenumber(2);

        makeLine();
    }

}
