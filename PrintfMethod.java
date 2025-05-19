// printf() = an optional method to control, format, and display text to the console window
//  two arguments = format string + (object/ variable/ value)
//  % [flags] [precision] [width] [conversion-character]

public class PrintfMethod {

    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "My Bro";
        int myInt = 50;
        double mydouble = 1.1;

        // (conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", mydouble);

        //{width}
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s", myString);

        // (precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("you have this much money %.1f", mydouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        //  - : left-justify
        //  + : output a plus ( + ) or minus ( - ) sign for a numeric value  
        //0 : numeric values are zero-padded
        // , : coma goupping seprator if numbers > 1000
        System.out.printf("you have this much money Z, f", mydouble);
    }
}
