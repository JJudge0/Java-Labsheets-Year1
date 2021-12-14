import java.util.Scanner; 
public class CS1702_Lab4 {
	
static public void main (String Args[]) 
{

	System.out.println("STUDENT NAME: JATINDER JUDGE STUDENT");
    
               Introduction_4_1();  
	          Preliminaries_4_2();
	        Conditions_Loops_4_3();
	     Generating_Sequences_using_For_Loops_4_4();
	     Generating_patterns_Using_For_Loops_4_5();      
	           While_Loops_4_6();
	           Nested_Loops_4_7();
}


public static void Introduction_4_1()
{
	System.out.println();
	System.out.println("4.1------------------INTRODUCTION------------------");
	System.out.println("The laboratory session covers loops in Java. Again, we will be implementing some of the examples given during the lecture, followed by some additional examples. We will then look at a few sections of the help pages.");
}

public static void  Preliminaries_4_2()
{
	System.out.println();
	System.out.println("4.2------------------RELATIONAL OPERATORS------------------");
	System.out.println("Create a new project and Java class called CS1702_Lab4");
	System.out.println("///....///...//..DONE..///....///...///");
}
public static void Conditions_Loops_4_3()
{ 
	System.out.println();
	System.out.println("4.3------------------CONDITIONS LOOPS------------------");
	System.out.println("In worksheet three, section 3.4, we wrote three programs that decided if a single number had some sort of property, for example one of section 3.4 was to determine if a number (>0) was divisible by two and three. Copy these programs and amend each of them so that you use a for loop to test all of the number between 1 and 100 in a single run of each program.");
	
	System.out.println("");
    System.out.println("1) Displays if a whole number (>0) is divisible by 2 and 3");
	System.out.println("Part 1 Numbers between 1-100 that are divisible by 2 & 3: ");
	System.out.println("Divided by 2 And 3: ");	
	int iA;
	for (iA=1; iA<101; iA++) 
	{
		if (iA%2==0 && iA%3==0) 
			{
			System.out.print(iA +", ");			
			}
	}
		
	System.out.println("");
	System.out.println("2) Displays if a whole number (>0) is divisible by 7 Or 9");
    System.out.println("Part 2 Numbers between 1-100 that are divisible by 7 Or 9: ");
	System.out.println("Divided by 7 or 9: ");		
	int iB;
	for ( iB=1; iB<101; iB++) 
	{
		if (iB%7==0 || iB%9==0) 
		{
			System.out.print(iB +", ");		
		}
	}			
	
	System.out.println("");
	System.out.println("2) Displays if a whole number (>0) is divisible by  2 and 3 but not 5");
    System.out.println("Part 2 Numbers between 1-100 that are divisible by 2 and 3 but not 5: ");
	System.out.println("Divided by 2 and 3 but not 5: ");	
	int iC;
	for ( iC=1; iC<100; iC++) 
	{
		if ((iC%2==0 && iC%3==0) != ((iC%5==0)))
		{
			System.out.print(iC +", ");	
		}
	}
	System.out.println();
	System.out.println("Does this now change your answer to the final question of section 3.4?");
    System.out.println("The errors that would occur 1 1is duplication issues of numbers and ");
	
	System.out.println();
}


public static void Generating_Sequences_using_For_Loops_4_4()
{
	System.out.println();
	System.out.println("4.4------------------GENERATING SEQUENCES USING FOR LOOPS------------------");
	       ////////////////////////EXAMPLE/////////////////////////////////
//	        int i;
//
//	        for(i=0;i<10;++i)
//	        {
//		    System.out.println(i);
//	        }
// 
	      ////////////////////////EXAMPLE/////////////////////////////////
	
	System.out.println("Modify the loop to produce the following sequences:");
	System.out.println("");
	System.out.println("Question1: 4,5,6,7,8,9,10,11");
	int i;

	for(i=4;i<12;++i)
	{
		System.out.println(i);
	}
	System.out.println("");
	System.out.println("Question2: 10, 13, 16, 19");
	
	int j;
	for (j=10;j<20;j+=3)
		
	{
		System.out.println(j);
	}
	
	System.out.println("");
	System.out.println("Question3: 1,4,7,10,13,16");
	int k;

	for(k=1;k<17;k+=3)
	{
		System.out.println(k);
	}
	
	
	System.out.println("");
	System.out.println("Question4: 2,4,6,8,10,12");
	
	
	int l;

	for(l=2;l<13;l+=2)
	{
		System.out.println(l);
	}
	

	System.out.println("");
	System.out.println("Question5: 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 ");

	int n;

	for(n=1;n<11;++n)
	{
		System.out.println(n*n);
	}
	
	
	System.out.println("");
	System.out.println("Question6: -10, -8, -6, -4, -2, 0, 2, 4,  6, 8, 10 ");
	
	int o;

	for(o=-10;o<11;o+=2)
	{
	   System.out.println(o);
	}
	
	
	System.out.println("");
	System.out.println("Question7: -20, -15, -10, -5, 5, 10, 15, 20 ");

	int p;
	for(p=-20;p<=20;p=p+5)
		if ( p == 0 )

		{ 
			System.out.print("");
		}
		else 
		{
			System.out.println(p);
		}
 
}
	


public static void Generating_patterns_Using_For_Loops_4_5()
{ 
	System.out.println();
	System.out.println("4.5------------------GENERATING PATTERN USING FOR lOOPS------------------");
           ////////////////////////EXAMPLE/////////////////////////////////
//	int i;
//
//	for(i=0;i<10;++i)
//	{
//		System.out.print("*");
//	}
           ////////////////////////EXAMPLE/////////////////////////////////
	
	System.out.println("Modify the loop to produce the following sequences:");
	System.out.println("Question1: For the Loop to produce '++++++++++' ");
	int i1;

	for(i1=0;i1<10;++i1)
	{
		System.out.print("+");
	}

	System.out.println("");
	System.out.println("Question2: For the Loop to produce '---------' ");
	int i2;

	for(i2=0;i2<10;++i2)
	{
		System.out.print("-");
	}
	
	System.out.println("");
	System.out.println("Question3: For the Loop to produce '+-+-+-+-+-' ");

	int i3,i31;
    for(i3 = 0;i3<5;++i3)
   {
     {
       System.out.print("+");
     }
    for(i31 = 0; i31 < 1; ++i31)
     {
       System.out.print("-");
     }
    }

	System.out.println("");
	System.out.println("Question4: For the Loop to produce *+-*+-*+- ");
//	 int i4;
//	    for(i4=0;i4<3;++i4)
//	    {
//	        System.out.print("*+-");
//	    }
		 int i42;
		    for(i42=0;i42<3;++i42)
		    {
		        System.out.print("*+-");
		    }
	    
	System.out.println("");
	System.out.println("Question5: For the Loop to produce *+-*+-*+-* ");
     int i5;
     for(i5=0;i5<=12;++i5)
     if (i5%3==0) 
       {
         System.out.print("*");
       }
     else if (i5%3==1)
       {
         System.out.print("+");
       }
     else if (i5%3==2) 
       {
          System.out.print("-");
       }
//	  int i5;
//	    for(i5=0;i5<1;++i5)
//	    {
//	    System.out.print("*");
//	    }
//	    for(i5=1;i5<=1;++i5)
//	    {
//	     System.out.print("+");
//	    }
//	    for(i5=0;i5<1;++i5)
//	    {
//	    System.out.print("-");  
//	    }
//	    for(i5=0;i5<1;++i5)
//	    {
//	    System.out.print("*");
//	    }
//	    for(i5=1;i5<=1;++i5)
//	    {
//	     System.out.print("+");
//	    }
//	    for(i5=0;i5<1;++i5)
//	    {
//	    System.out.print("-");  
//	    }
//	    for(i5=0;i5<1;++i5)
//	    {
//	    System.out.print("*");
//	    }
//	    for(i5=1;i5<=1;++i5)
//	    {
//	     System.out.print("+");
//	    }
//	    for(i5=0;i5<1;++i5)
//	    {
//	    System.out.print("-");  
//	    }
//	    for(i5=0;i5<1;++i5)
//	    {
//	    System.out.print("*");
//	    }
	    System.out.println("");
	
	    System.out.println("Question6: For the Loop to produce **++**++**++ ");
	
	int i6,i61;
    for(i6 = 0;i6<3;++i6)
   {
     {
       System.out.print("**");
     }
    for(i61 = 0; i61 < 1; ++i61)
     {
       System.out.print("++");
     }
    }
	System.out.println("");
	
	System.out.println("Question7: For the Loop to produce ***+++---***+++---");
	
    int i7;
    for(i7=0;i7<3;++i7)
    {
    System.out.print("*");
    }
    for(i7=3;i7<6;++i7)
    {
       System.out.print("+");
    }
    for(i7=6;i7<9;++i7)
     {
     System.out.print("-");
     }
    for(i7=0;i7<3;++i7)
    {
    System.out.print("*");
    }
    for(i7=3;i7<6;++i7)
    {
       System.out.print("+");
    }
    for(i7=6;i7<9;++i7)
     {
     System.out.print("-");
     }
    System.out.print("");
    
	System.out.println("");
	System.out.println("Question8: For the Loop to produce ***+++------+++***");
    int i8;
    for(i8=0;i8<3;++i8)
    {
    System.out.print("*");
    }
    for(i8=3;i8<6;++i8)
    {
       System.out.print("+");
    }
    for(i8=6;i8<12;++i8)
     {
     System.out.print("-");
     }
    for(i8=12;i8<15;++i8)
     {
      System.out.print("+");
     }
    for(i8=15;i8<18;++i8)
     {
     System.out.print("*");
     }         
    System.out.print("");

}

public static void  While_Loops_4_6()
{    
	System.out.println();
	System.out.println("4.6------------------WHILE LOOPS------------------");
	System.out.println("-------------------PART1---------------------------");
	System.out.println("Implement two of the solutions to section 4.4 using a while loop. This can initially be done by implementing one of the while loop examples from the lecture notes.");

	System.out.println("Chose 'Question1: 4,5,6,7,8,9,10,11' ");
	int Whileloop1;
	Whileloop1 = 4;
	while(Whileloop1 < 12)
	{
	   System.out.println("x in loop = "+Whileloop1);
	   ++Whileloop1;
	} 
	
	System.out.println("Chose 'Question2: 10, 13, 16, 19' ");
	int Whileloop2;
	Whileloop2 = 10;
	while(Whileloop2< 20)
	{
	   System.out.println("x in loop = "+Whileloop2);
	   Whileloop2+=3;
	} 
	System.out.println();
	System.out.println("-------------------PART2---------------------------");
	System.out.println("Implement Euclid's algorithm (Highest Common Factor - HCF) by using a while loop.");
	System.out.println("Question1: Prove that HCF(88,26)=2 ");
	Scanner scanHCF = new Scanner(System.in);
	System.out.print("Input Number 1:");
	int aHCF =scanHCF.nextInt();
	System.out.print("Input Number 2:");
    int bHCF = scanHCF.nextInt();
	
	
//	int a = 88;
//	int b = 26;
	int cHCF= 0;
	
	while (bHCF >0)
	{
		cHCF = aHCF % bHCF;
		aHCF = bHCF;
		bHCF = cHCF;
	}
	if ((aHCF==bHCF) && (bHCF==aHCF))
	{
		System.out.println("ERROR");
	}
	
	System.out.println(("The Highest Common Factor (HFC) for Input Number 1 & 2 is" +""+"("+ aHCF+")"));
	System.out.println();
	
	System.out.println();
	System.out.println("Question2: Prove that HCF(54,87)=3 ");
	Scanner scanHCF1 = new Scanner(System.in);
	System.out.print("Input Number 1:");
	int aHCF1 =scanHCF1.nextInt();
	System.out.print("Input Number 2:");
    int bHCF1 = scanHCF1.nextInt();
	
	
//	int bHCF1= 54;
//	int bHCF2= 87;
	int cHCF1= 0;
	
	while (bHCF1 >0)
	{
		cHCF1 = aHCF1 % bHCF1;
		aHCF1 = bHCF1;
		bHCF1 = cHCF1;
	}
	if ((aHCF1==bHCF1) && (bHCF1==aHCF1))
	{
		System.out.println("ERROR");
	}
	
	System.out.println(("The Highest Common Factor (HFC) for Input Number 1 & 2 is" +""+"("+ aHCF1+")"));
	System.out.println();

	System.out.println();
	System.out.println("Question3: Prove that HCF(16,84)=4 ");
	Scanner scanHCF2 = new Scanner(System.in);
	System.out.print("Input Number 1:");
	int aHCF2 =scanHCF2.nextInt();
	System.out.print("Input Number 2:");
    int bHCF2 = scanHCF2.nextInt();
	
	
//	int aHCF2 = 16;
//	int bHCF2 = 84;
	int cHCF2 = 0;
	
	while (bHCF2 >0)
	{
		cHCF2 = aHCF2 % bHCF2;
		aHCF2 = bHCF2;
		bHCF2 = cHCF2;
	}
	if ((aHCF2==bHCF2) && (bHCF2==aHCF2))
	{
		System.out.println("ERROR");
	}
	
	System.out.println(("The Highest Common Factor (HFC) for Input Number 1 & 2 is" +""+"("+ aHCF2+")"));
	System.out.println();
	
	System.out.println();
	System.out.println("Question4: Prove that HCF(55,25)=5 ");
	Scanner scanHCF3 = new Scanner(System.in);
	System.out.print("Input Number 1:");
	int aHCF3 =scanHCF3.nextInt();
	System.out.print("Input Number 2:");
    int bHCF3 = scanHCF3.nextInt();
	
	
//	int aHCF3 = 55;
//	int bHCF3 = 25;
	int cHCF3= 0;
	
	while (bHCF3 >0)
	{
		cHCF3 = aHCF3 % bHCF3;
		aHCF3 = bHCF3;
		bHCF3 = cHCF3;
	}
	if ((aHCF3==bHCF3) && (bHCF3==aHCF3))
	{
		System.out.println("ERROR");
	}
	
	System.out.println(("The Highest Common Factor (HFC) for Input Number 1 & 2 is" +""+"("+ aHCF3+")"));
	System.out.println();
	
	System.out.println();
	System.out.println("Question5: Prove that HCF(42,72)=6 ");
	Scanner scanHCF4 = new Scanner(System.in);
	System.out.print("Input Number 1:");
	int aHCF4 =scanHCF4.nextInt();
	System.out.print("Input Number 2:");
    int bHCF4 = scanHCF4.nextInt();
	
	
//	int aHCF3 = 42;
//	int bHCF3 = 76;
	int cHCF4= 0;
	
	while (bHCF4 >0)
	{
		cHCF4 = aHCF4 % bHCF4;
		aHCF4 = bHCF4;
		bHCF4 = cHCF4;
	}
	if ((aHCF4==bHCF4) && (bHCF4==aHCF4))
	{
		System.out.println("ERROR");
	}
	
	System.out.println(("The Highest Common Factor (HFC) for Input Number 1 & 2 is" +""+"("+ aHCF4+")"));
	System.out.println();
	
	System.out.println();
	System.out.println("Question6: Prove that HCF(77,28)=7 ");
	Scanner scanHCF5 = new Scanner(System.in);
	System.out.print("Input Number 1:");
	int aHCF5 =scanHCF5.nextInt();
	System.out.print("Input Number 2:");
    int bHCF5 = scanHCF5.nextInt();
	
	
//	int aHCF3 = 77;
//	int bHCF3 = 28;
	int cHCF5 = 0;
	
	while (bHCF5 >0)
	{
		cHCF5 = aHCF5 % bHCF5;
		aHCF5 = bHCF5;
		bHCF5 = cHCF5;
	}
	if ((aHCF5==bHCF5) && (bHCF5==aHCF5))
	{
		System.out.println("ERROR");
	}
	
	System.out.println(("The Highest Common Factor (HFC) for Input Number 1 & 2 is" +""+"("+ aHCF5+")"));
	System.out.println();
	
	System.out.println();
	System.out.println("Question7: Prove that HCF(80,88)=8 ");
	Scanner scanHCF6 = new Scanner(System.in);
	System.out.print("Input Number 1:");
	int aHCF6 =scanHCF6.nextInt();
	System.out.print("Input Number 2:");
    int bHCF6 = scanHCF6.nextInt();
	
	
//	int aHCF3 = 80;
//	int bHCF3 = 88;
	int cHCF6= 0;
	
	while (bHCF6 >0)
	{
		cHCF6 = aHCF6 % bHCF6;
		aHCF6 = bHCF6;
		bHCF6 = cHCF6;
	}
	if ((aHCF6==bHCF6) && (bHCF6==aHCF6))
	{
		System.out.println("ERROR");
	}
	
	System.out.println(("The Highest Common Factor (HFC) for Input Number 1 & 2 is" +""+"("+ aHCF6+")"));
	System.out.println();
	
}

public static void  Nested_Loops_4_7()
{ 
	System.out.println();
	System.out.println("4.7------------------NESTED LOOPS------------------");
	System.out.println("PART 1");
	////////////////////////EXAMPLE////////////////////////////////	
	
//	int i,j;
//	
//	for(i=1;i<5;++i)
//	{
//		for(j=1;j<i+1;++j)
//		{
//			System.out.print(i);
//		}
//	}

   ////////////////////////EXAMPLE/////////////////////////////////
	
	System.out.println("------------Q1----------------");
	System.out.println("For the Loop to produce 122333444455555");
	System.out.println("");
	int i,j;
	for(i=1;i<6;++i)
	{
		for(j=1;j<i+1;++j)
		{
			System.out.println
			(i+ ",");
		}
	}
	System.out.println("-----------Q2----------------");
	System.out.println("For the Loop to produce 22333444455555666666");
	System.out.println("");
	int i1,j1;
	for(i1=2;i1<7;++i1)
	{
		for(j1=1;j1<i1+1;++j1)
		{
			System.out.println(i1+ ",");
		}
	}
	System.out.println("----------------Q3------------");
	System.out.println("For the Loop to produce 133355555");
	System.out.println("");
	int i5, j5;
	for (i5 = 1; i5 < 6; i5+=2) 
	{
		for (j5=1;j5<=i5;j5++)
	    {
	         System.out.println(i5+ "," );
	    } 
	}
	System.out.println("------------Q4----------------");
	System.out.println("For the Loop to produce 1335557777");
	System.out.println("");
	int i6, j6;
	for (i6 = 1; i6 < 8; i6+=2) 
	{
		for (j6=1;j6<=i6;j6+=2)
	    {
	        System.out.println(i6+ "," );
	    } 
	}
	System.out.println("---------------Q5-------------");
	System.out.println("For the Loop to produce 555554444333221");
	System.out.println("");
	int j2,i2;
    for(j2 = 5; j2 > 0; --j2)
    {
        for(i2 = 1; i2 < j2 + 1; ++i2)
        {
            System.out.println(j2+ "," );
        }
    }
	System.out.println("--------------Q6--------------");
	System.out.println("For the Loop to produce 544333222211111");
	System.out.println("");
	int i4,j4, k4 = 1;
	for(i4=5; i4>=1; i4--)
	{
	    for(j4=1; j4<=k4; j4++)
	    {
	        System.out.println(i4+ ",");
	    }
	    k4++;
	}
	System.out.println("------------Q7----------------");
	System.out.println("For the Loop to produce +**+++****+++++");
	System.out.println("");
	int i3,j3;
	for(i3=0;i3<6;i3++)
    {
        if (i3%2 == 0)
        {
            for(j3=0; j3 < i3 ; j3++ )
            {
                System.out.print("*");
            }
        }
        else
        {
            for(j3=0; j3 < i3 ; j3++ )
            {
                System.out.print("+");
            }
        }
    }
    System.out.print("");
	System.out.println("------------Q8----------------");
	System.out.println("For the Loop to produce --***++++-----******+++++++");
	System.out.println("");
	int s1;
	int s2;
    for(s1=2;s1<8;s1++)
    {
        if (s1%3 == 0)
        {
            for(s2=0; s2 < s1 ; s2++ )
            {
                System.out.print("*");
            }
        }
        else if ((s1-1)%3==0)
        {
            for(s2=0; s2 <= s1 ; s2++ )
            {
                System.out.print("+");
            }
        }
        else
        {
            for(s2=0; s2 < s1 ; s2++ )
            {
                System.out.print("-");
                
            }
        
        }

    } // the loop ends here so it doesn't carry on 
    System.out.println("");
    System.out.println("PART2");
	System.out.println("Write nested loops that perform the following tasks:");
	System.out.println("");
	System.out.println("1)	Display all of the possible pairs of numbers between 1 and 10 (Hint: there are 100 pairs)");

	int num1,num2;
	for(num1=0;num1<11;++num1)
	{
	for(num2=2;num2<i+5;++num2)//  //i+5
	{
		System.out.println(num1+","+ num2);	
	}
	
	}

	System.out.println("");
	System.out.println("2) Display all possible pairs in the form x, y where x < y and 0 < x, y < 11 (Hint: there are 45 pairs)");
	
//	int num3,num4;  //num1= x, //num2= y
//	for( num3=0; num3 <= 10; ++num3);    // Code with For statements only 
//	{
//		for(num4=2;num4<11;++num4)
//		{
//			System.out.println(num3+","+num4);	
//		}
//	}
 	int num3,num41;  //num1= x, //num2= y
		for( num3=0; num3 <= 10; ++num3);
		{
             for(num41=0;num41<11;++num41)
		  {
			if ((num3 > num41) && (num41 < num3))
			   {
				System.out.println(num41+","+num3 );	
			   }
			else if ((num3 < num41) && (num41 > num3))
			   {
				System.out.println(num41+","+num3);
			   }
		   }
		}

	
	System.out.println("");
	System.out.println("3) Display all possible pairs of the numbers 1,2,3,4 paired with 4,5,6,7,8 (Hint: there are 20 pairs)");
	int x,y;
	for (x =1; x<5; ++x)
	{
		for( y=4; y<9; ++y)
		{
			if (x<=y)
			{
				System.out.println(x+ ","+ y );
			}
		}
	}

}
}









