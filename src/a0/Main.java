package a0;

public class Main {
    public static void main(String[] args) {
        // Prints out your Java version
        // Make sure it is 10.0 or higher
        System.out.println("Your Java version: " + System.getProperty(("java.version")));

        // Task 2 here
        System.out.println(helloWorld());
    }

    // Task 1 here
    public static String helloWorld(){
        return "Hello World";
    }


}
