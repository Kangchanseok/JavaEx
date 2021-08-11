import java.util.Scanner;
import java.util.Arrays;


public class Practice

{

    
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int num[] = new int[a];
//         int num[] = { 0, };
    	
        for (int i = 0; i < a; i++) {
//        	num[i] = sc.nextInt();
        	num[i] = sc.nextInt();
        }
        
//    	System.out.println(num[0]);
//    	       System.out.println(num[1]);
        sc.close();
        Arrays.sort(num);
        
        System.out.println(num[0] + " " + num[a-1]);
        
        
        
        
        
        
        
        
        
        
        
        
        


       
        






    }
}