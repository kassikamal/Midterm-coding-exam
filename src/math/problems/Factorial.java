//recursion
package math.problems;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }

    public static long multiplyNumbers(int num) {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}

//iteration
package math.problems;
public class Factorial {

    public static long factorial(int n)
    {
        long fact = 1;
        for (int i = 1; i <= n; i++); {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int n =5;

        System.out.println("The Factorial of " + n + " is " + factorial(n));


    }
}


