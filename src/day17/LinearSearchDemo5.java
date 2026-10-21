package day17;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchDemo5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount to exchange");
		int amount = sc.nextInt();

		System.out.println("Enter the number of currency notes");
		int size = sc.nextInt();

		int currency[] = new int[size];
		int notes[] = new int[size];

		System.out.println("Enter currency denominations");

		for(int i=0;i<size;i++) {
			currency[i] = sc.nextInt();
		}

		SelectionSort.selectionsort(currency);

		System.out.println("Sorted Notes : "
				+ Arrays.toString(currency));

		for(int i=0;i<currency.length;i++) {

			notes[i] = amount / currency[i];

			amount = amount % currency[i];
		}

		System.out.println(Arrays.toString(notes));

		int totalNotes = 0;

		for(int i=0;i<currency.length;i++) {

			if(notes[i] != 0) {

				System.out.println(currency[i]
						+ " x "
						+ notes[i]);

				totalNotes += notes[i];
			}
		}

		System.out.println("Total Notes = "
				+ totalNotes);

		sc.close();
	}
}