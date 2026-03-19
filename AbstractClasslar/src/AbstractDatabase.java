
public abstract class AbstractDatabase {//class aç abstract'ı kendin ekle
//özellikleri ve gövdeli metodlarımı ekleyebilirim
	//gövdesiz metodlarımı(abstract metod) da ekleyebilirim
	//aşağıdaki 2metod diğer classlar için ortak olacak, tek tek yazmamıza gerek kalmayacak
	public void add() {
		System.out.println("Eklendi...");
	}
	public void delete() {
		System.out.println("Silindi...");
	}
	
	//eğer her class için değiştirilseydi abstract metod yazardım(gövdesiz)
	abstract void update();//bundan türeyen classların bunu yazması gerekiyor
	abstract void get();	
	
}
