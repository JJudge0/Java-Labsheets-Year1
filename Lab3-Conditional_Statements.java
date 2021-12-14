import java.util.Scanner;  // imports scanner utility in order for user to interact with the console 
public class CS1702_Lab3 {



	static public void main(String args[])
	
	{
		 
	               Introduction_3_1();  
		   Relational_Operators_3_2();
		 Designing_ifstatements_3_3();
		    Compound_Conditions_3_4();
		       Switch_Statement_3_5();      
		               Notation_3_6();
	}
	
	public static void Introduction_3_1()
	{
		System.out.println("3.1------------------INTRODUCTION------------------");
		System.out.println("Code has been commented out as it was the example in the worksheet");
	////////////////////////EXAMPLE////////////////////////////////	
			
		//  	int a = 1000,b = -22; //It's declaring the variable a,b as "integers"
		// 	
		//	   if (a < b) 
		//	   {
		//	      System.out.println("a is less than b");
		//	   }
		//	   else
		//	   {
		//	      System.out.println("a is NOT less than b");
		//	   }
		// If 'a' is smaller than 'b' write "a is less than b" if not system write "a not less than b".
	
	////////////////////////EXAMPLE/////////////////////////////////
			
	}
	
	 public static void Relational_Operators_3_2()
	 {
		 System.out.println("3.2------------------ RELATIONAL OPERATORS------------------");
		
	// Declaring my variables 
		 int x,y;
		 double z,c;
		 boolean a,b;
		 x=100;
		 y=204;
	     z= -23.1;
		 c= -204;
		 a= true;
	     b= false;
		 
		 
	      System.out.println("Question1: x < y");   // x is smaller y if it'S 'TRUE' it will print it out however if 'FALSE' then it will print the second one.
		  if (x < y)
		  {
		  System.out.println("x is less than y TRUE" );
		  }
		  else
		  {
		  System.out.println("x is NOT less than y FALSE" );
		  }
		  System.out.println();
		  System.out.println("Question2:  x > z and a = b");
		 if ((x > z) && ( a==b )) // X is bigger than z AND is a equal to b
		   {
		  System.out.println("False 'x' is smaller than 'z' but 'a' does  equal to 'b' ");
		   }
		 else
		   {
		  System.out.println("True 'x' is bigger than 'z' but 'a' does not equal to 'b' ");
		   }
		  System.out.println();
		  System.out.println("Question3: 2c < y");
		  if (2*c < y) 
		   {
		  System.out.println("2c equals too" + 2*c + " is less than y which equals too" +","+ y);
		   }
		   else
		   {
		  System.out.println("2c is NOT less than y");
		   }
		  System.out.println();
		  System.out.println("Question4: x = b");
		  System.out.println(" Cannot do integer with boolean");
		//  if (x==b)  Cannot do integer with boolean
		   {
		//  System.out.println("2c is less than y");
		   }
		//   else
		   {
		//  System.out.println("2c is NOT less than y");
		   }
		  System.out.println();
		  System.out.println("Question5: c ≠ y or c = y");
		  if (( c!=y) || (c==y))
		  {
		  System.out.println(a + " 'C' is not equal to Y OR 'C' is equal to 'y' "); // The Statement is True because only 1 of the statements is needed for it to be True if it was And the entire statement would be false 
		  }
		  else
		  {
		  System.out.println(b);
		  }
		  System.out.println();
		  System.out.println("Question6: z ≠ y and c = a");
		  System.out.println("C==A does not function since 'C' is  a number and 'a' is boolean");
//		  if (( z!=y) || (c==a))
		  {
		  System.out.println();
		  }
		  System.out.println("Question7: y ≥ y and a+3 ≠ 2");
		  System.out.println("a+3 does not function since '3' is  a number and 'a' is boolean");
//     	  if ((y >= y) && (a+3 != 2))
//          {
//		  System.out.println("True");
//          }
//	      else
//     	  {
//		   System.out.println("False");
//       }
		  	  
	 }
	  public static void  Designing_ifstatements_3_3()
	  {  
		 System.out.println();
	     System.out.println("3.3------------------DESIGNING IF STATEMENTS------------------");
		 System.out.println("1) Given three numbers, displays them in the correct order (ascending)");
		 System.out.println("I used seperate if statements so it could work it's way through until it finds a suitable sorting statement that matches the conditions set.");
		 
	    	boolean check1 = true;
			Scanner InputNumber = new Scanner(System.in);
			System.out.print("Input Number 1:");
			Long a = InputNumber.nextLong();
			
			System.out.print("Input Number 2:");
			Long b = InputNumber.nextLong();
			
			System.out.print("Input Number 3:");
			Long c =InputNumber.nextLong();
			System.out.println("The Numbers below are from Ascending Order:");
		 
		 
	 //     a = 10;      // "name1";  // Manually input numbers through the code not the console
	//      b = -10;     //"name2";
	//      c = 3;       // "name3";
	 
	     if((a < b)&&(b<c)){ //a,b,c
		 System.out.println(a+","+ b+ ","+ c);
	    	}
	     else if((a<c)&&(c<b)){ //a,c,b
		 System.out.println(a+","+c+","+b);
		    }
	     else if((b<a)&&(a<c)){ //b,a,c
		 System.out.println(b+","+a+","+c);
		    }
	     else if((c<a)&&(a<b)){ //c,a,b
		 System.out.println(c+","+a+","+b);
		    }
	     else if((b<c)&&(c<a)){ //b,c,a
		 System.out.println(b+","+c+","+a);
		    }
	     else if((c<b)&&(b<a)){ //c,b,a
		 System.out.println(c+","+b+","+a);
		    }
	 	 
		System.out.println("");
		System.out.println("2) Given three names (e.g. name1, name2 and name3 as string variables), display them in the correct alphabetical order");
		// All of the combinations are listed below the code works as the first letter of a name is inputted and it will put it in alphabetical order
	     System.out.println("Give the first letter of any name");
	     char name1,name2,name3;   //Declared variables name1,name2,name3
		 name1 ='J';              //name1= Jatinder
	     name2 ='A';              //Name2= Andy
		 name3 ='Q';              //Name3= Quin
	       
	     if((name1 < name2)&&(name2<name3)){ //name1,name2,name3
		 System.out.println(name1+","+ name2+ ","+ name3);
	    	}
	     else if(( name1< name3)&&( name3<name2)){ //name1,name3,name2
		 System.out.println( name1+","+ name3+","+name2);
		    }
	     else if((name2< name1)&&( name1< name3)){ //name2,name1,name3
		 System.out.println(name2+","+ name1+","+ name3);
		    }
	     else if(( name3< name1)&&( name1<name2)){ //name3,name1,name2
		 System.out.println( name3+","+ name1+","+name2);
		    }
	     else if((name2< name3)&&( name3< name1)){ //name2,name3,name1
		 System.out.println(name2+","+ name3+","+ name1);
		    }
	     else if(( name3<name2)&&(name2< name1)){ //name3,name2,name1
		 System.out.println( name3+","+name2+","+ name1);
	     }
	     
	  }
	 
	 
	  public static void  Compound_Conditions_3_4()
	  {   System.out.println();
		  System.out.println("3.4------------------Compound Conditions------------------");
		  System.out.println("1) Displays if a whole number (>0) is divisible by 2 and 3");
			int f0= 6;
			if (((f0%2)==0) && ((f0%3)==0)) // ADD COMMENTS
			{
			System.out.println("This number" + "(" + f0 +")" + " is disvisble by 2 &(&&)  3 ");
			}
			else
			{
            System.out.println("This number" + "(" + f0 +")" + "is not disvisble by 2 &(&&) 3 ");
			}
	        System.out.println();
			System.out.println("2) Displays if a whole number (>0) is divisible by 7 or 9");
			int f1= 63;
			if (((f1%7)==0) || ((f1%9)==0)) // Sees if it doesn't give remainder by using variable given to divide by '7' and see if it equals too 0 as in whole number
			{
			System.out.println("This number" + "(" + f1 +")" + " is disvisble by 7 Or(||) 9 ");
			}
			else
			{
            System.out.println("This number" + "(" + f1 +")" + "is not disvisble by 7 Or(||) 9 ");
			}
			System.out.println();
	        System.out.println("3) Displays if a whole number (>0) is divisible by 2 and 3 but not 5");
	        int f2= 20;
			if (((((f2%2)==0) && ((f2%3)==0)) != ((f2%5)==0))) // input a number and see if the statement is true to give whole number and it's says if the number is divisble by 3 and equal to 0 with no remainder 
			{
			System.out.println("This number" + "(" + f2 +")" + " is disvisble by 2 & 3 but not 5 ");
			}
			else 
		    {
			System.out.println("This number" + "(" + f2 +")" + "is disvisble by 2 & 3 & 5 ");
			}
			System.out.println();
	  }
	  
	  
	  
