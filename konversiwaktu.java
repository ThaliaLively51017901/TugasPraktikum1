import java.util.Scanner;
public class konversiwaktu {
	public static void main(String[] args) {
		int jam;
		int menit;
		int detik;
		int ttldek;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("jam: ");
		jam = input.nextInt();
		System.out.print("menit: ");
		menit = input.nextInt();
		ttldek =(jam * 3600) + (menit * 60);
		System.out.println("Total Detik: " + ttldek);
		System.out.println("detik");
	}
}