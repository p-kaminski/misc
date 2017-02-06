import java.util.Scanner;
public class testswitch {
	public static Scanner in = new Scanner(System.in);
	public static boolean quit = false;
	public static int choose;
	public static void main(String[] args) {
		while(!quit) {
			choose = in.nextInt();
			switch(choose) {
				case 1: System.out.println("num");
				break;
				case 2: clear();
				break;
				case 3: quit = true;
				break;
				default: System.out.println("default");
				break;
			}
		}
	}

	public static void clear() {
	System.out.println("\u001b[2J" + "\u001b[H");
	}
}