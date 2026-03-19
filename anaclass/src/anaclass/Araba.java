package anaclass;



public class Araba {
	
	String marka;
	String rengi;
	int motorgucu;
	
	
	public Araba(String marka,String rengi, int motorgucu){
		this.marka=marka;
		this.rengi=rengi;
		this.motorgucu=motorgucu;
	}
	
	public void yazdir() {
		System.out.println(marka);
		System.out.println(rengi);
		System.out.println(motorgucu);
		
	}
	
	
	

}


