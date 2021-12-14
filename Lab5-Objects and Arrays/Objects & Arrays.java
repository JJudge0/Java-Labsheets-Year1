//---------------------------PRIVATE NOTES----------------------------------------------------------//

// Private You can't edit data from itself
// Float The float data type is a single-precision 32-bit IEEE 754 floating point. Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. The float data type should never be used for precise values, such as currency.
// An object is a programming construct that usually holds data and represents a key component of a programming problem.
// A class is a description of an object Described by the program code
// An object is an instance of a class
//One Dimensional Arrays is like a x on a graph that has 1 value or one sets of data
// Two Dimensional Arrays is like a x,y on a graph that has 2 values or 2 sets of data
//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.
//Classes have data and methods
//Data items are also known as
//Class variables
//Fields
//Attributes
//Methods manipulate the data items
//They can read data items (getters)
//They can write to data items (setters)
//They allow objects to pass messages between each other


///////////////////////////////////////////////////////////////////////////////////
//----------------------OBJECT ORIENTED PROGRAM-------------------------------------
//An Object Oriented program is designed as a series of inter-communicating objects
//Each object stores data and communicates with other objects via messages
//These messages trigger the objects to change their data
//Computation is performed via this process
//----------------------OBJECT ORIENTED PROGRAM-------------------------------------
//////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////
//----------------------ARRAY LIST-------------------------------------
//Just to completely confuse you, you cannot put base data types into an ArrayList
//None of boolean, byte, char, double, float, int, long, short
//Strings are OK as they are a class and not a base data type
//However Java has a number of classes defined that behave like their namesakes...
//Boolean, Byte, Double, Float, Integer, Long, Short
//This probably seemed liked a good idea when they were designing the language, but in practice this is very annoying...
// Any data type can go infront of an(Array) arr[] like double arr[], string arr[] etc....
//----------------------ARRAY LIST-------------------------------------
//////////////////////////////////////////////////////////////////////////////////
//---------------------------PRIVATE NOTES----------------------------------------------------------//


import java.util.ArrayList;   // importing ARRAY LIST PACKAGE
import javax.swing.JOptionPane; //OPTIONAL MESSAGE PACKAGE
public class CS1702_Lab5 
{
// FIRST MULTI-CLASS 
private static void PrintDataArray(ArrayList<Data> array1) // I did 3 sets of separate array data so it's ArrayList1, ArraylistA, ArraylistB so let me remove ARRAY A & B
{
    for(int i=0;i<array1.size();++i)   // THIS IS FOR THE ARRAY SIZE AS IT CAN DUPLICATE
    {
        array1.get(i).Print();
    }
}

static public void main (String Args[])   // SHOULD BE PUBLIC STATIC VOID
{
	// Calling methods 
//  Arrays();
	arrayListimplementationconsiderations();
	arrayListimplementationconsiderations1_1();
//	Castingpart1();  
//	Castingpart2();


     
}
//********************\\\EXAMPLE///*******************************
//Data x = new Data("Fred",41);   FROM LAB
//x.Print();   CREATES A ARRAY OF NAME AND AGE ALONE WITH PRINTING IT IMPORTANT ****
//********************\\\EXAMPLE///*******************************


private static void Arrays()
{
	System.out.println("The ArrayList has some inherent behaviour that can result in some odd runtime errors.");
    System.out.println("Question1: Add to class CS1702_Lab5 the PrintDataArray method from section 5.8. Test the method on the array list that you have created. How would you add Harry aged 78 between Jo and Zoe? Display the contents of the array to see if you have done this correctly.");
	System.out.println();
	ArrayList<Data> array_list = new ArrayList<Data>(); //Made a new array list and storing it in Data
	Data a = new Data("fred",21);  // New data adding name and age & links to the Data class file
	Data b = new Data("jo",43); 
	Data c = new Data("Zoe",37);
	Data d= new Data ("Harry",78);
    array_list.add(a); array_list.add(b); array_list.add(c); array_list.add(d); //prints array list
//	PrintDataArray(array_list); // I did 3 sets of separate array data so it's ArrayList1, ArraylistA, ArraylistB
}


public static void arrayListimplementationconsiderations() 
{
//ARRAY LIST IS USUALLY 0,1,2,3 SO 0 IS FRED , 1 IS JO, 2 IS ZOE, 3 IS HARRY THE ORDER MUST BE 
	ArrayList<Data> ArrayA  = new ArrayList<Data>();
	ArrayList<Data> ArrayB  = new ArrayList<Data>();
	Data Fred = new Data("Fred",21);
	Data Jo = new Data("jo",43);
	Data Zoe = new Data("Zoe",37);
	Data Harry= new Data("Harry",78);
	ArrayA.add(Fred);       
	ArrayA.add(Jo);
	ArrayA.add(Zoe);
	System.out.println("Default user list:------------");
    PrintDataArray(ArrayA);
	System.out.println();
	ArrayList<Data> ArrayB1 = ArrayA;
    ArrayA.remove(0); //Removes Fred from the list
	System.out.println("Removing Fred from the list:------------");
    PrintDataArray(ArrayB1);
	System.out.println();
    ArrayB1.add(1, Harry); // Adds Harry on to the list
	System.out.println("Adding Harry between Jo and Zoe from the list:------------");
    PrintDataArray(ArrayB1);
	System.out.println();
    ArrayB1.add(0, Fred);
	System.out.println("Adding Fred back first place so the list: Fred, Jo, Harry, Zoe from the list:------------");
    PrintDataArray(ArrayB1);
	JOptionPane.showMessageDialog(null,"Congratulations Harry has been added to the list sucessfully.....");
	
	//DO SECTION 5.5 THIS IS THE FIRST PART DO THE SECOND PART WITH ARRAY C AND D
    
}

