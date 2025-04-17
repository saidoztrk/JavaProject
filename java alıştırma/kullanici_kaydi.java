package denem11;

import java.util.Scanner;


public class kullanici_kaydi {


	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String kAdi,parola ;
		System.out.println("kullanıcı adı giriniz");
	    kAdi = scan.nextLine() ;	
	    System.out.println("parola giriniz");
	    parola = scan.nextLine() ;	
	    System.out.println(parola);
	if (kAdi.equals("said")||parola.equals("157423")) {
		
		System.out.println("sisteme girdiniz");
		
	}
	else {
		System.out.println("kullanıcı adı veya şifre yanlış");
	}
	}
	
	

}
