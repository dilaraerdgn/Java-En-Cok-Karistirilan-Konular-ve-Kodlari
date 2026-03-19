
public class Static {
	private int a=20;
	private static int b=3;
	
	public static class Inner{
		int a=5;
		
		public void run() {
			System.out.println(a);//çıktı 5
			System.out.println(this.a);//çıktı 5
			//System.out.println(Static.this.a); --> bu kod satırı hata verir,ulaşamayız çünkü classımız static
			//Inner'dan nesne üretmeyeceğiz, üretmediğim nesnenin üst sınıfına referans üretmiyorum
			
			System.out.println(b);//static'in içinde static çok rahat kullanılır
			//çıktı 3
			
		}
	}
}
