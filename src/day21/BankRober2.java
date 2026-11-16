package day21;

public class BankRober2 {
    public static void main(String[] args) {

        int shifts[] = {0, 2, 2, 6, 6, 8, 9, 12};

        int time = 3;
        int totalBankHrs = 15;

        int unguarded = 0;

        for (int i = 1; i < shifts.length - 1; i += 2) {

            int currentEnd = shifts[i];
            int nextStart = shifts[i + 1];

            int gap = nextStart - currentEnd;

            if (gap > 0) {

                System.out.println("Gap = " + gap);

                unguarded += gap;
            }
        }

        
        int lastEnd = shifts[shifts.length - 1];

        if (lastEnd < totalBankHrs) {

            int gap = totalBankHrs - lastEnd;

            System.out.println("Last Gap = " + gap);

            unguarded += gap;
        }

        System.out.println("Total Unguarded Hours = " + unguarded);

        if (unguarded > time) {
            System.out.println("Mission Successful");
        } else {
            System.out.println("Mission Failed");
        }
    }
}