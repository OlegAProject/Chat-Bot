package bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void acquaintance(String botName, String birthYear) {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    public static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    public static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");

        List<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < 3 && scanner.hasNextInt()) {
            list.add(scanner.nextInt());
            i++;
        }
        int age = (list.get(0) * 70 + list.get(1) * 21 + list.get(2) * 15) % 105;

        System.out.println("Your age is " + age + " that's a good time to start programming!");
    }

    public static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    public static void question() {
        System.out.println("Do you want to check your knowledges? (Y|N)");
        String answer = scanner.next();
        if (answer.equals("Y")) {

            System.out.println("Let's test your programming knowledge.");
            System.out.println("Why do we use methods?");
            System.out.println("1. To repeat a statement multiple times.");
            System.out.println("2. To decompose a program into several small subroutines.");
            System.out.println("3. To determine the execution time of a program.");
            System.out.println("4. To interrupt the execution of a program.");
            while(scanner.nextInt() != 2) {
                System.out.println("Please, try again.");
            }
        }
    }

    public static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}

