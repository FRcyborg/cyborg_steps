
public class part3 {

/*
    public static void rec2(int i){
        if (i==0) {
            System.out.print(i+" ");
        } else {
            for (int j=0; j<2; j++) {
                rec2(i-1);
                rec2(i-1);
            }
        }
    }
*/    
    public static void rec2(int i){
        if (i==0) {
            System.out.print(i+" ");
        }
        
        for (int j=0; j<2; j++) {
            rec2(i-1);
            rec2(i-1);
        }
    }
    


    public static void main(String[] args) {

        System.out.println();
        rec2(1);

        System.out.println();

    } // end of main













} // end of class














