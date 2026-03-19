
public class Main {

	public static void main(String[] args) {
		//abstractlarda da interfaceler gibi obje üretilmez yani şöyle kullanımı yok
		//AbstractDatabase abstractDatabase=new AbstractDatabase();
		AbstractDatabase abstractDatabase1=new MysqlDatabase();
		AbstractDatabase abstractDatabase2=new MongoDatabase();
		
		abstractDatabase1.add();
		abstractDatabase2.delete();
		
		abstractDatabase1.update();//mysql'e göre çalışır
		abstractDatabase2.update();//mongo'ya göre çalışır
	}

}
