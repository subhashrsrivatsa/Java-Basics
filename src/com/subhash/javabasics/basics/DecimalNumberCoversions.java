/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class DecimalNumberCoversions {

	/**
	 * @param args
	 */
	
	private static void BinaryNumber(int dec_num) {
		 int quot, i=1, j;
	        int bin_num[] = new int[100];
	        			
	        quot = dec_num;
			
	        while(quot != 0)
	        {
	            bin_num[i++] = quot%2;
	            quot = quot/2;
	        }
			
	        System.out.print("Binary number is: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(bin_num[j]);
	        }
	        System.out.print("\n");
		
	}
	
	private static void OctalNumber(int dec_num) {
		 int quot, i=1, j;
	        int oct_num[] = new int[100];
	        
	        quot = dec_num;
			
	        while(quot != 0)
	        {
	            oct_num[i++] = quot%8;
	            quot = quot/8;
	        }
			
	        System.out.print("Octal number is: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(oct_num[j]);
	        }
			System.out.print("\n");
	}
	
	private static void HexaDecimal(int dec_num) {
		int rem;
        String hexdec_num="";
        
        /* hexadecimal number digits */
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n"); 
		
	}

	
	
	public static void main(String[] args) {
		System.out.println("Enter the Decimal number of your choice");
		Scanner s = new Scanner(System.in);
		int dec_num = s.nextInt();
		
		BinaryNumber(dec_num);
		OctalNumber(dec_num);
		HexaDecimal(dec_num);
		
		s.close();

	}

	
}
