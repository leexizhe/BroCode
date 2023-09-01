package Basic;

public class Printf {
    public static void main(String[] args) {

        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000000;

        // [conversion-character]
        System.out.printf("%b",myBoolean);
        System.out.println("");
        System.out.printf("%c",myChar);
        System.out.println("");
        System.out.printf("%s",myString);
        System.out.println("");
        System.out.printf("%d",myInt);
        System.out.println("");
        System.out.printf("%f",myDouble);

        //[width]
        // minimum number of characters to be written as output
        System.out.println("");
        System.out.println("");
        System.out.printf("Hello %10s",myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.println("");
        System.out.println("");
        System.out.printf("You have this much money %.2f",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        System.out.println("");
        System.out.printf("You have this much money %-20f",myDouble);
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        System.out.println("");
        System.out.printf("You have this much money %+f",myDouble);
        // 0 : numeric values are zero-padded
        System.out.println("");
        System.out.printf("You have this much money %020f",myDouble);
        // , : comma grouping separator if numbers > 1000
        System.out.println("");
        System.out.printf("You have this much money %,.2f",myDouble);
    }
}
