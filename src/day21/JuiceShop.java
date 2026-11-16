package day21;

import java.util.Collections;
import java.util.PriorityQueue;

public class JuiceShop {

    public static int prepareJuices(int mango, int orange, int pineapple) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        if (mango > 0) pq.add(mango);
        if (orange > 0) pq.add(orange);
        if (pineapple > 0) pq.add(pineapple);

        int seconds = 0;

        while (pq.size() > 1) {

            int first = pq.remove();
            int second = pq.remove();

            first--;
            second--;

            seconds++;

            if (first > 0) pq.add(first);
            if (second > 0) pq.add(second);
        }

        if (!pq.isEmpty()) {
            seconds += pq.remove();
        }

        return seconds;
    }

    public static void main(String[] args) {

        System.out.println(prepareJuices(5, 4, 4)); // 7
        System.out.println(prepareJuices(3, 0, 0)); // 3
    }
}