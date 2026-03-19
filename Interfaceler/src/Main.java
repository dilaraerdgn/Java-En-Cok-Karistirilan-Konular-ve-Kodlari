
public class Main {

	public static void main(String[] args) {
			/*Customer customer=new Customer();
			Student student =new Student();
			student.log();
			customer.log();
			*/
		IDatabase database1=new Customer();//referans
		IDatabase database2=new Student();//öğrenci gibi davranıcak
		
		database1.log();//müşteri
		database2.log();//ogrenci
	}

}
