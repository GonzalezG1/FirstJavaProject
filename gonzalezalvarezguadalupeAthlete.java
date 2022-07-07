//Nicolas Gonzalez 
//CS115-001
//ID # 20348998
// This is my athlete's class. 
/*I included both a default contructor and a non default contructor, accessor methods, mutator methods, Display method, 
toString method, and an equals method.
*/

public class gonzalezalvarezguadalupeAthlete {

private String Last_Name;
private String First_Name;
private int Age;
private char Surface;
private String Sport;
private final String Country;
private double Ad_Revenue;
private final double MINIMUMAD_REVENUE=5000.00;



//beginning of contructor
public gonzalezalvarezguadalupeAthlete()
{
    
    Last_Name="NoLastName";
	First_Name="NoFirstName";
    Age = 0;
    Surface= 'N';
    Sport="NoSport";
    Ad_Revenue = 00.0;
	Country = "NoCountry";
}
public gonzalezalvarezguadalupeAthlete(String lastName, String firstName, int age, char surface, String sport, double passedAd_Revenue, String country)
{
    Last_Name=lastName;
	First_Name=firstName;
    Age = age;
    Surface= surface;
    Sport=sport;
    Ad_Revenue = passedAd_Revenue;
	Country = country;
}

//Accessor
public String GetFirstName()
{
    return First_Name;
}
public String GetLastName()
{
    return Last_Name;
}
public int GetAge()
{
    return Age;
}
public char GetSurface()
{
    return Surface;
}
public String GetSport()
{
    return Sport;
}
public double GetAd_Revenue()
{
    return Ad_Revenue;
}
public String GetCountry()
{
	return Country;
}
//end of accessors

//start of mutators

public void setLastName(String lastName)
{
    Last_Name=lastName;
    return;
}
public void setFirstName(String firstName)
{
    First_Name=firstName;
    return;
}
public void setAge(int age)
{
    Age=age;
    return;
}
public void setSurface(char surface)
{
	Surface=surface;
}
public void setSport(String sport)
{
    Sport=sport;
    return;
}
//public void setCountry(String country)
//{
	//Country=country;
	//return;
//}

public boolean SetAd_Revenue(double passedAd_Revenue)
{
    if (passedAd_Revenue > MINIMUMAD_REVENUE )
    {
        Ad_Revenue=passedAd_Revenue;
        return true;
    }
    else 
    {
        return false;
    }   
}
public boolean SetSurface(char passedSurface)
{
    if (passedSurface=='s' || passedSurface=='S')
    {
        System.out.print("Surface set to snow");
        Surface=passedSurface;
        return true;
    }
    else if (passedSurface=='i' || passedSurface=='I')
    {
        Surface=passedSurface;
        System.out.print("Surface set to ice");
        return true;
    }
    else 
    {
        return false;
    }
}
    
//toString method
public  String toString()
{
return "Last Name: " + Last_Name + ", First Name: "+First_Name+ 
        ", Age: "+Age + ", Ad Revenue: " +Ad_Revenue + ", Surface: " 
        +Surface+ ", Sport: " + Sport + ", Country: " + Country;

}

//Display method
public void Display()
{
System.out.print (Last_Name + ", " + First_Name + " " +Age+ " "
        +Ad_Revenue+ " " + Surface+ " " + Sport);
}

//equals Method
public boolean equals(gonzalezalvarezguadalupeAthlete athlete2)
{
    if(this.GetFirstName().equals(athlete2.GetFirstName()) 
		&& this.GetSurface() == athlete2.GetSurface()
        && this.GetLastName().equals(athlete2.GetLastName())
        && this.GetAge()==athlete2.GetAge()
        && this.GetAd_Revenue() ==athlete2.GetAd_Revenue()
        && this.GetSport() == athlete2.GetSport() )
  
    {
        return true;
    }
    else {
        return false;
    }

}



//athlete class is done. 
}
