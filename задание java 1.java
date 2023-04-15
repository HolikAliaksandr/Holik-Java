import java.util.Scanner;

public class StartTestProgramm {
		
			public static void main(String[] args) {	
				
				Scanner sc = new Scanner(System.in);
			    System.out.println("Выберите язык/Sprachauswahl/Choose language");
			    System.out.println("Введите соответствующую цифру и нажмите Enter/Geben Sie die entsprechende Nummer ein und pressen Sie Enter/Enter the appropriate number and press Enter");
			    System.out.println("1-Русский/2-Deutsch/3-English");
			    int a = sc.nextInt();
			    if (a==1) {
			    	 System.out.println("Введите число:");
			    } else if (a==2) {
			    	 System.out.println("Geben Sie die Nummer ein:");
			    } else if (a==3) {
			    	 System.out.println("Enter the number:");
			    } else {
			    	 System.out.println("Неверный ввод/Ungultige Eingabe/Invalid input");
			    }

				int b = sc.nextInt();
				
				if (b>7 && a==1) {
					System.out.println("Привет, парни!");
				}
				if (b>7 && a==2) {
					System.out.println("Hallo, Leute!");
				}
				if (b>7 && a==3) {
					System.out.println("Hello, guys!");
				}
				if (b<=7) {
					System.out.println("Это/Das/It is "+b);
				}
				if (b>7 && a>3) {
					System.out.println("Перезапусти программу/Starten Sie das Programm neu/Restart the program");
				}
		 System.out.println("");
		 
			if (a==1) {
				System.out.println("Для выхода введите любой символ и нажмите Enter");
			}
			if (a==2) {
				System.out.println("Geben Sie zum Beenden ein beliebiges Zeichen ein und pressen Sie Enter");
			}
			if (a==3) {
				System.out.println("To exit, enter any character and press Enter");
			}
			
		int c = sc.nextInt();
		}
}
