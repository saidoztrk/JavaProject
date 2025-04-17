package denem11;

import java.util.Scanner;

public class objeTanimlama {

	public static void main(String[] args) {
		
		int a,b ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.sayıyı girin ");
	    a = scanner.nextInt();
	    System.out.println("2.sayıyı girin ");
	    b = scanner.nextInt();
	    
		HesapMakinesi h1 =  new HesapMakinesi(a, b);
		System.out.println("Sonuc = " + h1.toplama());
	}

}
