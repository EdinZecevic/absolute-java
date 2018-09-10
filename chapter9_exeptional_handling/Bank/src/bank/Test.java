package bank;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		String id;
        int accNum;
        int initialBalance=1000;
        Bank bank=new Bank();
   
   Scanner keyboard= new Scanner(System.in);
   
   System.out.println("Enter id ");
   id=keyboard.nextLine();
   bank.setId(id);
   
   
   
   System.out.println("Enter acc ");
   accNum=keyboard.nextInt();
   bank.setAccNum(accNum);
    
   try{
        
       
       if(id.equals("aaa111") && accNum==1111)
           throw new Exception("ovo je hilmo");
       else if(id.equals("bbb111") && accNum==2222)
           throw new Exception("ovo je sinan");
       else 
           throw new Exception("eror");
    
   }
   
   catch(Exception e){
       
       String message=e.getMessage();
   System.out.println(message);
   }
	}
}
