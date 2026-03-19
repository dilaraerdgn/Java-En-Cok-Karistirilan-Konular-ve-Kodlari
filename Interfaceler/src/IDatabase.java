//gövdeli method bulunmaz interfacelerde, imzaları yazılıyor,bu interfaceleri 
//implemente eden tüm classlar bu methodları kendi içinde yazmak zorunda
//interfacelerden obje oluşturulamaz
public interface IDatabase {
	//bir tane metodun gövdesini değil imzasını yazıcağız
	void log();
}
