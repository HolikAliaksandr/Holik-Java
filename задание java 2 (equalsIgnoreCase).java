import java.util.*;

public class StartTestProgramm {
	
	public static void main(String[] args)  {
		
		    Scanner sc = new Scanner(System.in, "ibm866");
		    System.out.println("Введите имя: "); 
		    String name = sc.nextLine();
		    String vacho = "Вячеслав";
	 		    
		    String kto = (name.equalsIgnoreCase(vacho))?"Привет, Вячеслав":"Нет такого имени";
		    
		    System.out.println(kto);
		    
		    System.out.println("");
		    System.out.print( "Для выхода введите любой символ и нажмите Enter");
		    int a = sc.nextInt();
		
}}