	public static void arrayListimplementationconsiderations1_1()
	{
		ArrayList<Data> ArrayA  = new ArrayList<Data>();
		ArrayList<Data> ArrayB  = new ArrayList<Data>();
		ArrayList<Data> ArrayC  = new ArrayList<Data>();
		ArrayList<Data> ArrayD  = new ArrayList<Data>();
		Data Fred = new Data("Fred",21);
		Data Jo = new Data("jo",43);
		Data Zoe = new Data("Zoe",37);
		Data Harry= new Data("Harry",78);
		Data Max= new Data("Max",1);
		Data Honey= new Data("Honey",2);
		Data TEST= new Data("TEST",3);
		ArrayA.add(Fred);       
		ArrayA.add(Jo);
		ArrayA.add(Zoe);
		ArrayA.add(Harry);
		ArrayC.add(Max);
		ArrayC.add(Fred);       
		ArrayC.add(Jo);
		ArrayC.add(Zoe);
		ArrayC.add(Harry);
		ArrayC.add(TEST);
	
//		System.out.println("ArrayA");
//		PrintDataArray(ArrayA);
//		System.out.println();
//		ArrayB = ArrayA;
//		System.out.println("ArrayB");
//		PrintDataArray(ArrayB);
//		ArrayB.add(2, Harry);
//		System.out.println();
//		ArrayA.remove(0);
//		PrintDataArray(ArrayB);

	
		PrintDataArray(ArrayC);
		System.out.println();
		ArrayD = (ArrayList<Data>)ArrayC.clone();
		ArrayC.remove(1);
		PrintDataArray(ArrayC);
		System.out.println();	
		PrintDataArray(ArrayD);
		System.out.println();

	
	
	

	}
	
	//  This method displays the contents of a two dimensional array. Understand how it works since it is very useful!
	
	public static void PrintArray()
	{
		int array_list[][] = new int[2][5]; 
	
		for(int i=1;i<array_list.length;++i)
		{
			for(int j=1;j<array_list.length;++j)
			{
				System.out.print(array_list[i][j] + " ");
			}
			System.out.println("");
	    }
	
	}
	//This method displays the contents of a two dimensional array. Understand how it works since it is very useful!

	
     private static void Castingpart1() 
     {
     //int x = 10;   // gives error two different data types trying to pass the same value across 
     //double y = x; // Saying y that is double equals to x that is integer 
     //System.out.println(y);
     }
     
     
    private static void Castingpart2()  
    {
    System.out.println();
    System.out.println("This program is not very exciting, but we will use it to demonstrate how to convert from one data type to another. Swap the data types of variables x and y around. What happens? We should get an error; Java will tell us that it does not know how to put a double into an int. In the previous case, we should note that the set of real numbers contains the set of integers.");
    double x = 10.3; // Passing on the Data
    long y = (long)x;
    System.out.println(y);
    
    int x1 = 20; // Passing on the Data from one value to another
    long y1 = (long)x;
    System.out.println(y1);
    
    System.out.println("");
    System.out.println("Note that longs and floats have a shorthand notation to implicitly state a variable type:");
    	Long v1 = 10L;
    	Float v2 =  10.3f;
    System.out.println("Observe what happens when you remove the L and F. Rewrite these lines using casting.");
    System.out.println("DOESN'T WORK BECAUSE NEED TO CONVERT DATA TYPE FROM FLOAT TO DOUBLE");
    System.out.println(" int v1a = 10;");
    System.out.println(" Float v2a = (Float) 10.3;"); 
    System.out.println("DOESN'T WORK BECAUSE NEED TO CONVERT DATA TYPE FROM FLOAT TO DOUBLE");
    System.out.println("");
    System.out.println("Another example of casting:");
    System.out.println("This will not work.");
    // Byte byy = new Byte(255); // Not correct need to add cast argument ('Byte')
    // System.out.println(byy); ASSIGNED OWN PERSONAL VARIABLE NAMES "BYY" IT'S MEANT TO BE "By"
    System.out.println("");
    System.out.println("This will work.");
    Byte by = new Byte((byte)256);
    System.out.println(by);
    // THE REASON WHY IT WON'T WORK//
    // A byte has only 8 bits. A bit is a binary digit. So a byte can hold 2 (binary) ^ 8 numbers which is 256 possiblities ranging from 0 to 2^8-1 = 255. It's the same as asking why a 3 digit decimal number can represent values 0 through 999, which is answered in the same manner (10^3 - 1).//
    System.out.println("");
    
 


    }











}
	    	
	    	

	    	
		
	    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

    


		
	
    



 //////////////////////////////////////////////////////////////////////////////////// FAILED ATTEMPT //////////////////////////////////
    
    
