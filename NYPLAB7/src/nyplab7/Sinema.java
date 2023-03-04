/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyplab7;


class Sinema {
    
      int SalonNo;
	int ToplamKoltukSayisi;
	int SatilanBiletSayisi;
	int ToplamSatilanBiletSayisi;
	
		
	public Sinema(){
		super();
		this.SalonNo = 0;
		this.ToplamKoltukSayisi = 50;
		this.SatilanBiletSayisi =0;
		this.ToplamSatilanBiletSayisi = 0;
	}
	
	public Sinema(int SalonNo , int ToplamKoltukSayisi) {
		this.SalonNo = SalonNo;
		this.ToplamKoltukSayisi = ToplamKoltukSayisi;
	}
	
	public void BiletSat() {
		if(ToplamKoltukSayisi <= SatilanBiletSayisi ) {
			System.out.println("Biletler Tükenmiştir");
		}
		else {
		SatilanBiletSayisi++;
		ToplamSatilanBiletSayisi++;
	}}
	public void BiletIptal() {
		if(SatilanBiletSayisi == 0)
			System.out.println("Henüz Bilet Satılmadı!");
		else{
			SatilanBiletSayisi--;
			ToplamSatilanBiletSayisi--;
	}}
	public int BosKoltukOgren() {
		return ToplamKoltukSayisi-SatilanBiletSayisi;
	}

	public int ToplamSatilanBiletSayisiniOgren() {
		
		return ToplamSatilanBiletSayisi;
	}
}
