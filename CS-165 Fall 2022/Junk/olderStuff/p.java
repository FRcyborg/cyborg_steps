/*
    Stupid pyramid.  The issue was to make a double you have to change 1 to 1.0.  Casting
    1/3 as a double don't work.  Stupid java.
*/
public class p {

    public static double CalcPyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {

        double vol;
//        next line no workie
//        double ratio = (double)(1/3);
        double ratio = 1.0/3;
/*
        System.out.println("baseLength => " + baseLength);
        System.out.println("baseWidth => " + baseWidth);
        System.out.println("pyramidHeight => " + pyramidHeight);
        System.out.println("ratio => " + ratio);
*/
        vol = baseLength * baseWidth * pyramidHeight * ratio;
        System.out.println("vol => " + vol);

        return vol;
    }  // end of CalcPyramidVolume()



    public static void main(String[] args) {

        double baseLength = 3.0;
        double baseWidth = 3.0;
        double pyramidHeight = 3.0;
/*
        double baseLength = 1.0;
        double baseWidth = 1.0;
        double pyramidHeight = 1.0;
*/
        System.out.println("vol = " + CalcPyramidVolume(baseLength, baseWidth, pyramidHeight) );

    } // end of main


} // end of class
