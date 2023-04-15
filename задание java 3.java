import java.io.IOException;
import java.util.*;

public class StartTestProgramm {
	
	public static void main(String[] args) throws IOException  {	
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Введите числа, разделенные пробелом: "); 		   
	    String input = sc.nextLine();          
	    String[] split = input.split("\\s+");
	    int[] intMass = new int[split.length];   
	    int i=0;
	    for (String string : split) {           
	    	intMass[i++] = Integer.parseInt(string);
	    }
	    System.out.print("На 3 делятся: ");
	    for (int t = 0; t < intMass.length; t++) {
	       	int x = intMass[t] % 3;
	       	if(x==0) {
	       		System.out.print(intMass[t] + " ");
	       	}
	    }
	    System.out.println("");
		System.out.println("");
	    System.out.println( "Для выхода введите любой символ и нажмите Enter");
	    String ints = sc.nextLine(); 
}}