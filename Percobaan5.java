import java.util.Scanner;
public class Percobaan5 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int x;
		System.out.print("Masukkan nilai : ");
		x = input.nextInt();
		
		if (x >= 0) {
			System.out.println("Nilai tersebut adalah positif");
		} else {
			System.out.println("Nilai tersebut adalah  negatif");
		}
	}
}