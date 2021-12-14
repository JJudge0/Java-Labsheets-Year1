public class CS1702_Lab1 
{
	public static void main(String args[]) 
	{
// Calling each method from the main of which is linked to 1 class also void means empty                                   
	    System.out.println("STUDENT NAME: JATINDER JUDGE STUDENT");
		Method1();
        Method2();
        Method3();
        TESTING();  //This calls TESTING
        //Each method call executes a method and returns to the class/method that called the method.

    }
    public static void Method1()
    {
        System.out.println("Hello from Method1!!!");
    }
    public static void Method2()
    {
        System.out.println("Hello from Method2!!!");
    }
    public static void Method3()
    {
        System.out.println("Hello from Method3!!!");
    }
    public static void TESTING()
    {
    	System.out.println(" Hello from Test");
    }

}