	public static void  Switch_Statement_3_5()
	{   
		System.out.println();
		System.out.println("3.5------------------Switch_Statements------------------");
		System.out.println("Question1: Consider the following code “snippet” that uses a switch statement:");
        String month = "February";
		int daysinmonth = 0;
						
		switch(month)
		{
			case "January": 
				daysinmonth = 31;
				break;
			case "February":
				daysinmonth = 28;
				break;
			case "March":
				daysinmonth = 31;
				break;
			case "April":
				daysinmonth = 30;
				break;
			case "May":
				daysinmonth = 31;
				break;
			case "June":
				daysinmonth = 30;
				break;
			case "July":
				daysinmonth = 31;
				break;
			case "August":
				daysinmonth = 31;
				break;
			case "September":
				daysinmonth = 30;
				break;
			case "October":
				daysinmonth = 31;
				break;
			case "November":
				daysinmonth = 30;
				break;
			case "December":
				daysinmonth = 31;
				break;
			default: 
				daysinmonth = -1;
				break;
		}
		System.out.println("Days in month " + month + " = " + daysinmonth);

        System.out.println();
	  
	    System.out.println("Question2: Write a similar pair of programs to the two above that use a switch statement to determine the number of legs a creature has (stored in a String in a similar manner to the month variable above). Remember to print the name of the creature as in the first switch statement.");
        System.out.println("Example code of writing a case given in the work sheet.");
//		////////////////////////EXAMPLE////////////////////////////////	
//		switch (month)
//		{
//		case "January": case "March": case "May": case "July": case "August": case "October": case "December":
//		daysinmonth = 31;
//		break;
//		case "February":
//		daysinmonth = 28;
//				break;     	
//		case "April": case "June": case "September": case "November":
//		daysinmonth = 30;
//				break;    
//		default: 
//		daysinmonth = -1;
//		break;
//		}
//		System.out.println("Days in month " + month + " = " + daysinmonth);
//		////////////////////////EXAMPLE////////////////////////////////	
		
		
		
		System.out.println("");
        System.out.println("Type in Animal from the following list; Alsatian Dog, Sphynx Cat, Cobra, Baboon, Centipede, Ocelot, Cod, Human, Tarantula, Black Scorpion, Paul Allen the German Octopus, Minke Whale, Klingon and Potto ");
    	String legs; // declared legs as string
		legs = ""; // For input 
		boolean verify = true; // Inputting error validation 
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object in order for the user to input a answer in the text console
        String Animal= myObj.nextLine();
        switch (Animal)
        { // All of the animals that were given in the lab sheet have be assigned cases based on the amount of legs each animal or biological specimen has
		case "cobra": case "cod": case "Minke Whale" :
			legs = "0";  //Animals with 0 legs
		    break;  // When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop. It can be used to terminate a case in the switch statement
		case "Human": case "Kingon": case "Paul Allen": 
			legs = "2";     //Animals with 2 legs
			break;
		case "Potto": case "Ocelot": case "Alsatian Dog": case "Sphynx Cat": case "Baboon": case "Cat":
		    legs = "4";    //Animals with 4 legs
		    break;
		    case "Black Scorpion":
		    legs= "8";    //Animals with 8 legs
		case" Centipede ":
			legs= "between 15 to 117";
			break;
		case "Klingon":
			legs= "Unknown";
			default: 
				verify = false;
				break;
        }
            if (verify == true) // Saying if the user inputs a animal of which is/ is not on the list of cases it will give a output of 1 telling the user how many legs it has or 2 a error
            {
            	System.out.println( "This Animal known as the "+ Animal + "" + "has" + "" + legs + ""+ "legs");
            }
            else
            {
            	System.out.println("ERROR input a valid Animal");
            }
            
        }
       
