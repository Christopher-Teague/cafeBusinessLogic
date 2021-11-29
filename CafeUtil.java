import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numOfWeeks) {
        int sum = 0;
        for (int i = 1; i<= numOfWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sumOfPrices = 0;
        for (int i = 0; i < prices.length; i++) {
            sumOfPrices += prices[i];
        }
        return sumOfPrices;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        // Getters and Setters
        // String item1 = menuItems.get(0);
        // String item2 = menuItems.get(1);
        // String item3 = menuItems.get(2);
        // String item4 = menuItems.get(3);

        // System.out.println("0 " + item1);
        // System.out.println("1 " + item2);
        // System.out.println("2 " + item3);
        // System.out.println("3 " + item4);

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter you name:");
        String userName = System.console().readLine();
        System.out.println("Hello, "+ userName + "!");
        System.out.println("There are " + customers.size() +" people in front of you" );
        customers.add(userName);
        System.out.println(customers);


    }

}