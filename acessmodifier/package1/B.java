package acessmodifier.package1;

public class B {

    @SuppressWarnings("FieldMayBeFinal")
    private String privateMessage = "This is private";

    public void printMessage() {
        System.out.println(privateMessage);
    }

    public static void main(String[] args) {
        B b = new B();
        b.printMessage();
    }
}
