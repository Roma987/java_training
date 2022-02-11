package main.java.com.prokopchik;

public class Logic {

    public boolean sumFirstAndlLastTwo(int number) {
        int number1;
        int number2;
        number1 = number % 10;
        number2 = number / 10 % 10;
        int sum1 = number1 + number2;
        number1 = number / 100 % 10;
        number2 = number / 1000 % 10;
        int sum2 = number1 + number2;
        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateFormula(double number, double number2, double number3) {
        double d = (number2 + Math.sqrt(Math.pow(number2, 2)) + 4 * number * number3);
        double v = 2 * number;
        double x = Math.pow(number, 3) * number3;
        double sum = d / v - x + Math.pow(number2, -2);
        return sum;
    }

    public double calculatePerimeter(double number, double number2) {
        double c = Math.sqrt(Math.pow(number, 2) + Math.pow(number2, 2));
        double p = number + number2 + c;
        return p;
    }

    public  double calculateSquare(double number, double number2) {
        double s = (number * number2) / 2;
        return s;
    }
}

