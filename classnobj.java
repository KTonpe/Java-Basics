class Calculator{ // can't use public here only one top-level class in a source file can be declared as public
    public String substraction(int a,int b)
    {
        int sub = a-b; 
        return "Substraction is "+ sub ;
    }
    public String Multiply(int a,int b)
    {
        int mul = a*b; 
        return "Multiplication is "+ mul ;
    }
    
    
}


public class classnobj { // name of the file main "main file"
    public String addition(int a,int b)
    {
        int addition = a+b; 
        return "Addition is "+ addition ;
    }
    public static String Divison(double a,double b)
    {
        if (b>0)
        {
            double division = a/b; 
            return "Division is "+ division ;
        }
        else{
            return "Division is not possible";
        }
    }
    public static void main(String[] args)
     {
        int num1 = 9;
        int num2 = 0;
        int num3 = 10;
        
        classnobj var = new classnobj(); // object creation in main because of no static used
        Calculator cal = new Calculator();
        // System.out.println( cal.addition(num1,num2) );
        System.out.println(var.addition(num1,num2)); // in house calling the object
        System.out.println(cal.substraction(num1, num2));  // calling from different calss Calculator
        System.out.println(cal.Multiply(num1, num2));       // calling from different calss Calculator
        System.out.println(cal.Multiply(num1, num3));       // calling from different calss Calculator
        System.out.println(Divison((double)num1,(double)num2)); // in house calling
        System.out.println(Divison((double)num1,(double)num3)); // in house calling
    }
    
}

