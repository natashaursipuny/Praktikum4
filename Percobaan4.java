import java.util.Scanner;
import java.util.Arrays;
public class Percobaan4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nilai = new int[5];
		System.out.print("Nilai pertama : ");
		nilai[0] = input.nextInt();
		System.out.print("Nilai kedua : ");
		nilai[1] = input.nextInt();
		System.out.print("Nilai ketiga : ");
		nilai[2] = input.nextInt();
		System.out.print("Nilai keempat : ");
		nilai[3] = input.nextInt();
		System.out.print("Nilai kelima : ");
		nilai[4] = input.nextInt();
		
		Arrays.sort(nilai);
		System.out.println("Nilai Minimumnya adalah : " +nilai[0]);
		System.out.println("Nilai Maximumnya adalah: " +nilai[nilai.length-1]);
		
		
		
	}
}