package kanseroldum;

import java.util.Scanner;

public class kureselproje {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kuresel isinma sorulari: ");
		
		int dogru=0;
		
		String[] Cevaplar = new String[5];
		
		String[] dogruCevaplar = {"A","B","C","C","C"};
		
		System.out.println("1-) Hangi ulke En cok Sera Gazi Uretiyor? ");
		System.out.println("A-) Cin ");
		System.out.println("B-) Hindistan ");
		System.out.println("C-) Amerika ");
		System.out.println("D-) Japonya ");
		System.out.println("Cevabi giriniz: ");
		
		String cevap1 = input.next();
		Cevaplar[0]=cevap1;
		
		System.out.println("2-) Hangi Gezegenin Atmosferi küresel isinma ile yok edilmektedir? ");
		System.out.println("A-) Jupiter ");
		System.out.println("B-) Venus ");
		System.out.println("C-) Mars ");
		System.out.println("D-) Merkur ");
		
		System.out.println("Cevabi giriniz: ");
		String cevap2 = input.next();
		Cevaplar[1]=cevap2;
		
		System.out.println("3-) Hangi Tur ampul en az enerjiyi tuketir? ");
		System.out.println("A-) Akkor Ampul ");
		System.out.println("B-) Halojen Ampul ");
		System.out.println("C-) Kompakt Floresan Ampul ");
		System.out.println("D-) Bir degisik ampul ");
		
		System.out.println("Cevabi giriniz: ");
		String cevap3= input.next();
		Cevaplar[2]=cevap3;
		
		System.out.println("4-) Iklim Degisikligi nedeniyle yilda kac kisi olmektedir? ");
		System.out.println("A-) 1500 ");
		System.out.println("B-) 100.000 ");
		System.out.println("C-) 150.000	");
		System.out.println("D-) 500.000");
		
		System.out.println("Cevabi giriniz: ");
		String cevap4= input.next();
		Cevaplar[3]=cevap4;
		
		System.out.println("5-) Kuresel isinmaya karsı en savunmasiz hayvan hangisidir? ");
		System.out.println("A-) Kar Leopari ");
		System.out.println("B-) Kutup Ayisi ");
		System.out.println("C-) Deniz Gergadani ");
		System.out.println("D-) Tukan ");
		
		System.out.println("Cevabi giriniz: ");
		String cevap5= input.next();
		Cevaplar[4]= cevap5;
		
		
		
		
		
		for(int i=0;i<Cevaplar.length;i++){
			if(Cevaplar[i].equals(dogruCevaplar[i])) dogru +=1;
					dogru +=i;					
		}
		
		if (dogru==5) System.out.println("Mukemmel");
		else if(dogru==4) System.out.println("Cok iyi");
		else System.out.println("Kuresel isinma bilgilerinizi tazeleme vakti geldi");
		
	
		for(String cevap : Cevaplar) {
			System.out.println(cevap);
		}
		
	}

}
