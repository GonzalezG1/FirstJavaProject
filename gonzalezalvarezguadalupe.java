//Guadalupe Gonzalez
//CS115-001
//ID # 20348998
/*This my client program where I will attempt to display the main options that will either take the user to the menu method or the final stats method
depending on what they enter. The menu method will display more specific options on what the user can choose. Each option will take the user to different
method, and they will be asked to input based on what they are looking for. 5 of the options in the menu method will take them to different methods. The 6th option 
will take the user back to main where they can enter menu again or they can check final stats. */

import java.io.*;
import java.util.Scanner;
public class gonzalezalvarezguadalupe
{
    public static void main(String[] args) throws IOException
    {
       // gonzalezalvarezguadalupeAthlete  athlete1 =new gonzalezalvarezguadalupeAthlete();
        Scanner scnr=new Scanner(System.in);
       
        double passedAd_Revenue, Ad_Revenue;
        int Age, Number_of_athletes_in_country;
        String stringEnteredSurface, First_Name, Last_Name, Sport, Country, SurfaceReader;
        char enteredSurface, Surface;
		final int MAXCALLS=7;
		final int MAXATHLETES=1000;
		
		int Counters [] = new int [MAXCALLS];		
		 
		File ifile=new File("olycs115.txt");
		Scanner scan2=new Scanner(ifile);
		
		gonzalezalvarezguadalupeAthlete [] athleteArray = new gonzalezalvarezguadalupeAthlete[MAXATHLETES];
		int j=0;
	
	while(scan2.hasNextLine())
	{
		Country=scan2.nextLine();

				
			if(!Country.equals("END_OF_FILE"))
			{

				Number_of_athletes_in_country=scan2.nextInt();
				for (int i=0;i< Number_of_athletes_in_country;i++)
				{
				
							Last_Name=scan2.next();
							First_Name=scan2.next();
							Age=scan2.nextInt();
							Ad_Revenue=scan2.nextDouble();
							SurfaceReader=scan2.next();
							Surface=SurfaceReader.charAt(0);
							Sport=scan2.nextLine();
							
						gonzalezalvarezguadalupeAthlete athleteinfo =new gonzalezalvarezguadalupeAthlete(Last_Name, First_Name, Age, Surface, Sport, Ad_Revenue,Country);
						athleteArray[j]=athleteinfo;
						j++;
						//System.out.println(athleteinfo.toString());
					
						
				}		// end of for loop
			Country.equals("END_OF_FILE");
					
			}		//end of while loop
							
	
}	

        System.out.print("Enter 'M' or 'm' for menu or enter 'q' or 'Q' for final stats. ");
		
		while (scnr.hasNext())
		{
				String characterReader=scnr.next();
				
				if(!(characterReader.equals("M") || characterReader.equals("m") ||characterReader.equals("Q") || characterReader.equals("q") ))
				{
					System.out.println("Error. Try again.");
					System.out.print("Enter 'M' or 'm' for menu. Enter 'Q' or 'q' for final stats. ");
				}
				else 
				{
					char characterEntered=characterReader.charAt(0);		
				
						switch (characterEntered)
						{
							case 'm':
							case 'M':
							menu(athleteArray, Counters); 
							break;
							case 'q':
							case 'Q':
							finalstats(Counters);
							System.exit(0);
						}	//end of switch statement
                }	//end of else 
        }	//end of while loop
        
 
        
    } //end of main
   
    //The menu method is supose to display options for the user. Each option will take them to a method. 
    public static void menu(gonzalezalvarezguadalupeAthlete athleteArray [], int Counters[]) 
    {
		
      Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter 'L' to list all data Information.");
        System.out.println("Enter 'A' to display information for a particular athlete.");
        System.out.println("Enter 'C' to display athlete info for athletes from a particular country.");
        System.out.println("Enter 'R' to display ad revenue.");
        System.out.println("Enter 'S' to display surface info.");
        System.out.print("Enter 'Q' to quit and return back to main. ");
        
		while(scan.hasNext())
		{
			String menu_Char_Reader=scan.nextLine();
		
			if(!(menu_Char_Reader.equals("L") || menu_Char_Reader.equals("l") ||menu_Char_Reader.equals("A") || menu_Char_Reader.equals("a")
				|| menu_Char_Reader.equals("C") || menu_Char_Reader.equals("c") || menu_Char_Reader.equals("R") || menu_Char_Reader.equals("r")
				|| menu_Char_Reader.equals("S") || menu_Char_Reader.equals("s") || menu_Char_Reader.equals("Q") || menu_Char_Reader.equals("q")))
				{
					System.out.print("Try again");
					 Counters[6]+=1;
				} //end of if
				else 
				{
					char menu_Char_Entered=menu_Char_Reader.charAt(0);
						
						switch (menu_Char_Entered)
						{
							case 'l':
							case 'L':
								listall(athleteArray, Counters);
				
								break;
							case 'A':
							case 'a':
								athleteReport(athleteArray, Counters);
								
								break;
							case 'C':
							case 'c':
								countryReport(athleteArray, Counters);
								
								break;
							case 'R':
							case 'r':
								AdRevenueReport(athleteArray, Counters);
								
								break;
							case 'S':
							case 's':
								surfaceReport(athleteArray, Counters);
								
								break;
							case 'Q':
							case 'q':
								
								System.out.println("Exited out Menu(). Back to main.")	;
								System.out.print("Enter 'M' or 'm' for menu. Enter 'Q' or 'q' for final stats. ");
								Counters[5]+=1;
								
								return;
								
                
						} //end of switch
				}//end of else
					
		} //end of while
	
	} // end of menu() 
	
