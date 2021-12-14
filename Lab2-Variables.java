
public class CS1702_Lab2 {

	public static void main(String args[])

	{
    Introduction2_1();
    Assignment_Expressions2_2();
    Reservewords2_3();
	}
		
	public static void Introduction2_1()
	{
		System.out.println("This laboratory session is designed to give you an understanding of the workings of Java variables. Remember if you want to keep any of your Java programs then you must save them on a network drive and not on the local [University Lab] computer’s hard drive.");
		System.out.println("Code has been commented out as it was the example in the worksheet");
	////////////////////////EXAMPLE////////////////////////////////	
			
		 //   long x;          // Means whole number
		//	x = 100;              // Answer: 100
		//	System.out.println(x);
		//	x = x + 10; //Line A   // Answer: 110
		//	System.out.println(x);
		//	x = x + 20; //Line B   //Answer: 130
		//	System.out.println(x);  
	
	////////////////////////EXAMPLE////////////////////////////////	
		
			
		//	Long x;       x is a decimal number means the data type should be a double not Long
	    //                Since x is already taken in this method so you cannot have the same variable representing two different values
		//	x = 100.1;    
		//	System.out.println(x);
		//	x = x + 10.2; //Line A
		//	System.out.println(x);
		//	x = x + 20.3; //Line B
		//	System.out.println(x);
			
	}
	
	public static void Assignment_Expressions2_2()
	{
		
		System.out.println("Lab sheet questions2.2");
		long x;        // declaring variables 
		Double y, b, c, pi;
		String z, h, name, e, f; 
		int a;
		Boolean d;
        long g;
        final double I;  // It's means you cannot change the value of the variable 
		// "I put Dim e,f statement" which works however breaks the rule on line 37 instead should of put "Dim e,f As String"
	
		a = 100;
		b = 2.3;
		c = -52.2;
		d =  true;
		e = ("I am");
		f = ("a student");
		g = 0;
		h = "!";
		name = ("Jatinder");
		pi= 3.142;

		System.out.println();
		System.out.println("Question1 y = a + b:");
		a = 100;
		b = 2.3;
	    y= a+b;
	    System.out.println(y);

		System.out.println();
		System.out.println("Question2 y = a + d:");
		a = 100;
		d =  true;
 //     y= a+ d;
        System.out.println(y); //  Incorrect answer because y is considered as a double, a is considered int, d is considered as boolean
		
    	System.out.println();
		System.out.println("Question3 z = e + f:");
		e = "I am";
		f = " a student";
		z= e + f;
		System.out.println(z);
		
		System.out.println();
        System.out.println("Question4 y=bc:");
		b = 2.3;
		c = -52.2;
		y = b * c;
		System.out.println(y); 

		System.out.println();
	    System.out.println("Question5 pi = 22/7:");
		I = 22 / 7;
		System.out.println(I);

		System.out.println();
        System.out.println("Question6 Z = name / g:");
		name= "Jatinder";
	//	g = 0;
	//	z= name / g;
	    System.out.println(z);
	
	    
	    System.out.println();
	    System.out.println("Question7 z=c/g:");
		c = -52.2;
	//	g = 0;
	//	z = c / g; 
		System.out.println(z);
		// "I put Dim e,f statement" which works however breaks the rule on line 37 instead should of put "Dim e,f As String"
		
		System.out.println();
	    System.out.println("Question8 x=x^3:");
	    x= 10;
	    x= (long)  Math.pow(x, 3);
		System.out.println(x);//  X is considered a set variable to be long as it has not been declared to any sort of value so x^3 still works out to give a valid answer.
		
		System.out.println();
		System.out.println("Question9 z = name +  Is  + f + h: ");
		System.out.println("Works Correctly uses my name and adds 'a student' with '!' ");
		z = name + " Is "+ f + h;
	    System.out.println(z);
		
		System.out.println();
		System.out.println("Question10 y = (name + 10)/(name + h)");
		System.out.println("Won't function because Y is a double");
		System.out.println("The operator / is undefined for the argument type(s) java.lang.String, java.lang.String");
		// y= (name + 10) / (name + h); 
		// (name + 10) / (name + h);
	    // System.out.println(y);
	
		System.out.println();
		System.out.println("Question11 x = (a +b)/(d+c)");
		System.out.println("Won't function because d is a boolean and comes up with an error of arguements");
	//	x = (long) ((a + b) /(d + c);
		a = 100;
		b = 2.3;
		c = -52.5;
		d = true; 
	//	System.out.println(x);
		
		System.out.println();
		System.out.println("Question12 y = 100.3  y = (y / (a + b)) - c");
		a = 100;
		b = 2.3;
		c = -52.2;
    	y = 100.3;//
		y = (y / (a + b)) - c;//
		System.out.println(y);
		
		System.out.println();
        System.out.println("Question13 x^2 = y^2 + z^2");
        System.out.println(" It won't work because every variable is a different data type");
        System.out.println(" X is Long, Y is Double, Z is String");
        System.out.println(" 1: None of the variables are assigned actual values");
        System.out.println(" 2: Z data type is a string that is not the correct data type, it should be long, double or int");
     //  Math.pow(x,2);
     //  Math.pow(y,2);
     //  Math.pow(z,2);
     //  x*x=y*y+z*z;
    //   System.out.println(x);
		
    	System.out.println();
		System.out.println("Question14 name =  Is  + f - h");
		f = "a student";
		h = "!";
	//    name = "Is" + f - h; Doesn't work because of the subtraction operator 
	    System.out.println(name);
	    
		System.out.println();
	    System.out.println("Question15 ((pi + 1)/(pi + 2))/(pi + 3)");
        y = ((pi + 1) / (pi + 2)) / (pi + 3);
	    System.out.println(y);
		
	    System.out.println();
	    System.out.println("Question16");
      	y = (double) -2;
		y = (Math.pow(y,2)/b)/(1/3);
		System.out.println(y);
		
		 System.out.println();
		 System.out.println("Question17 z = b/g, z= y + name");
		 System.out.println("Question17 Part1: z= b/g");
		 b = 2.3;     
		 g = 0; 
	//	 z= b/g;
		 System.out.println("Won't work because Z is a string, 'B' & 'G' are numbers & 2.3/0 is Error");
	//   System.out.println(z);
	
		 System.out.println("Question17 Part2: z=y + name");
		 z= y + name; // Z is a string, y is a double , Name is String
		 System.out.println(z);
	
	     System.out.println();
		 System.out.println("Question18 z = name , z = b/g + z");
		 System.out.println("Z is a string so it won't work since b & g is number");
		 System.out.println("Question18 Part 1 z = name");
		 name=("Jatinder"); 
		 z = name;
	     System.out.println(z); // Prints out the name
			
		 System.out.println("Question18 Part 2 z = b/g + z");
		 System.out.println("Z is a string and B,G are numbers so the answer will not compute");
		 z = b/g + z;
		 System.out.println(z);
		 
		 System.out.println();
		 System.out.println("Question19 y= -2.3 y=ay^2 +by + c");
		 y = -2.3;
		 y = (Math.pow(y, 2)*a) + b * y+ c;
		 System.out.println(y);
		
		 System.out.println();
		 System.out.println("Question20 y = y - (a - b) ^ (b - c) ^ (c - d) ");
		 System.out.println("Question20 doesn't work because d is a boolean a,b,c are numbers");
	//	 y= Math.pow(a, b) * Math.pow(b, c) * Math.pow(c, d);
	//	 System.out.println(y);
		 
	    }
	
