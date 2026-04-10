public class FactorialExample {
    public static void main(String[] args) {
        int number = 5; // Hardcoded number to find factorial
        long fact = 1;
        
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

