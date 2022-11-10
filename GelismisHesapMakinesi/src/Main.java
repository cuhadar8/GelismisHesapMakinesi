import java.util.Scanner;

public class Main {

	public static int topla(int a, int b) {
		int result = a + b;
		System.out.println("Toplam = " + result);
		return result;
	}
	
	public static int cikar(int a,int b) {
		int result = a -b;
		System.out.println("Fark = " + result);
		return result;
	}
	
	public static int carp(int a,int b) {
		int result = a * b;
		System.out.println("Çarpım = " + result);
		return result;
	}
	
	public static double bol(double a,int b) {
		if(b==0) {
			return 0;
		}
		double result = a / b;
		System.out.println("Sonuç = " + result);
		return result;
	}
	public static int usAl(int a,int b) {
		int result = 1;
		for(int i = 1; i<= b; i++) {
			result*=a;
		}
		System.out.println("Sonuç = " + result);
		return result;
	}
	
	public static int fact(int a) {
		int result = 1;
		for(int i = a; i>0; i--) {
			result*=i;
		}
		System.out.println("Sonuç: " + result);
		return result;
		
	}
	
	public static int modAl(int a) {
		int result = a%10;
		System.out.println(a + " sayısının modu = " + result);
		return result;
	}
	
	public static int dikdortgen(int a,int b) {
		int result1 = a*b;
		int result2 = 2*(a+b);
		System.out.println("Alan: " + result1);
		System.out.println("Çevre: " + result2);
		return result1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme işlemi\n"
				+ "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabı\n" + "0- Çıkış Yap";

		while (true) {
			System.out.println("*************************");
			System.out.println(menu);
			System.out.print("Lütfen işlem seçiniz: ");
			int select = scanner.nextInt();

			if (select == 0) {
				System.out.println("Hesap makinesi sonlandırıldı.");
				break;
			} 
			else if (select == 1) {
				System.out.print("Birinci sayı: ");
				int a = scanner.nextInt();
				System.out.print("İkinci sayı: ");
				int b = scanner.nextInt();
				
				topla(a,b);
			}

			else if (select == 2) {
				System.out.print("Birinci sayı: ");
				int a = scanner.nextInt();
				System.out.print("İkinci sayı: ");
				int b = scanner.nextInt();
				
				cikar(a,b);
			} 
			
			else if (select == 3) {
				System.out.print("Birinci sayı: ");
				int a = scanner.nextInt();
				System.out.print("İkinci sayı: ");
				int b = scanner.nextInt();
				
				carp(a,b);
			} 
			
			else if (select == 4) {
				System.out.print("Birinci sayı: ");
				int a = scanner.nextInt();
				System.out.print("İkinci sayı: ");
				int b = scanner.nextInt();
				if(bol(a,b)==0) {
					System.out.println("Bölen 0 olamaz");
				}
				
				bol(a,b);
			} 
			
			else if (select == 5) {
				System.out.print("Taban sayı: ");
				int a = scanner.nextInt();
				System.out.print("Üs sayı: ");
				int b = scanner.nextInt();
				
				usAl(a,b);
			} 
			
			else if (select == 6) {
				System.out.print("Sayı giriniz: ");
				int a = scanner.nextInt();
				fact(a);
			} 
			
			else if (select == 7) {
				System.out.print("Sayı giriniz: ");
				int a = scanner.nextInt();
				modAl(a);
			} 
			
			else if (select == 8) {
				System.out.print("Kısa kenar: ");
				int a = scanner.nextInt();
				System.out.print("Uzun kenar: ");
				int b = scanner.nextInt();
				
				dikdortgen(a, b);
			} 
			
			else {
				System.out.println("Hatalı işlem seçimi");
			}
		}

	}

}