	  public static void  Notation_3_6()
	
	  {
		  System.out.println();
		  System.out.println("3.6-----------------The ?: Notation------------------");
		  System.out.println("Finally rewrite all of your answers to section 3.2 using the ?: notation. Which style do you think is better and why?");
		  
		     int x,y;
			 double z,c;
			 boolean a,b;
			 x=100;
			 y=204;
		     z= -23.1;
			 c= -204;
			 a= true;
		     b= false;
		  // Below I have done section 3.2 using the notation of ?;
		  System.out.println("Question1: x < y");
		  System.out.println((x<y) ? true : false); 
		  System.out. println("");
		  System.out.println("Question2:  x > z and a = b");
	      System.out.println(((x > z) && ( a==b )) ? true: false);
	      System.out. println("");
	      System.out.println("Question3: 2c < y");
	      System.out.println( (2*c < y) ? true: false);
	      System.out. println("");
		  System.out.println("Question3: 2c < y");
		  System.out.println(( 2*c <y) ? true: false);
		  System.out.println("Question4: x = b");
		  System.out. println("");
	//	  System.out.println((x=b) ? true: false); You cannot do at all because it's cannot do integer with boolean
		  System.out.println("Question5: c ≠ y or c = y");
		  System.out.println((( c!=y) || (c==y)) ? true: false );
		  System.out. println("");
		  System.out.println("Question6: (( z!=y) || (c==a))");
		  System.out.println("Doesn't function look for the comments within the code!");
	//	  System.out.println((( z!=y) || (c==a)) ? true: false );  C==A does not function since 'C' is  a number and 'a' is boolean
		  System.out.println("");
		  System.out.println("Question7:((y >= y) && (a+3 != 2))");
		  System.out.println("Doesn't function look for the comments within the code!");
	//	  System.out.println(((y >= y) && (a+3 != 2)) ? true: false);  "a+3 does not function since 'a' is boolean and '3' is a number"
		  System.out.println("");
		  System.out.println("3.6-----------------CONCLUSION------------------");
		  System.out.println(" My conclusion is writing 'if statements' using the notation'?:' is much easier than writing a whole if statement, it can be done using less lines of code whereas if statements take more lines to write the code. By making the code shorter it's more efficient.");
		  
	  }
}
	  
	  
	  
	 
	 

	 
	 
	 
	 
	 
	 
