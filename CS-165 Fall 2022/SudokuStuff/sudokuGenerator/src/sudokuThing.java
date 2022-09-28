public class sudokuThing {
    int[][] theArray = new int[9][9];
    public void makeLine() {
        System.out.println("\n-----------------------------------------\n");
    }

    public void showArray(int[][] ta) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(ta[i][j] + "  ");
            }
            System.out.println();
        }
    }// end of showArray

    public static void main(String[] args) {
        sudokuThing s = new sudokuThing();
        s.makeLine();
        System.out.println("Hello World!");
        s.showArray(s.theArray);
        s.makeLine();
    }
}