	 public static void  Reservewords2_3()
	 {
	 System.out.println("--------------------------RESERVEWORDS--------------------");
	 System.out.println("As we know, a Reserved Word is a special computer programming instruction which cannot be used as a variable name. For example, the symbol if is a reserved word within Java (and almost all other programming languages). Try and declare the following variables, determine whether they are reserved words or if they are invalid variable names:");
	 System.out.println(" for, four, 4, x4, x_4b, while, While, switch, Switch, $witch, switch23, package, throw, new, name, friends, class, object, student, day, date, time, month, year, age, height, weight, 17beans, beans17, note,' x_'");
	 System.out.println("The word 'for' is a Reserved word");
	 System.out.println("The word 'four' is not a Reserved word");
	 System.out.println("The word '4' is not a Reserved word");
	 System.out.println("The word 'while' is a Reserved word");
	 System.out.println("The word 'While' is a Reserved word");
	 System.out.println("The word 'switch' is a Reserved word");
	 System.out.println("The word 'Switch' is a Reserved word");
	 System.out.println("The word '$witch' is not a Reserved word");
	 System.out.println("The word 'package' is a Reserved word");
	 System.out.println("The word 'throw ' is not a Reserved word");
	 System.out.println("The word 'new' is not a Reserved word");
	 System.out.println("The word 'name'is not a Reserved word");
	 System.out.println("The word 'friends' is not a Reserved word");
	 System.out.println("The word 'class' is not a Reserved word");
	 System.out.println("The word 'object' is not a Reserved word");
	 System.out.println("The word 'student'is not a Reserved word");
	 System.out.println("The word 'day' is not a Reserved word");
	 System.out.println("The word 'date' is not a Reserved word");
	 System.out.println("The word 'time' is not a Reserved word");
	 System.out.println("The word 'month' is not a Reserved word");
	 System.out.println("The word 'year' is not a Reserved word");
	 System.out.println("The word 'age' is not a Reserved word");
	 System.out.println("The word 'height' is not a Reserved word");
	 System.out.println("The word 'weight' is not a Reserved word");
	 System.out.println("The word '17beans' is not a Reserved word");
	 System.out.println("The word 'beans17' is not a Reserved word");
	 System.out.println("The word 'note' is not a Reserved word");
	 }
	
	 
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
