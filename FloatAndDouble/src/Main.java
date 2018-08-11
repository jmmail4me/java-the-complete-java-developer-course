
public class Main {

    public static double pounds2kilograms(int pounds) {
        double ratio = 0.45359237;

        return pounds*ratio;
    }


        public static void main(String[] args) {
            // width of int =32
            int myIntValue = 5/3;

            // width of float = 32
            float myFloatValue = 5f/3;

            //width of double = 64
            double myDoubleValue =5d/3;

            System.out.println("myIntValue = " + myIntValue);
            System.out.println("myFloatValue = " + myFloatValue);
            System.out.println("myDoubleValue = " +myDoubleValue);


            int pounds = 0;
            double kilograms;




            kilograms = pounds2kilograms(pounds);
        }


}
