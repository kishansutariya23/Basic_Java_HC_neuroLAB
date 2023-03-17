public class DataType {
    public static void main(String[] args){
        // primitive datatypes
        /*
            byte ---> -128 : 127
            short --> -34768 : 32767
            int --> 
            long --> 2^63

            float --> 231.2f
            double --> 231.23
            boolean --> true/false
            char  --> 1 character -->'a'
        */

        byte myByte = 55;
        System.out.println(myByte);

        // int ; float ; double

        int mInt = 22/7;
        float mFloat = 22/7f;  // best practice is use 7f instead of just 7   it indicates float
        double mDouble = 22/7d; // best practice is use 7d instead of just 7  it indicates double

        System.out.println("Int value is: "+ mInt);
        System.out.println("Float value is: "+mFloat);
        System.out.println("Double value is: "+mDouble);


        // unicode and booleans

        boolean isActive = false;
        // used in if else condition
        System.out.println(isActive);

        char mChar = 'A';   // unicode 
        String myValue = Integer.toHexString(mChar);
        System.out.println(mChar +"="+ myValue);

        char mUniCode = '\u0081';
        System.out.println(mUniCode);
    }
}
