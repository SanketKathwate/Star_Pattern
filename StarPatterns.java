import java.util.Scanner;

class StarPatterns
{
	public static void main(String [] args)
	{
		StarPatterns.selected();
	}
	
	static void selected()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("1.Rightangle Star Pattern");
		System.out.println("2.Upside-down Rightangle Star Pattern");
		System.out.println("3.Triangle Star Pattern");
		System.out.println("4.Upside-down Triangle Star Pattern");
		System.out.println("5.Rhombus Star Pattern");
		System.out.println("6.Exit");
		System.out.println();
		System.out.print("Enter the pattern number : ");
		int option = scan.nextInt();
		int lines=0;
		if(option<6)
		{
			System.out.print("Enter the length of pattern : ");
			lines = scan.nextInt();
		}
		System.out.println();
		int starCount,spaceCount,mid;
		
		switch (option) 
		{
		case 1:
			starCount=1;
			StarPatterns.rightangle(lines,starCount);
			System.out.println();
			StarPatterns.selected();
			break;
		case 2:
			starCount=lines;
			spaceCount=0;
			StarPatterns.upsidedownrightangle(lines,spaceCount,starCount);
			System.out.println();
			StarPatterns.selected();
			break;
		case 3:
			starCount=1;
			spaceCount=lines;
			StarPatterns.triangle(lines,spaceCount,starCount);
			System.out.println();
			StarPatterns.selected();
			break;
		case 4:
			starCount=lines*2-1;
			spaceCount=0;
			StarPatterns.upsidedowntriangle(lines,spaceCount,starCount);
			System.out.println();
			StarPatterns.selected();
			break;
		case 5:
			if(lines%2==0)
			{
				System.out.println("This pattern needs odd lines input. Please try again.");
				System.out.println();
				System.out.println();
				StarPatterns.selected();
			}
			else
			{
				int count = 0;
				for (int i = lines-1; i>=0; i--) 
				{
					if(i%2!=0)
					{
						count++;
					}
				}
				starCount=1;
				spaceCount=count;
				mid=(lines-1)/2;
				StarPatterns.Rhombus(lines,spaceCount,starCount,mid);
				System.out.println();
				StarPatterns.selected();
			}
			break;
		case 6:
			System.out.println("Thank You");
			break;
		default:
			System.out.println("Invalid Option");
			System.out.println("Please Select Again");
			StarPatterns.selected();
			break;
		}
	}

	static void Rhombus(int lines,int spaceCount,int starCount,int mid) 
	{
		for (int i = 0; i < lines; i++) 
		{
			for (int j = 0; j < spaceCount; j++) 
			{
				System.out.print("  ");
			}

			for (int j = 0; j < starCount; j++) 
			{
				System.out.print(" *");
			}

			if (i < mid)
			{
				starCount = starCount + 2;
				spaceCount--;
			}
			else
			{
				starCount = starCount - 2;
				spaceCount++;
			}
			System.out.println();
		}
	}

	static void upsidedowntriangle(int lines,int spaceCount,int starCount) 
	{
		for (int i = 0; i < lines; i++) 
		{
			for (int j = 0; j < spaceCount; j++) 
			{
				System.out.print("  ");

			}
			for (int j = 0; j < starCount; j++) 
			{
				System.out.print(" *");

			}
			System.out.println();
			starCount = starCount-2;
			spaceCount++;
		}
	}

	static void triangle(int lines,int spaceCount,int starCount) 
	{
		
		for (int i = 0; i < lines; i++)
		{
			for (int j = 0; j < spaceCount; j++)
			{
				System.out.print("  ");
			}
			for (int j = 0; j < starCount; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			starCount=starCount+2;
			spaceCount--;
		}
	}

	static void upsidedownrightangle(int lines,int spaceCount,int starCount)
	{
		for(int i=0 ; i<lines ; i++)
		{
			for(int j=0 ; j<spaceCount ; j++)
			{
				System.out.print("  ");
			}

			for(int j=0 ; j<starCount ; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			starCount--;
			spaceCount++;	
		}
	}

	static void rightangle(int lines,int starCount)
	{
		
		for(int i=0 ; i<lines ; i++)
		{
			for(int j=0 ; j<starCount ; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			starCount++;
		}		
	}
}
