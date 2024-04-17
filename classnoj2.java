// Though the value of b is assigned 0 in class store_variable
// But the value of b is 12 in main class by calling its instance
// as main function is called first and changed b to 12 from 0
// So value of b is change in store variable.


class store_varaibles
{
    int b = 0;
    public int store_data()
    {
        int a = 10;
        System.out.println(b);
        return a;
    }
}




public class classnoj2 
{
    public static void main(String[] args) {
        
        store_varaibles var = new store_varaibles();
        var.b = 12;
        System.out.println("Variable is " + var.store_data());
        System.out.println("Variable is " + var.b);
    }

    
}