    public static int listall(gonzalezalvarezguadalupeAthlete athleteArray [], int Counters[]) 
    {
		
		for (int i=0; i < athleteArray.length; i++)
			{
				if (athleteArray[i]!=null)
				{
	
						System.out.println(athleteArray[i]);
						
				}
			}
			Counters[0]=Counters[0]+1; 
		
			return Counters[0];
    }
	
	public static boolean athleteReport (gonzalezalvarezguadalupeAthlete athleteArray[], int Counters [] )
	{
		gonzalezalvarezguadalupeAthlete athleteinfo = new gonzalezalvarezguadalupeAthlete();
		boolean athletefound=false;
		double counter=0.0;
		System.out.print("Enter last name: ");
		Scanner scan=new Scanner(System.in);
		String Last_Name=scan.next();
		
		for (int i=0; i < athleteArray.length; i++)
		{
			if (athleteArray[i]!=null)
			{
					if (athleteArray[i].GetLastName().equals(Last_Name))
					{
						System.out.println("Country: " +athleteArray[i].GetCountry() + ", Last Name: " + athleteArray[i].GetLastName() + ", First Name:"+ athleteArray[i].GetFirstName()+", Sport: " + athleteArray[i].GetSport());
						Counters[1]=Counters[1]+1;
						
						athletefound=true;
					}
					
			}	
	
		}
	if(!athletefound)
	{
		System.out.print("athlete not found");
		Counters[1]=Counters[1]+1;
		return athletefound=false;
	}
		
		
		
		
		return athletefound;	
	}
		
	
	
