/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nyplab7;

import java.util.Scanner;

/**
 *
 * @author Emirhan Güney
 */
public class NYPLAB7 {

    
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
                int BiletSayisi;
                System.out.println("1.salon satacagınız bilet sayisini girin: ");
                BiletSayisi= Scan.nextInt();
                System.out.println("kaç bilet sattınız: "+BiletSayisi);
                
                Sinema sinema_1 = new Sinema(1,50);
		Sinema sinema_2 = new Sinema(2,150);
		Sinema sinema_3 = new Sinema(3,250);

           for (int i = 0; i < BiletSayisi; i++) {
                    sinema_1.BiletSat();
        
           }
                System.out.println("bos koltuk sayisi:"+sinema_1.BosKoltukOgren());
		sinema_1.BiletIptal();
		System.out.println("iptalden sonra bos koltuk sayisi:"+sinema_1.BosKoltukOgren());

		System.out.println("toplam satilan bilet sayisi:"+sinema_1.ToplamSatilanBiletSayisiniOgren());

	Scanner scn =new Scanner(System.in);
        int BiletSayisi2;
        System.out.println("2.salon satacagınız bilet sayisini girin: ");
        BiletSayisi2= Scan.nextInt();
        
        System.out.println("kaç bilet sattınız: "+BiletSayisi2);
        
          		
                for (int i = 0; i < BiletSayisi2; i++) {
                    sinema_2.BiletSat();
        
           }
                
              
                System.out.println("bos koltuk sayisi:"+sinema_2.BosKoltukOgren());
		sinema_2.BiletIptal();
		System.out.println("iptalden sonra bos koltuk sayisi:"+sinema_2.BosKoltukOgren());

		System.out.println("toplam satilan bilet sayisi:"+sinema_2.ToplamSatilanBiletSayisiniOgren());

                
                Scanner scnn =new Scanner(System.in);
        int BiletSayisi3;
        System.out.println("3.salon satacagınız bilet sayisini girin: ");
        BiletSayisi3= Scan.nextInt();
        
        System.out.println("kaç bilet sattınız: "+BiletSayisi3);
                 for (int i = 0; i < BiletSayisi3; i++) {
                    sinema_3.BiletSat();
        
           }
	
                System.out.println("bos koltuk sayisi:"+sinema_3.BosKoltukOgren());
		sinema_3.BiletIptal();
		System.out.println("iptalden sonra bos koltuk sayisi:"+sinema_3.BosKoltukOgren());

		System.out.println("toplam satilan bilet sayisi:"+sinema_3.ToplamSatilanBiletSayisiniOgren());

        
    }
    
}