//ArrayList<Data> ArrayA  = new ArrayList<Data>();
//	       ArrayList<Data> ArrayB  = new ArrayList<Data>();
//		Data ArrayA1 = new Data("Fred",21);
//		ArrayA1.Print();
//		Data ArrayB1 = new Data("Jo",43);
//		ArrayB1.Print();
//		Data ArrayC = new Data("Harry",78);
//		ArrayC .Print();
//		Data z = new Data("Zoe",37);
//		z.Print();
//
//
//	
//	   Data Fred1 = new Data("fred",21);
//     Data Jo = new Data("jo",43);
//     Data Zoe = new Data("Zoe",37);
//     ArrayA.add(Fred1);
//     ArrayA.add(Jo);
//     ArrayA.add(Zoe);
//	        PrintDataArray(ArrayA);
//	        System.out.println();
//	        ArrayList<Data> ArrayB = ArrayA;
//	        PrintDataArray(ArrayB);
//	        System.out.println();
//	        ArrayA.remove(1);
//	        PrintDataArray(ArrayB);
//    	



//////////////////////////////////////////////////////////////EXAMPLE CODE ALL OF LAB 5 BELOW//////////////////////////////////////////////////////////////////////////////////////////////






//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//
//
//
//public class CS1702_Lab5 {
//	public static void main(String args[]) 
//	{
//		
//		 ArrayList<Data> array_list = new ArrayList<Data>(); 
//		 
//		 Data a = new Data("fred",21); 
//		 Data b = new Data("jo",43); 
//		 Data c = new Data("Zoe",37);
//		 array_list.add(a); array_list.add(b); array_list.add(c);
//		 
//		PrintDataArray(array_list);
//		//Casting(); //This will give you an error as the type of variable needs to be declared 
//		//Castingpart2();
//		//ArrayListImplementationConsiderations();
//		//PrintArray();
//		JOptionPane.showMessageDialog(null,"agree fahim stinks...");
//	}
//
//
//
//
//		private static void PrintArray()
//		{
//			int array_list[][] = new int[5][5];
//
//			for(int i=4;i<array_list.length;++i)
//			{
//				for(int j=4;j<array_list.length;++j)
//				{
//					System.out.print(array_list[i][j] + " ");
//				}
//				System.out.println("");
//			}
//		}
//
//	
//
//	private static void ArrayListImplementationConsiderations() {
//		// TODO Auto-generated method stub
//		ArrayList<Data> ArrayA  = new ArrayList<Data>();
//		ArrayList<Data> ArrayB  = new ArrayList<Data>();
//
//		Data Fred1 = new Data("fred",21);
//		Data Jo = new Data("jo",43);
//		Data Zoe = new Data("Zoe",37);
//		ArrayA.add(Fred1);
//		ArrayA.add(Jo);
//		ArrayA.add(Zoe);
//		PrintDataArray(ArrayA);
//		System.out.println();
//		//ArrayList<Data> ArrayB = ArrayA;
//		//PrintDataArray(ArrayB);
//	//	System.out.println();
//		//ArrayA.remove(1);
//		//PrintDataArray(ArrayB);
//	}
//
//	private static void Castingpart2() {
//		// TODO Auto-generated method stub
//		double x = 10.3;
//		int x = y ;
//		System.out.println(y);
//	}
//
//	private static void Casting() {
//		// TODO Auto-generated method stub
//		int x = 10;
//		double y = x;
//		System.out.println(y);
//	}
//
//	private static void PrintDataArray(ArrayList<Data> array)
//	{
//		for(int i=0;i<array.size();++i)
//		{
//			array.get(i).Print();
//		}
//	}
//
//
//
//}
















































































