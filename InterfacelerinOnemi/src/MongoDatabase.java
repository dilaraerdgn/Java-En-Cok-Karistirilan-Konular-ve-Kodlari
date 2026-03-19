
public class MongoDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("MongoDatabase ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("MongoDatabase silme");
		
	}

	@Override
	public void get() {
		System.out.println("MongoDatabase elde etme");
		
	}

	@Override
	public void update() {
		System.out.println("MongoDatabase guncelleme");
		
	}

}
