public class countDownTimer {

    public static void countDown(int countInt) {

        if (countInt <= 0) {
            System.out.println("Go!");
        }
        else {
            System.out.println(countInt);
            countDown(countInt - 1);
        }


    } // end of countDown


    public static void main(String[] args) {

       countDown(7); 


    } // end of main



} // end of class
