import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
class ecomm                                 //domain class (outer)
{

    static String brand = "FLIPKART";       //brand name static var
    static int emps = 20000;                //total employees static var
    static                                  //block
    {
    	NumberFormat nf = NumberFormat.getInstance(new Locale("hi","in")); //format number class
        emps=50000;		                    //total employee value changed 
        String emps_nf = nf.format(emps);   //store and format number in string var
        System.out.println("\n"+"Total No. of Employee : "+emps_nf);
    }
    static class customer                   //entity class (inner)
    {
        static void msg()                   //function inside static class
        {
            brand = "AMAZON";               //brand value changed
            System.out.println("Brand is : "+brand);
        }
    }
    static void salary(int wage)          //static function with parameter(wage)
    {
    	NumberFormat nf = NumberFormat.getInstance(new Locale("hi","in")); 
        int emps_salary_per_hour = wage*emps;          //calculate total salary
        String sal = nf.format(emps_salary_per_hour);  //store and format number in string var
        System.out.println("Total Employee Salary : "+sal);
    }
    public static void main(String args[])
    {
        int wage = 10;
        //ecomm.customer obj_customer = new ecomm.customer();    //object to access 'customer' class
        //ecomm obj_ecomm = new ecomm();    //object to access 'ecomm' class
        //obj_customer.msg();               //calling msg() method inside customer class
        //obj_ecomm.fucntion(wage);         //calling static function inside 'ecomm' class

        salary(wage);                       //static method accesed without object and class
        customer.msg();                     //static class accessed without object
        System.out.println("THANK YOU !"+"\n");
    }
}
