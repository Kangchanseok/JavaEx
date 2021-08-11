package com.javaex.io.charstream;


import java.io.File;
import java.util.Scanner;

public class ScannerEx {
	static final String rootPath = 
			System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + " thieves.txt";
	
	public static void main(String[] args) {
		
		File file = new File(filename);
		
		try{ 
			Scanner sc = new Scanner(file);
			String name;
			float height;
			float weight;
			
			while (sc.hasNextLine());// 남은 라인있는가?
			name = sc.nextLine();
			height = sc.nextFloat();
			weight = sc.nextFloat();
			
			System.out.printf("%s, 키: 2f , 체중: %,2f%n",name,height,weight);
			
			sc.nextLine();
			
			
		
				
	
      sc.close();
	} catch ( Exception e) {
	e.printStackTrace();
}



}
}

