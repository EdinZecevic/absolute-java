
package bank;
import java.util.Scanner;
public class Bank {

   private String id;
   private int accNum;
   private int initialBalance=1000;
   
   public Bank(){
    id="Empty";
    accNum=0;
    initialBalance=0;
   }
   
   public Bank(String id){
    setId(id);
    setAccNum(accNum);
    initialBalance=0;
   }
   
   public Bank(String id,int accNum){
   setId(id);
    initialBalance=0;
   }
   
   
   
   public void setId(String id){
       this.id=id;
   }
   
   public void setAccNum(int accNum){
       this.accNum=accNum;
   }
   
   public String getId(){
   return id;
   }
   
   public int getAccNum(){
   return accNum;
   }
   
   public int getinItialBalance(){
   return initialBalance;
   }
   
   public String toString(){
   return("ID is: "+id+" Account Number is: "+accNum+" and initial balance is: "+initialBalance);
   }
 
    }
    