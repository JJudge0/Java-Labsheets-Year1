import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;
public class CS1702_Lab7 
{

	private static boolean a1;
	private static boolean b1;

	static public void main(String args[])
	{
		
		
//		Introduction_7_1();
		Preliminaries_7_2();
		Writing_User_Defined_Functions_7_3();
		NonRecrusive_Functions_7_4();
		Even_Odd_7_4_1();
		Reverse_String_7_4_2();
		Leap_Year_7_4_3();
		Days_in_a_month_7_4_4();
        Days_alive_7_4_5();
		The_Fibonacci_Sequence_7_4_6(0);
		A_User_Defined_Function_for_the_Finch_Robot__7_5();
//		Recursive_Functions_7_6();
		Character_Counter_7_6_3();
		Palindrome_7_6_4(Palindrome_7_6_4(a1, b1), a1);
		McCarthy_91_Function_7_6_5(0); //My Method 1
	    mcCarthy1(); // My Method 2
	    
		
		
//		EvenOdd();
//		Leap_year();
//	wrong_Days_in_a_Month();
//	    Right_days_in_month();
//		Days_alive(); // not done correctly
//        Reverse_String();
//        String_Reverse_mathod_2(); //another way to do it!!!
//		String_counter();
//		String_counter_2("hello",0);
//		System.out.println(fibonacciRecursive(3)); // this is calling the function to say the value is 12 ( task - fibonacciRecursive)
	    
	}
	

	public static void 	Introduction_7_1()
	{
	  System.out.println("");
      System.out.println("This laboratory worksheet covers the use of user defined functions, methods and classes within the Java programming environment. This laboratory involves the creation of a number of Java programs. Make sure that you save any code you write. Also make sure you save any results or notes that you observe about your work.");
	}
	public static void  Preliminaries_7_2()
	{
	  System.out.println("");
      System.out.println("Asks for Nothing");
	}
	
	public static void  Writing_User_Defined_Functions_7_3()
	{
////////////////////////EXAMPLE////////////////////////////////	
//		public class CS1702_Lab7
//		{
//			static public void main(String args[])
//			{
//				int i;
//				boolean eo;
//				String s = "";
//				
//				for(i=1;i<=25;++i)
//				{
//					eo = EvenOdd(i);
//					s = (eo)?"Even":"Odd";
//					System.out.println(i + " is " + s);
//				}
//			}
//			static public boolean EvenOdd(int x)
//			{
//				//...
//			}
//		}
////////////////////////EXAMPLE////////////////////////////////	
		System.out.println("Writing a program for even and odd numbers:"); 
		int i;
		int eo;
		String s = "";

		for(i=1;i<=25;i+=3) // iNCLUDES NBUMBER 1 to 25 and adds 3 each increment    //++i) // Returns value of x stored as EvenOdd
		{
			eo = EvenOdd(i);
			s = (eo %2==0)?"Even":"Odd"; //mod 2 dives by 2
			System.out.println(i + " is " + s);
		}
	}

	static private int EvenOdd(int x)
	{
		return x; // Returns value of x stored as EvenOdd
	}

	public static void   NonRecrusive_Functions_7_4()
	{
		System.out.println("Design, implement and test the following six problems/exercises using non-recursive functions/methods.");
		System.out.println("What is a NonRecrusiveFunction? In computer science, recursion is a method of solving a problem where the solution depends on solutions to smaller instances of the same problem. So a Non-recrusive function is the opposite of that.");
		
	}
	public static void  Even_Odd_7_4_1() 
	{
		System.out.println("Question:Write a function that returns true if an integer (or long) is even and false if the number is odd.");
		String even,odd;
		even= "true that is a even number";
		odd = "false that is a odd number";
		Scanner InputScan = new Scanner(System.in);
		System.out.println("Write a number");
		int ChooseNumber =InputScan.nextInt();
		System.out.println("Writing a program for even and odd numbers:"); 
		double i;
		double eo=0;
		String s = "";

		for(i=1;i<=1;++i) // iNCLUDES NBUMBER 1 to 25 and adds 3 each increment    //++i) // Returns value of x stored as EvenOdd
		{
			eo = EvenOdd1(ChooseNumber);
			s = (eo %2==0)?even:odd; //mod 2 dives by 2
			System.out.println(ChooseNumber + " is " + s);
		}
	}
	static private int EvenOdd1(int x1)
	{
		return x1; // Returns value of x stored as EvenOdd
		
		
	}

	
	
