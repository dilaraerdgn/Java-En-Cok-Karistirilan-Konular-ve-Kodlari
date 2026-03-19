
public class NonStatic {//dış sınıf
	private int a=10;
	
	public class Inner{//iç sınıf
		int a=1;
		
		public void run() {//bu metodu çağırabilmek için nesne üretmemiz gerek(en dıştan içe doğru)
			System.out.println(a);//çıktı 1
			System.out.println(this.a);//çıktı 1
			System.out.println(NonStatic.this.a);//çıktı 10
		}
	}
	
	
	public void run() {
		System.out.println(a);//çıktı 10
		System.out.println(this.a);//çıktı 10
		//System.out.println(Inner.this.a); --> bu kod böyle tek başına hata verir nesne üretmemizi ister
		//doğru çağrımı aşağıda
		Inner i=new Inner();
		System.out.println(i.a);//çıktı 1
	}
	
	
	public class Inner2{//iç sınıf(bir sınıfın içinde birden fazla sınıf oluşturulabilir)
		int a=2;
		
		public void run() {//bu metodu çağırabilmek için nesne üretmemiz gerek(en dıştan içe doğru)
			System.out.println(a);//çıktı 2
			System.out.println(this.a);//çıktı 2
			System.out.println(NonStatic.this.a);//çıktı 10
		}
	}
}
