package Calculator;
import java.util.*;
public class Calculator {
    public static void main(String args[]) {
        double num1, num2;
        char op;
        double res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        System.out.println("Enter an operator to perform operation(+,-,*,/)");
         op= sc.next().charAt(0);
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res  = num1 / num2;
                break;
            default:
                System.out.println("You have entered wrong operator");
                return;
        }
        System.out.println("The result is:");
        System.out.println(num1 + " " + op + " " + num2 + " = " +res) ;
    }
}
