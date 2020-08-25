/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancesports;
import java.util.Scanner;
/**
 *
 * @author sharmila
 */
public class Inheritancesports {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for (int i = 0; i < 3; i++) {
         sports obj=new sports();
         obj.calculate();
         obj.display();
    }
    }
    
}
class student
{
    String stuname;
    int roll_no;
    Scanner obj=new Scanner(System.in);
    static int i=1;
     public void read()
     {
        
         System.out.println("\nenter the student name:"+i);
         stuname=obj.next();
         System.out.println("enter the roll no:");
         roll_no=obj.nextInt();
         i++;
       
        }
     public void display()
     {
        System.out.println("\nStudent Details");
        System.out.println("name:"+stuname);
        System.out.println("Rollno:"+roll_no);
        
     }

    
}
class result extends student
{
    int m1,m2,m3;
    public void read()
    {
    super.read();
    System.out.println("enter the mark of 1st subject: ");
    m1=obj.nextInt();
    System.out.println("enter the mark of 2nd subject: ");
    m2=obj.nextInt();
    System.out.println("enter the mark of 3rd subject: ");
    m3=obj.nextInt();
 
    
    }
    public void display()
            
    {
        super.display();
        System.out.println("Student Mark Details");
        System.out.println("Mark1:"+m1+"\nMark2:"+m2+"\nmark3:"+m3);
    }
}
class sports extends result
{
    double total;
    int point;
    public void calculate()
    {
        super.read();
        System.out.println("enter the sports point");
        point=obj.nextInt();
        total=m1+m2+m3;
        }
   public void display()
    {
        super.display();
        System.out.println("total marks :"+total);
        if(m1>=50 && m2>=50 && m3>=50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("point :"+point);
        
    }
}

