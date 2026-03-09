import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        int[] arrSpendingInMonth = {100_000, 105_000, 110_000, 107_000, 103_000};
        int sumSpending = 0;

        for (int spending : arrSpendingInMonth) {
            sumSpending += spending;
        }

        System.out.println("Сумма трат за месяц составила " + sumSpending + " рублей");

        //Task 2
        System.out.println("Task 2");

        int maxSpending = Integer.MIN_VALUE;
        int minSpending = Integer.MAX_VALUE;

        for (int spending : arrSpendingInMonth) {
            if (maxSpending < spending) {
                maxSpending = spending;
            }
            if (minSpending > spending) {
                minSpending = spending;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxSpending + " рублей");

        //Task 3
        System.out.println("Task 3");

        sumSpending = 0;

        for (int spending : arrSpendingInMonth) {
            sumSpending += spending;
        }

        double midlleSpending = (double) sumSpending / arrSpendingInMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + midlleSpending + " рублей");

        //Task 4
        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int index = 0; index < reverseFullName.length / 2; index++) {
            char meaning = reverseFullName[index];
            reverseFullName[index] = reverseFullName[reverseFullName.length - 1 - index];
            reverseFullName[reverseFullName.length - 1 - index] = meaning;
        }

        for (char name : reverseFullName) {
            System.out.print(name);
        }
    }
}