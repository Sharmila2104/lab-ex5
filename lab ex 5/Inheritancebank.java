/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancebank;
import java.util.Scanner;
/**
 *
 * @author sharmila
 */
public class Inheritancebank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("Select a bank from 3 banks to check its balance");
        int n=obj.nextInt();
        switch (n)
         {
        case 1:    
        bankA obj1=new bankA();
        System.out.println(obj1.getbalance());
        break;
        case 2:
        bankB obj2=new bankB();
        System.out.println(obj2.getbalance());
        break;
        case 3:
        bankC obj3=new bankC();
        System.out.println(obj3.getbalance());
        break;
        default:
        System.out.println("the selected bank doesn't exist");
        }
    }
    
}
class bank
{
  int getbalance()
  {
      return 0;
  }
}
class bankA 
{
    public int getbalance()
    {
        return 1000;
    }
}
class bankB 
{
    public int getbalance()
    {
        return 1500;
    }
}
class bankC 
{
   public int getbalance()
    {
     
        return 2000;
    }
}