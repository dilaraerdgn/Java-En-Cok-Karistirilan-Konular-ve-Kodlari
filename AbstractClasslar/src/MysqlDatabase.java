
public class MysqlDatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("mysql güncelledi...");
		
	}

	@Override
	void get() {
		System.out.println("mysql verileri aldı...");
		
	}

}
