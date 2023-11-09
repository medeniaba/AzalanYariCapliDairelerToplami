import java.util.Random;
import java.util.Scanner;

// Azalan Yarı Çaplı Dairelerin Alanları Toplamını Bulan Uygulama 

public class AzalanYaricapliDairelerToplami {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Random med = new Random();
		System.out.println("Lütfen en büyük dairenin yarıçapını giriniz : ");
		double r = klavye.nextDouble ();
		double PI = 3.14;
		double toplam = 0 ; 
		for(int i = 1; i <= 10; i++ ){
			toplam+=(r*r*PI);
			r=r/2;
			}
		System.out.println("toplam"+toplam);
       

       
		
			
		}
	}
		


