
public class OrtakDavranislar {

	private String telefonAc;
	private String telefonKapat;
	private String aramaYap;
	private String smsGonder;
	
	public OrtakDavranislar(String telefonAc, String telefonKapat, String aramaYap, String smsGonder) {
		
		this.telefonAc = telefonAc;
		this.telefonKapat = telefonKapat;
		this.aramaYap = aramaYap;
		this.smsGonder = smsGonder;
	}
	public OrtakDavranislar() {
		// TODO Auto-generated constructor stub
	}
	public String getTelefonAc() {
		return telefonAc;
	}
	public void setTelefonAc(String telefonAc) {
		this.telefonAc = telefonAc;
		System.out.println(telefonAc + "ile telefon açma işlemi yapıldı");

	}
	public String getTelefonKapat() {
		return telefonKapat;
	}
	public void setTelefonKapat(String telefonKapat) {
		this.telefonKapat = telefonKapat;
		System.out.println(telefonKapat + "ile telefon kapatma işlemi yapıldı");
	}
	public String getAramaYap() {
		return aramaYap;
	}
	public void setAramaYap(String aramaYap) {
		this.aramaYap = aramaYap;
		System.out.println(aramaYap + "ile telefon kapatma işlemi yapıldı");

	}
	public String getSmsGonder() {
		return smsGonder;
	}
	public void setSmsGonder(String smsGonder) {
		this.smsGonder = smsGonder;
		System.out.println(smsGonder + "ile telefon mesaj gönderme işlemi yapıldı");

	}
	
	
	
	
}
