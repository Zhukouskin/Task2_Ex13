package Task2Ex13;
/*
Написать программу калькулятор,
который умеет складывать и делить с консольным меню.
Выход из программы осуществляется введением символа q
 */
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static double getInt() {
        System.out.println("Введите число : ");
        double n;
        n = sc.nextInt();
        return n;
    }

    public static char getAct() {
        System.out.println("Выберите действие : ");
        System.out.println("+ - сложение");
        System.out.println("/ - деление");
        System.out.println("q - выход");

        char act;
        if (sc.hasNext()) {
            act = sc.next().charAt(0);
        } else {
            System.out.println("Вы ввели неверное действие , повторите ввод :");
            sc.next();
            act = getAct();

        }

        return act;
    }


    public static double calc (double n1, double n2, char Act) {
        double result;

        switch (Act) {
            case '+':
                result = n1 + n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            case 'q':
                System.exit(0);
            default:
                System.out.println("Данной операции нет . Повторите ввод.");
                result = calc(n1, n2, getAct());
        }
        return result;
    }



    public static void main(String[] args) {


        double n1 = getInt();
        double n2 = getInt();
        char act = getAct();
        double result = calc(n1 , n2 , act);

        System.out.println("Результат : " + result);
        }
    }