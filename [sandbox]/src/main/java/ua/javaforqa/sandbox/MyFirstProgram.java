package ua.javaforqa.sandbox;

public class MyFirstProgram {
	
	public static void main (String[] args) {
        hello("world");
        hello("user");
        hello("QA");

        double l = 5;
        System.out.println("Площать квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println( "Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l) {
        return l * l;
    }
    public static double area(double a, double b) {
        return a * b;
    }

}
