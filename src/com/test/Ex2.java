package com.test;

import java.util.Scanner;

import com.exception.SoAmException;
import com.main.Number;

@SuppressWarnings("all")
public class Ex2 {
	public static void main(String[]args){
		boolean cont = false;
		do{
			try{
				System.out.print("Vui lòng nhập số: ");
				int n = Integer.parseInt(new Scanner(System.in).nextLine());
				if(n < 0){
					throw new SoAmException("Số âm không hợp lệ!");
				}
				System.out.println("Hệ 2: "+new Number(n).convertAnyToBinary());
				System.out.println("Hệ 8: "+new Number(n).convertAnyToOctan());
				System.out.println("Hệ 10: "+new Number(n).convertAnyToHexa());
			}catch(NumberFormatException ex){
				System.out.print(ex.getMessage());
				cont = true;
			}catch(SoAmException exx){
				System.out.print(exx.getMessage());
				cont = true;
			}
			System.out.print("\n");
		}while(cont);
	}
}
