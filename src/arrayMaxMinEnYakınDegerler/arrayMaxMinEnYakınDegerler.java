package arrayMaxMinEnYakınDegerler;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMaxMinEnYakınDegerler {

	public static void main(String[] args) {
		int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = list[0];
        int max = list[0];
        int sayi ;
        Scanner input = new Scanner(System.in);
        
       System.out.println(Arrays.toString(list)); 
       System.out.println("Lütfen Bir sayi Giriniz :");
       sayi = input.nextInt();
       
       
       Arrays.sort(list);
       for (int i : list) {
    	   if ( i < sayi) {
    		   min = i ;
    	   }
    	   
    	   if (i > sayi) {
    		   max = i;
    		   break ;
    	   }
       }
       
       System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
       System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
	}

}
