import java.util.*;
import java.io.IOException;
public class StartTestProgramm {
		
			public static void main(String[] args) throws IOException {	
					
		Scanner sc = new Scanner(System.in, "ibm866");
		System.out.println("Введите имя: ");
		
		Scanner in = new Scanner(System.in, "ibm866"); 
		
		String str1 = in.next();
		String str2 = "Вячеслав";
		String str3 = "вячеслав";
		int var = str1.compareTo(str2);
		int var2 = str1.compareTo(str3);
		if (var==0|var2==0) {
		    	System.out.println("Привет, Вячеслав");
		    }  else {
		    	System.out.println("Нет такого имени");
		    }
		System.out.println("");
	    System.out.println( "Для выхода введите любой символ и нажмите Enter");
	    String ints = sc.nextLine();
}}
