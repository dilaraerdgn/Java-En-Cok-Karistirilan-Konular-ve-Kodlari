
public class Main {

	public static void main(String[] args) {
		NonStatic n=new NonStatic();
		NonStatic.Inner inner=n.new Inner(); //n üzerinden Inner nesnesi ürettik
		inner.run();
		
		n.run();
		
		NonStatic.Inner2 inner2=n.new Inner2();
		inner2.run();
		
		Static.Inner sInner=new Static.Inner();//iç metotdan değil dış metot sayesinde(static değil) nesne üretip çağırabildik
		sInner.run();
	}

}
