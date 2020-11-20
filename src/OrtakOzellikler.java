
public class OrtakOzellikler extends OrtakDavranislar {

	private String modelAdi;
	private String imeiNumarası;
	private int bellekKapasitesi;
	private double ekranBoyutu;
		
	public OrtakOzellikler() {
		// TODO Auto-generated constructor stub
	}


	

	public OrtakOzellikler(String modelAdi,
			String imeiNumarası, int bellekKapasitesi, double ekranBoyutu) {
		super(telefonAc, telefonKapat, aramaYap, smsGonder);
		this.modelAdi = modelAdi;
		this.imeiNumarası = imeiNumarası;
		this.bellekKapasitesi = bellekKapasitesi;
		this.ekranBoyutu = ekranBoyutu;
	}




	public String getModelAdi() {
		return modelAdi;
	}

	public void setModelAdi(String modelAdi) {
		this.modelAdi = modelAdi;
	}

	public String getImeiNumarası() {
		return imeiNumarası;
	}

	public void setImeiNumarası(String imeiNumarası) {
		this.imeiNumarası = imeiNumarası;
	}

	public int getBellekKapasitesi() {
		return bellekKapasitesi;
	}

	public void setBellekKapasitesi(int bellekKapasitesi) {
		this.bellekKapasitesi = bellekKapasitesi;
	}

	public double getEkranBoyutu() {
		return ekranBoyutu;
	}

	public void setEkranBoyutu(double ekranBoyutu) {
		this.ekranBoyutu = ekranBoyutu;
	}
	
	
}
