package anaclass;

public class sporaraba extends Araba {
	
	  int yil;
	  
	  public sporaraba(String marka,String rengi, int motorgucu, int yil) {
		  super(marka, rengi, motorgucu);
		  this.yil=yil;
	  }
	
	  public void yazdir() {
		  super.yazdir();
		  System.out.println(yil);
	  }

}