	public static boolean countryReport(gonzalezalvarezguadalupeAthlete athleteArray[], int Counters [])
	{
		gonzalezalvarezguadalupeAthlete athleteinfo = new gonzalezalvarezguadalupeAthlete();
			boolean CountryFound=false;
			double Ad_Revenue=0.0;
			double num=0.0;
			System.out.println("Enter the country you would like to search for.   ");
			System.out.print(" or enter 'all' to display information of all countries.  ");
			
			Scanner scan=new Scanner(System.in);
			
			String Country =scan.next();
			
			if(Country.equals("all"))
		{
			for (int i = 0 ; i<athleteArray.length; i++)
			{
				if (athleteArray[i]!=null)
				{
					
					Country= athleteArray[i].GetCountry();
					if (athleteArray[i].GetCountry().equals(Country))
					{
						System.out.println(athleteArray[i]);
						Ad_Revenue+=athleteArray[i].GetAd_Revenue();
						num++;					
						
					}
					double AdRevForCountry=Ad_Revenue;
					double result=(Ad_Revenue/num);
					System.out.println(AdRevForCountry);
					System.out.println(result);
					Country=null;
				}
									
			}
			
			return CountryFound=true;
		}
		else if(!Country.equals("all"))
		{
			
			for (int i=0; i < athleteArray.length; i++)
			{
				if (athleteArray[i]!=null)
				{
						
					if (athleteArray[i].GetCountry().equals(Country))
					{
						System.out.println(athleteArray[i].GetLastName()+ ", "+ athleteArray[i].GetFirstName() +", " + athleteArray[i].GetAge() + ", " + athleteArray[i].GetAd_Revenue());
						Ad_Revenue+=athleteArray[i].GetAd_Revenue();
						num++;
						CountryFound=true;
					}

				} 
				
			}
			
			if(!CountryFound)
			{
				System.out.print("No country found.");
				return CountryFound=false;
			}
			
			
			double AdRevForCountry=Ad_Revenue;
			double result=(Ad_Revenue/num);
			
			System.out.println("Total Ad Revenue in " + Country +": " +AdRevForCountry  );
			System.out.print ("Average Ad Revenue: " + Country +": "+ result);
			Counters[2]=Counters[2]+1;
			return CountryFound=true;
		}
		
		return CountryFound;
	}
	//AdRevenueReport() will prompt the user for a last name to display that athlete's ad revenue or they can type 'all' for everyone's ad revenue. 
	public static boolean AdRevenueReport(gonzalezalvarezguadalupeAthlete athleteArray[], int Counters [])
	{
		Scanner scan=new Scanner(System.in);
		boolean LNFound=false;
			System.out.print("Enter last name or enter 'all' for Ad Revenue. ");
			String Last_Name= scan.next();
			if(Last_Name.equals("all"))
			{
				for (int i=0; i<athleteArray.length;i++)
				{
					if (athleteArray[i]!=null)
					{
						System.out.println("Last Name: " + athleteArray[i].GetLastName()+ "First Name: " + athleteArray[i].GetFirstName()+" Ad Revenue: " + athleteArray[i].GetAd_Revenue());
							
					}
				}
				
				Counters[3]+=1;
				return LNFound= true;
			}
			if(!Last_Name.equals("all")) 
			{
				for (int i=0; i<athleteArray.length;i++)
				{
					if( athleteArray[i]!=null)
					{
						if (athleteArray[i].GetLastName().equals(Last_Name))
						{
							System.out.println("Last Name: "+ athleteArray[i].GetLastName()+ ", Ad Revenue: " + athleteArray[i].GetAd_Revenue());
							LNFound=true;
						}
					}
					
				}
				Counters[3]=Counters[3]+1;
			
				if(!LNFound)
				{
				System.out.print("No athlete found.");
				return LNFound=false;
				}
			}
			
			
			return LNFound;
	}
	//This method will prompt the user for the surface they would like to search for, or they can search for them all. 
	public static boolean surfaceReport(gonzalezalvarezguadalupeAthlete athleteArray[], int Counters [])
	{
		Scanner scan=new Scanner(System.in);
		boolean gotThemAll=false;
		
		System.out.println("Would you like to search for 'i' or 's' ? Enter 'i' or 's'. ");
		System.out.print("OR enter 'all' . " );
		String answer= scan.next();
		char surface=answer.charAt(0);
		if (surface=='i')
		{
			for ( int i=0; i<athleteArray.length; i++)
			{
				if(athleteArray[i]!=null)
				{
					if(athleteArray[i].GetSurface()=='i')
					{
						System.out.print(athleteArray[i].GetLastName() + ", " + athleteArray[i].GetFirstName() +", ");
				
						if (athleteArray[i].GetSport().equals("figure skating"))
						{
							System.out.println("full rink");
						}
						else if(athleteArray[i].GetSport().equals("speedskating"))
						{
							System.out.println("oval rink");
						}
						else if(athleteArray[i].GetSport().equals("luge") || athleteArray[i].GetSport().equals("bobsledder") || athleteArray[i].GetSport().equals("skeleton"))
						{
							System.out.println("fast ice");
						}
						else 
						{
							System.out.println("unknown ice");
						}
					}
				}
			}
			Counters[4]+=1;
		return gotThemAll=true;
		}
		else if (surface=='s')
		{
			for ( int i=0; i<athleteArray.length; i++)
			{
				if(athleteArray[i]!=null)
				{
					if(athleteArray[i].GetSurface()=='s')
					{
					System.out.println(athleteArray[i].GetLastName() + ", " + athleteArray[i].GetFirstName()+", " +athleteArray[i].GetSurface());
					}
				}
			}
			Counters[4]+=1;
			return gotThemAll=true;
		}
		
	 if (answer.equals("all"))
		{
			for (int i=0; i<athleteArray.length; i++)
			{
				if(athleteArray[i]!=null)
				{
					if(athleteArray[i].GetSurface()=='i')
					{
						System.out.println("Last name: " +athleteArray[i].GetLastName() + ",First Name " +athleteArray[i].GetFirstName() + ",Surface: " + athleteArray[i].GetSurface() + ", ");
						
						if (athleteArray[i].GetSport().equals("figure skating"))
						{
							System.out.println("full rink");
						}
						else if (athleteArray[i].GetSport().equals("speed skater"))
						{
							System.out.println("oval rink");
						}
						else if(athleteArray[i].GetSport().equals("luger") || athleteArray[i].GetSport().equals("bobsledder") || athleteArray[i].GetSport().equals("skeleton participant"))
						{
							System.out.println("fast ice");
						}
						else 
						{
							System.out.println("unknown ice");
						}
					}
					if(athleteArray[i].GetSurface()=='s')
					{
						System.out.println("Last name: "+athleteArray[i].GetLastName() + ", First Name: " + athleteArray[i].GetFirstName() + ", Surface: " + athleteArray[i].GetSurface());
					}
				}
			}
			Counters[4]+=1;
			return gotThemAll=true;
		}
		else 
		{
			System.out.print("No surface found" );
			Counters[4]+=1;
			gotThemAll=false;
		
		}
		
		return gotThemAll;
	}
	
	//This last method will display the number of times each menu letter was entered by the user. 
	public static void finalstats(int Counters[])
	
	{
		System.out.println("L was entered " +Counters[0] + "amount of times");
		System.out.println("A was entered " +Counters[1] + "amount of times");
		System.out.println("C was entered " +Counters[2] + "amount of times");
		System.out.println("R was entered " +Counters[3] + "amount of times");
		System.out.println("S was entered " +Counters[4] + "amount of times");
		System.out.println("Q was entered " +Counters[5] + "amount of times");
		System.out.print("Others were entered "+ +Counters[6] + "amount of times.");
		
		return;
	}
}


    




