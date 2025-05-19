
public class MethodOverloading {

    // overloaded methods! = methods that share the same name but have different parameters method signature method name + parameters
    public static void main(String[] args) {

        int x = add(1, 2, 3, 4);
        System.out.println(x);

        double y = add(1.1, 2.1, 3.1 , 4.1);

        System.out.println(y);

    }

    @SuppressWarnings("unused")
    static int add(int a, int b) {
        System.out.println("This is overload method #1");
        return a + b;
    }

    @SuppressWarnings("unused")
    static int add(int a, int b, int c) {
        System.out.println("This is overload method #1");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overload method #3");
        return a + b + c + d;
    }

    @SuppressWarnings("unused")
    static double add(double a, double b) {
        System.out.println("This is overload method #1");
        return a + b;
    }

    @SuppressWarnings("unused")
    static double add(double a, double b, double c) {
        System.out.println("This is overload method #2");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overload method #3");
        return a + b + c + d;
    }
}
