/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package time.proj;

import com.sun.source.tree.BreakTree;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author Administrator
 */
public class TimeProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String newLine = System.lineSeparator();
        Scanner input = new Scanner(System.in);
        
        //Employee information
        System.out.println("Enter Employee Number: ");
        BigInteger employeeNum = input.nextBigInteger();
        System.out.println("Enter Last Name: ");
        String lastName = input.next();
        System.out.println("Enter First Name: ");
        String firstName = input.next();
                        
        //gross hours per week
        //Day1
        System.out.println("Enter Date of Day1: ");
        String date1 = input.next();
        System.out.println("Time In Hour of Day 1: ");
        int startHr1 = input.nextInt();
        System.out.println("Minute: ");
        int startMin1 = input.nextInt();
        System.out.println("Time End Hour of Day 1: ");
        int endHr1 = input.nextInt();
        System.out.println("Minute: ");
        int endMin1 = input.nextInt();
        
        //salary deduction condition
        int totalDayHr1 = ((startHr1 == 8) && (startMin1 >= 11))?((endHr1 - startHr1) - 1) : (endHr1-startHr1);    
        
        //Day2
        System.out.println("Enter Date of Day2: ");
        String date2 = input.next();
        System.out.println("Time In Hour of Day 2: ");
        int startHr2 = input.nextInt();
        System.out.println("Minute: ");
        int startMin2 = input.nextInt();
        System.out.println("Time End Hour of Day 2: ");
        int endHr2 = input.nextInt();
        System.out.println("Minute: ");
        int endMin2 = input.nextInt();
        
        //salary deduction condition
        int totalDayHr2 = ((startHr2 == 8) && (startMin2 >= 11))?((endHr2 - startHr2) - 1) : (endHr2-startHr2);                 
        
       //total hours this week
       int totalWkHrs = (totalDayHr1+totalDayHr2);       
       
       System.out.println("Enter Per Hour Rate:");
       float prHr = input.nextFloat();
       System.out.println(newLine);
       float grossWkPay = (totalWkHrs*prHr);
       
       System.out.println("EMPLOYEE INFORMATION");
       System.out.println("Employee #: " + employeeNum);
       System.out.println("Last Name: " + lastName);
       System.out.println("First Name: " + firstName);
       System.out.println(newLine);
       System.out.println("DAY1 DATE: " + date1);
       System.out.println("Time In: " + startHr1 + ":" + startMin1);
       System.out.println("Time Out: " + endHr1 + ":" + endMin1);
       System.out.println("Total HOURS DAY1 : " + totalDayHr1);
       System.out.println("DAY2 DATE: " + date2);
       System.out.println("Time In: " + startHr2 + ":" + startMin2);
       System.out.println("Time Out: " + endHr2 + ":" + endMin2);
       System.out.println("Total HOURS DAY2 : " + totalDayHr2);
       System.out.println("TOTAL HOURS for the WEEK : " + totalWkHrs);
       System.out.println(newLine);
       System.out.println("TOTAL HOURS for the WEEK : " + totalWkHrs);
       System.out.println("Per Hour Rate: " + prHr);
       System.out.println("Gross Pay for this Week : " + grossWkPay); 
       
       //Deductions       
       //SSS Contribution
        float sssDeduct;      
        if(grossWkPay<3250)
            {
            sssDeduct = 135;
            System.out.println("SSS Contribution is: " + sssDeduct);
            }
        else if (grossWkPay>=3250 && grossWkPay<=3750)
            {
            sssDeduct = 157.50f;
            System.out.println("SSS Contribution is: " + sssDeduct);
            }
        else if (grossWkPay>=3750 && grossWkPay<=4250)
            {
            sssDeduct = 180;
            System.out.println("SSS Contribution is: " + sssDeduct);
            }            
        else if (grossWkPay>=4250 && grossWkPay<=4750)
            {
            sssDeduct = 202.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=4750 && grossWkPay<=5250)
            {
            sssDeduct = 225.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=5250 && grossWkPay<=5750)
            {
            sssDeduct = 247.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=5750 && grossWkPay<=6250)
            {
            sssDeduct = 270.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=6250 && grossWkPay<=6750)
            {
            sssDeduct = 292.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=6750 && grossWkPay<=7250)
            {
            sssDeduct = 315.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=7250 && grossWkPay<=7750)
            {
            sssDeduct = 337.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=7750 && grossWkPay<=8250)
            {
            sssDeduct = 360.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=8250 && grossWkPay<=8750)
            {
            sssDeduct = 382.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=8750 && grossWkPay<=9250)
            {
            sssDeduct = 405.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=9250 && grossWkPay<=9750)
            {
            sssDeduct = 427.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=9750 && grossWkPay<=10250)
            {
            sssDeduct = 450.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=10250 && grossWkPay<=10750)
            {
            sssDeduct = 472.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=10750 && grossWkPay<=11250)
            {
            sssDeduct = 495.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=11250 && grossWkPay<=11750)
            {
            sssDeduct = 517.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=11750 && grossWkPay<=12250)
            {
            sssDeduct = 540.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=12250 && grossWkPay<=12750)
            {
            sssDeduct = 562.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=12750 && grossWkPay<=13250)
            {
            sssDeduct = 585.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=13250 && grossWkPay<=13750)
            {
            sssDeduct = 607.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=13750 && grossWkPay<=14250)
            {
            sssDeduct = 630.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=14250 && grossWkPay<=14750)
            {
            sssDeduct = 652.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=14750 && grossWkPay<=15250)
            {
            sssDeduct = 675.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=15250 && grossWkPay<=15750)
            {
            sssDeduct = 697.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=15750 && grossWkPay<=16250)
            {
            sssDeduct = 720.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=16250 && grossWkPay<=16750)
            {
            sssDeduct = 742.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=16750 && grossWkPay<=17250)
            {
            sssDeduct = 765.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=17250 && grossWkPay<=17750)
            {
            sssDeduct = 787.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=17750 && grossWkPay<=18250)
            {
            sssDeduct = 810.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=18250 && grossWkPay<=18750)
            {
            sssDeduct = 832.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=18750 && grossWkPay<=19250)
            {
            sssDeduct = 855.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=19250 && grossWkPay<=19750)
            {
            sssDeduct = 877.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=19750 && grossWkPay<=20250)
            {
            sssDeduct = 900.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=20250 && grossWkPay<=20750)
            {
            sssDeduct = 922.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=20750 && grossWkPay<=21250)
            {
            sssDeduct = 945.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=21250 && grossWkPay<=21750)
            {
            sssDeduct = 967.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=21750 && grossWkPay<=22250)
            {
            sssDeduct = 990.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=22250 && grossWkPay<=22750)
            {
            sssDeduct = 1012.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=22750 && grossWkPay<=23250)
            {
            sssDeduct = 1035.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=23250 && grossWkPay<=23750)
            {
            sssDeduct = 1057.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=23750 && grossWkPay<=24250)
            {
            sssDeduct = 1080.00f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else if (grossWkPay>=24250 && grossWkPay<=24750)
            {
            sssDeduct = 1102.50f;
            System.out.println("SSS Contribution is: " + sssDeduct); 
            }
        else 
            { 
            sssDeduct = 1125;
            System.out.println("SSS Contribution is: " + sssDeduct);
            }
        
        //PhilHealth Contribution
        float philHealth = (grossWkPay*0.03f);
        float empShare = (philHealth/2);
        float phDeduct = (philHealth-empShare);
            System.out.println("Phil Health Contribution is: " + phDeduct);
            
        //Pag Ibig Contribution (EMPLOYEE SHARE MISSING!!)
        float employeePagibig;
        if (grossWkPay<1000) 
            { 
            employeePagibig = (grossWkPay*0.01f);
            }
        else if (grossWkPay>=1000 && grossWkPay<=1500) 
            {
            employeePagibig = (grossWkPay*0.01f);
            }
        else if (grossWkPay>1500) 
            {
            employeePagibig = (grossWkPay*0.02f);
            }
        else 
            { 
            employeePagibig = (grossWkPay*0.02f); 
            }
        float pagIbigDeduct = employeePagibig;
        if (employeePagibig>100) 
            {         //maximum of 100 only contribution
            pagIbigDeduct = 100;
            }
        System.out.println("PagIbig Contribution is: " + pagIbigDeduct);
        
        //Gross Weekly pay less Contributions
        float lessDeduct = (sssDeduct+phDeduct+pagIbigDeduct);
        System.out.println("less TOTAL CONTRIBUTIONS " + lessDeduct);
        float taxablePay = (grossWkPay - lessDeduct);
        System.out.println("Taxable Income is " + taxablePay);
        System.out.println(newLine);
        
        //total Net Weekly Pay
        float taxDeduct;
        if (taxablePay>20833) 
            {  //DIVIDE BY 4 if WEEKLY???
            taxDeduct = ((taxablePay-20833)*0.20f); //condition for above 20833 monthly
            System.out.println("Withholding Tax is: " + taxDeduct);
            }
        else 
            { 
            taxDeduct = 0; 
            System.out.println("Withholding Tax is: 0");
            }
        float netWkPay = (taxablePay-taxDeduct);
        System.out.println("Net Pay for this week is: " + netWkPay);
    }
    
}
