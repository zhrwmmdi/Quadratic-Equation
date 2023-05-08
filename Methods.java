package org.example;
import java.util.Scanner;
public class Methods {
    static float a , b, c;
    public static void getItems(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b and c in the target quadratic equation:");
        try{
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();
            if (a == 0) throw new Exception();
        }catch(Exception x){
            boolean p = true;
            while (p){
                System.out.println("WARNING! a can not be zero in a quadratic equation!\nEnter a valid value for a in the target quadratic equation:");
                a = input.nextFloat();
                if(a != 0) p = false;
            }
        }
        solveEquation();
    }
    public static void solveEquation(){
        if(b == 0){
            System.out.printf("Your target equation is %+.2f x^2 %+.2f = 0%n",a,c);
        } else if (c == 0) {
            System.out.printf("Your target equation is %+.2f x^2 %+.2f x = 0%n",a,b);
        }else System.out.printf("Your target equation is %+.2f x^2 %+.2f x %+.2f = 0%n",a,b,c);

        float delta = (float) ((Math.pow(b, 2)) - (4 * a * c));
        if (delta > 0) {
            float x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            float x2 = (float)((-b - Math.sqrt(delta)) / (2*a));
            System.out.printf("The answers are\tx1 = %.2f\tx2 = %.2f", x1, x2);

        } else if (delta == 0) {
            float x = (-b / 2*a);
            System.out.printf("The answer is\tx = %.2f", x);

        } else {
            float deltaPlus = (float) Math.sqrt((-1)*(delta));
            float k = deltaPlus/2*a;
            String K = String.format("%.2f",k);
            float l = -b/(2*a);
            String L = String.format("%.2f",l);
            if(l==0) {
                String x1 = " + "+ K+"i";
                String x2 = " - "+ K+"i";
                System.out.printf("The answers are\tx1 = %s\tx2 = %s", x1, x2);
            }else {
                String x1 = L + " + " + k + "i";
                String x2 = L + " - " + k + "i";
                System.out.printf("The answers are\tx1 = %s\tx2 = %s", x1, x2);
            }
        }
    }
}
