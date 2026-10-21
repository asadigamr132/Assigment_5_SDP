import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Please enter operation(+ - / *): ");
        scanner.nextLine();
        String operation = scanner.nextLine();
        Calculator calculator = new Calculator(new PlusStrategy());
        if (operation.equals("+")){
            System.out.println(calculator.calculate(a,b));
        }
        else if (operation.equals("-")){
            calculator.setStrategy(new MinusStrategy());
            System.out.println(calculator.calculate(a,b));
        }
        else if (operation.equals("*")){
            calculator.setStrategy(new MultiplyStrategy());
            System.out.println(calculator.calculate(a,b));
        }
        else if (operation.equals("/")){
            if(b == 0){
                System.out.println("It is not possible to divide by 0");
            }
            else {
                calculator.setStrategy(new DivideStrategy());
                System.out.println(calculator.calculate(a, b));
            }
        }
        else{
            System.out.println("you wrote wrong operation");
        }
    }
}
