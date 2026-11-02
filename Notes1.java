public class Notes1 {


    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // boolean operators
        // ==
        int a = 3;
        int b = 4;
        // boolean expression a == b
        // Peek.at(a==b);

        String name = new String("John");
        String otherName = new String("John");
        otherName = new String("Ed");
        // int nameInt = Integer.parseInt(otherName);

        Peek.at(name == otherName);

        String anotherName = name;
        Peek.at(name == anotherName);

        // != not equal

        Peek.at(4 != 4); // false
        Peek.at(7 != 9); // true

        // other numeric comparison
        // Relational/Comparitor operators
        // > greater than, < less than, >= greater than or equal to, <= less than or equal to
        Peek.at(2 < 10); // true
        Peek.at(19 + 4 > 34 - 2); // 
        // (23 > 34 - 2)
        // (23 > 32)
        // false

        boolean result = a + 12 * 4 != b - 8 / 2;

        // divisibilty
        // is a number divisible by 3
        int q = 4;
        boolean divisibleByThree = q % 3 == 0;
        Peek.at("The number " + q + " is divisible by 3: " + divisibleByThree); 
    }

    /*
    
    In this activity, you will write a Java program that uses boolean expressions to determine 
    if a number is prime. A prime number is an integer number that is only divisible by 1 and itself. 
    For example, 3 is a prime number because it’s only divisible by 1 and 3 and no other numbers, 
    but 4 is not a prime number because it’s divisible by 2 as well as 1 and 4. 
    You will write methods that test whether a number is positive, negative, odd, even, 
    and divisible by another number. You will then experiment with these methods to determine 
    if the numbers 5, 6, and 7 are prime. And to ask questions about prime numbers like whether all odd numbers are prime.
    
    
    */

}