	public static void  Reverse_String_7_4_2() 
	{
		System.out.println("Write a function that when passed a character string, returns the string in reverse order.");
		System.out.println("Input a word or sentence:");
		Scanner InputScanner1= new Scanner(System.in);
		String Userinput= InputScanner1.nextLine();
		String ReverseString;
		ReverseString=  new StringBuilder(Userinput).reverse().toString();
		System.out.println( ReverseString);

	}
	
	
	public static void  Leap_Year_7_4_3()
	{
		int year;
		System.out.println("Write a function that returns true if a year is a leap year and false otherwise.");
		System.out.println("Enter an Year "); // Asking for the input 
		Scanner ly = new Scanner(System.in); // scanner being imported to store it 
		year = ly.nextInt(); // has been stored in year = ly

		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) // getting the number and saying if by those numbers it can tell if its a leap or not
			System.out.println("This is a leap year-TRUE!");
		else
			System.out.println("This is NOT a leap year-fALSE!");

	}
	public static void  Days_in_a_month_7_4_4()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("For a given a month and year write a program that returns the number of days in that month. Hint: use the function you wrote for calculating whether a year is a leap year or not. You could also use some of the code you wrote for a previous worksheet.");
		int number_Of_DaysInMonth = 0; // making the variable empty at start 
		String MonthOfName = ""; // saying that it will be between the string

		System.out.print("Input a month number eg 3 for march "); //asking for the input
		int month = input.nextInt(); // this function stores the input 

		System.out.print("Input a year: ");
		int year = input.nextInt();

		switch (month) {
		case 1:
			MonthOfName = "January";
			number_Of_DaysInMonth = 31;
			break;
		case 2:
			MonthOfName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) { // there can be 2 cases for feb if it is a leap year or not 
				number_Of_DaysInMonth = 29;
			} else {
				number_Of_DaysInMonth = 28;
			}
			break;
		case 3:
			MonthOfName = "March";
			number_Of_DaysInMonth = 31;
			break;
		case 4:
			MonthOfName = "April";
			number_Of_DaysInMonth = 30;
			break;
		case 5:
			MonthOfName = "May";
			number_Of_DaysInMonth = 31;
			break;
		case 6:
			MonthOfName = "June";
			number_Of_DaysInMonth = 30;
			break;
		case 7:
			MonthOfName = "July";
			number_Of_DaysInMonth = 31;
			break;
		case 8:
			MonthOfName = "August";
			number_Of_DaysInMonth = 31;
			break;
		case 9:
			MonthOfName = "September";
			number_Of_DaysInMonth = 30;
			break;
		case 10:
			MonthOfName = "October";                          // BREAKS ARE ALWAYS NEEDED IN SWITCH STAMENTS 
			number_Of_DaysInMonth = 31;
			break;
		case 11:
			MonthOfName = "November";
			number_Of_DaysInMonth = 30;
			break;
		case 12:
			MonthOfName = "December";
			number_Of_DaysInMonth = 31;
		}
		System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
	}
	public static void Days_alive_7_4_5() 
	{
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(2001, Month.JULY, 3);  //Birth date
		 
		Period p = Period.between(birthday, today);
		 
		
		//Now access the values as below
		System.out.println("Days");
		System.out.println(p.getDays());
		System.out.println("Months");
		System.out.println(p.getMonths());
		System.out.println("Years");
		System.out.println(p.getYears());
	}
	private static int  The_Fibonacci_Sequence_7_4_6(int i1) 
	{   
	    System.out.println("Write a program that when given a positive (say i) integer displays the first n Fibonacci numbers. If i is not a positive integer the program should generate an error.");
	    System.out.println("Enter number upto which Fibonacci series to print:");
	    int number= new Scanner(System.in).nextInt();
        System.out.println("Fib series up to("+ number + ")numbers:");
        
        if (number<0)
        {  
           	System.out.println("ERROR");
        }
        for(int i=1; i<=number; i++)
        { 
        	System.out.print(","+fibonacci2(i));
        }
        return i1; 
	}
	
	public static int fibonacci2(int number)
	{
		if(number ==1 || number==2)
		{
			return 1;
		}
		int fibo1=1, fibo2=1, fibonacci=1;
		for(int i=3; i<= number; i++) 
		{
			fibonacci= fibo1 + fibo2;
			fibo1= fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci;
	}
	
	
	public static void A_User_Defined_Function_for_the_Finch_Robot__7_5() 
	{
         System.out.println("Specification changed CANNOT DO!");
	}
	public static void  Recursive_Functions_7_6() 
	{  
		System.out.println("Factorial");
		System.out.println("Develop a function that returns x! for a given number x, note that this requires a very small change to be made to the recursive function we discussed in the lecture. Make sure you test for all of the valid ranges for x. What is the maximum value of x! that Java can handle?");

		Scanner InputScanner = new Scanner(System.in);
		int x0 =InputScanner.nextInt();
		oddEvenChecker(x0);

		int x1 =InputScanner.nextInt();
		oddEvenChecker(x1);
	}
	
	public static void Character_Counter_7_6_3()
	{
		System.out.println("Write a recursive function that returns the number of times that a character occurs in a string. For example, if the string is “abracadabra” and the character is ‘a’ then the function returns 5.");
		
//		
//		  Function Charactercount(ByVal word As String, ByVal num5 As Char) As Integer
//	        Dim num4 As Integer = 0
//	        For Each c As Char In word
//	            If c = num5 Then
//	                num4 += 1
//	            End If
//	        Next
//	        Return num4 'counts the amount of characters once specified the certain word chosen
//	    End Function
		
		
		Scanner CharacterCounter = new Scanner(System.in);
		System.out.println("Enter a word");
		String string =  CharacterCounter.nextLine();
		Scanner CharacterCounter1 = new Scanner(System.in);
		System.out.println("To count how many letters are in the word type 1 letter below:(PLEASE NOTE CASE SENSITIVE)");
		
		char string1 = CharacterCounter1.next().charAt(0);
		char someChar = string1;
		//  String string = "sashimi";

		int count = 0;
		for(int i =0; i < string.length(); i++){
			if(string.charAt(i) == someChar){
				count++;
			}
		}
  //      System.out.println("The word inputted by the user is:"+	CharacterCounter1);
		System.out.println("The word"+string+","+"and the letter chosen is("+string1 + ")and the number of letters from the word is " + count);
	
	
//		    String someString = "elephant";
//		    char someChar = 'e';
//		    int count = 0;
//		     
//		    for (int i = 0; i < someString.length(); i++) {
//		        if (someString.charAt(i) == someChar) {
//		            count++;
//		        }
//		    }
//		    assertEquals(2, count);
	
	
	}
	



	public static boolean Palindrome_7_6_4(boolean a1, boolean b1)
	{
	    System.out.println("Another way to do it");
		Scanner scanner = new Scanner(System.in);
	    String str = scanner.nextLine();
		System.out.println("A palindrome is a word, phrase, verse, or sentence that reads the same backwards or forwards. Write a recursive function that takes as input a character string and returns true or false depending on whether the string is a palindrome or not. Look on the web for some useful test cases (search for palindrome on Google for example).");
	    str.equals(new StringBuilder(str).reverse().toString());
		System.out.println(str);
		a1= true;
		b1= false;
			  
			  
		  Scanner scan = new Scanner(System.in);
		  int right = 0;
		  int left = 1;
          
		  System.out.println("Please enter a word: ");
		  String word = scan.next();
		  String t = word.toLowerCase();
		  int word_length = word.length();

		  while(t.charAt(right) == t.charAt(word_length - left) && left < (word_length / 2))
		  {
			  left++;
			  right++;
		  }

		  if(t.charAt(right) == t.charAt(word_length - left))
		  {
			 System.out.println("'" + t + "'" + " is a palindrome so it's"+ a1);
			  return a1;
		  }
		  else
		  {
			  System.out.println("'" + t + "'" + " is NOT a palindrom so it's"+b1);
			  return b1;
		  }


		  
	}
	
	public static void McCarthy_91_Function_7_6_5(int Num1)
	{
		System.out.println("Implement the following mathematical formulae as a recursive function. Known as the The McCarthy 91 Function");
		
		Scanner scanner = new Scanner(System.in);
	     Num1 = scanner.nextInt();	
		System.out.println(McCarthy_91(Num1));
		System.out.println("Test the function on integers ranging from -250 to 250. What do you notice about this function?");
		
	}
	
	private static int McCarthy_91(int M1)
	{
		int result; // All numbers from 1 to 100 have the return function of 91 anything above it will increase.
		if (M1<=100)
		{
		    return McCarthy_91(McCarthy_91(M1 + 11));
		}
		else
		{
		result=	(M1 - 10);
		}
		    return result;
	}

	public static void mcCarthy1()
	{
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter a number for the McCarthy91 Function");
		int n = scanner1.nextInt();
		System.out.println(mcCarthy(n));
	}
	
	
	public static int mcCarthy(int i) 
	{
		int output;
		if (i >=100)
		{
			return i - 10;
		}
		else
		{
			output= mcCarthy(mcCarthy(i+11));
		}
		return output;
	}

	   
	    
	        
	    
	
	
	
	

	private static int oddEvenChecker(int xMain) 
	    {
	     Boolean Fact,Non_fact;
	     Fact= true;
	     Non_fact= false;
	     
	     
	        if (xMain % 2 == 0)
	            System.out.println(Fact+","+ xMain);
	        else
	            System.out.println("You entered an odd number." + xMain);
	        return xMain;
	    }
	
	

	
	
	
	
	
	
	
	
	
	
	
	
//	public static void EvenOdd() 
//	{
//	
//		int i;
//		int eo;
//		String s = "";
//		for(i=1;i<=30;i+=3)// Increments between 1 and smaller but equal to 30
//		{
//			eo = EvenOdd(i);
//			s = (eo % 2 ==0)?"Even":"Odd"; // added code to make the module know if is is divisible by 2 make even 
//
//			System.out.println(i + " is " + s);
//		}
//	}
//	static public int EvenOdd( int x)
//	{
//		return x;
//		//...
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void String_counter_2(String s,int count) {
	
		char  first = s.charAt(0);
		String rest = s.substring(1,s.length()); //Substring = gives u a chunk of string from the postion you spcify 
		
	    System.out.print(first +" "+rest+" " );
		
		if (s.charAt(0)=='l') // java has apsotrphy for charecters and speech marks for string
		{
			count++;
		}
		System.out.print(count);
		
		if (s.length() >1) {
			String_counter_2(rest,count);
		}
		
	}
	private static void String_counter() {
	
		
		Scanner input = new Scanner(System.in);
	    System.out.print("please enter a word");
	    String word = " ";
	    int Count = 0;
	     word = input.nextLine();
	    System.out.print("enter a letter");
	    char letter = input.next().charAt(0);
	    for (int i=0; i<word.length();i++)
	    {
	    	if (word.charAt(i)==letter)
	    	{
	    		Count++;
	    	}
	      
	    	
	    }
	  System.out.println(Count);
	}  
	
	private static void String_Reverse_mathod_2() {
		

		Scanner p = new Scanner (System.in);
		String k = " ";
		System.out.print("Please enter a word"); 
		k = p.nextLine();
		for (int i=k.length()-1; i>=0;i--) // this is getting you the index
		{
			System.out.print(k.charAt(i));//for (j=i ; j) // char.AT will return the charectar in that postion
		}
		}
		private static long fibonacciRecursive(long i) 
		{
		

			if ((i == 0) || (i == 1)) // it is checking weather it is 0 or 1 
				return i;
			else
				return fibonacciRecursive(i - 1) + fibonacciRecursive(i - 2); // else it is going back 1 and adding 1 from the forward 



		}

//private static int Days_alive() {		
//		{
//			int number;
//			Temporal localDate = null;
//			int daysBetween = (int) ChronoUnit.DAYS.between((Temporal) localDate, java.time.LocalDate.now()); // this has to be checked 
//				return daysBetween;
//
//			}






		private static void Right_days_in_month() {
	
			Scanner input = new Scanner(System.in);

			int number_Of_DaysInMonth = 0; // making the variable empty at start 
			String MonthOfName = ""; // saying that it will be between the string

			System.out.print("Input a month number eg 3 for march "); //asking for the input
			int month = input.nextInt(); // this function stores the input 

			System.out.print("Input a year: ");
			int year = input.nextInt();

			switch (month) {
			case 1:
				MonthOfName = "January";
				number_Of_DaysInMonth = 31;
				break;
			case 2:
				MonthOfName = "February";
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) { // there can be 2 cases for feb if it is a leap year or not 
					number_Of_DaysInMonth = 29;
				} else {
					number_Of_DaysInMonth = 28;
				}
				break;
			case 3:
				MonthOfName = "March";
				number_Of_DaysInMonth = 31;
				break;
			case 4:
				MonthOfName = "April";
				number_Of_DaysInMonth = 30;
				break;
			case 5:
				MonthOfName = "May";
				number_Of_DaysInMonth = 31;
				break;
			case 6:
				MonthOfName = "June";
				number_Of_DaysInMonth = 30;
				break;
			case 7:
				MonthOfName = "July";
				number_Of_DaysInMonth = 31;
				break;
			case 8:
				MonthOfName = "August";
				number_Of_DaysInMonth = 31;
				break;
			case 9:
				MonthOfName = "September";
				number_Of_DaysInMonth = 30;
				break;
			case 10:
				MonthOfName = "October";                          // BREAKS ARE ALWAYS NEEDED IN SWITCH STAMENTS 
				number_Of_DaysInMonth = 31;
				break;
			case 11:
				MonthOfName = "November";
				number_Of_DaysInMonth = 30;
				break;
			case 12:
				MonthOfName = "December";
				number_Of_DaysInMonth = 31;
			}
			System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");

		}





	

		private static void Reverse_String( ) {
			String i = "Hello";
			StringBuilder f = new StringBuilder(i); // string builder is the function which allows us to store the string 
			if (i.equals(f.reverse()));// this is the function which allows a person to be able to print in reverse 
			System.out.print(f); 
		}

		private static void reverseString(String string) 
		{
	           reverseString("hello");
		}


//char first = s.charAt(0);
//String rest = s.substring(2,s.length());
	


	
	
	
	
}
	
	
	
	

