package singleton.run;

import singleton.math_execute.MathExecute;

import java.util.Scanner;

public class RunMathExecute {
    public static void main(String[] args) {

        System.out.println();

        MathExecute math = MathExecute.getInstance();
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("b = ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("=> {");
        System.out.println("\t" + a + " + " + b + " = " + math.summation(a, b));
        System.out.println("\t" + a + " - " + b + " = " + math.subtraction(a, b));
        System.out.println("\t" + a + " * " + b + " = " + math.multiplication(a, b));
        if (b == 0)
            System.out.println("\tDivision by zero cannot be performed!");
        else
            System.out.println("\t" + a + " / " + b + " = " + math.division(a, b));
        System.out.println("}");
    }
}
