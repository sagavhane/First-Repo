package day17;

public class LinearSearchDemo4 {

    public static void main(String[] args) {

        int income[] = {100, 200, 500, 1000, 200, 800};

        int target = 1500;

        int day = weeklyIncomeTarget(income, target);

        if (day != -1) {
            System.out.println("Target achieved on day " + (day + 1));
        } else {
            System.out.println("Target not achieved");
        }
    }

    public static int weeklyIncomeTarget(int[] income, int target) {

        int sum = 0;

        for (int i = 0; i < income.length; i++) {

            sum = sum+income[i];

            if (sum >= target) {
                return i;
            }
        }

        return -1;
    }
}