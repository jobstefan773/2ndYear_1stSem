import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> tables = new ArrayList<>();

    public static void main(String[] args) {

        // declarations
        Scanner userInput = new Scanner(System.in);
        String name;
        double salary;

        name = userInput.nextLine();
        salary = userInput.nextDouble();
        userInput.nextLine();
        Employee x = new Manager(name, salary);

        name = userInput.nextLine();
        salary = userInput.nextDouble();
        userInput.nextLine();
        Employee y = new Cashier(name, salary);

        int tableNum;
        double tip;
        boolean flag = true;
        String decision;
        name = userInput.nextLine();
        salary = userInput.nextDouble();
        userInput.nextLine();
        Employee z = new Waiter(name, salary);
        while (flag) {
            tableNum = userInput.nextInt();
            tip = userInput.nextDouble();
            userInput.nextLine();
            tables.add(tableNum);
            ((Waiter) z).totalSalary(tip);
            decision = userInput.nextLine();
            switch (decision.toUpperCase()) {
                case "Y":
                    continue;
                case "N":
                    flag = false;
            }
        }

        userInput.close();

        // OUTPUT----------------------------------------------
        System.out.println(x.getName() + " is the new manager of " + x.getBarName() + " and has a salary of "
                + ((Manager) x).getSalary());
        System.out.println(y.getName() + " is the new cashier of " + y.getBarName() + " and has a salary of "
                + ((Cashier) y).getSalary());
        System.out.println(z.getName() + " is the waiter of " + z.getBarName() + " and has a salary of "
                + ((Waiter) z).getTotalSalary());
        System.out.print(z.getName() + " serviced the following table(s) ");
        for (int i = 0; i < tables.size(); i++) {
            if ((i + 1) < tables.size()) {
                System.out.print(tables.get(i) + ", ");
            } else if ((i + 1) == tables.size()) {
                System.out.print(tables.get(i));
            }
        }
        System.out.println("\n" + y.getName() + " has taken a total of " + tables.size() + " order(s)");
    }
}