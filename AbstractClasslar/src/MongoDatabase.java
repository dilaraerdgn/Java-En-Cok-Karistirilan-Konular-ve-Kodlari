
public class MongoDatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("mongo güncelledi...");
		
	}

	@Override
	void get() {
		System.out.println("mongo verileri aldı...");
		
	}

}
