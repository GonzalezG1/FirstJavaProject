# FirstJavaProject
Winter Olympics information program 

This program is given a data file in a particular formay to read into the program and use for data information 
used when runningthe program. The data file is posted and is named olycs115.txt (Olympics text file). 
The format of the file and recommended types for each field are: 

Country(string)
Number_of_athletes_in_ country (int)
Last_Name    First    Name    Age      Ad_Revenue    Surface    Sport
String       String   int     double   char          char       string

The last line of the file has the string END_OF_FILE in the Country field.

_______________________________________________________________________________________________
The file gonzalezalvarezguadalupe.java contains: 

The main method :
1. Declares variables used to store data read in from data file.
2. Declares an array of counters used to count the number of times a particular menu option is entered. 
3. Opens data file olycs115.txt and reads the data into variables for use during the rest of the program.
4. Prompts he user for what to do next:
    a. If the user enters a 'm' or 'M', calls menu().
    b. If the user enters a 'q" or 'Q', calls finalStats().
    c. If the user enter any other character, displays an error message and tries again.
5. After returnning from finalStats(), main() the program ends; otherwise, main() continues to prompt the user for what
   to do next

The main menu() method in the program will allow the user to enter one of the following options:
1.
 a. 'L' or 'l": List all of te athlete data available (including all information read from the olycs115.txt file)
 b. 'A' or 'a' : Display information for a particular athlete
 c. 'C' or 'c' : Display athlete type of information for athletes from a particular country
 d. 'R' or 'r' : Display ad revenue information
 e. 'S' or 's' : Display surface information
 f. 'Q' or 'q' : Quit and return to main() 
 g. If the user enter any other character, displays an error message and tries again.

2. Keeps track of how many times each letter is entered by user. This information will be passed back to main() and 
 used in finalStats().
 
listall():
  1. Lists out all athlete's names their country, their age, their potential ad revenue,  their surfaces, and their sports 
      from sports from the data read in the olycs115.txt.
  2. Returns
 
athleteReport():
  1. Prompts the user for the athlete last name to search for.
  2. Searches the data read in from olycs115.txt and displays the country, the last name, the first name, and the sport 
      from any line that matches the athlete last name, athleteReport() then return true
  3. If no line mathes the athlete's last name, athleteReport() displays the message "No athlete found" and returns false.
  
countryReport():
  1. Prompts the user for the country they would like to search for, OR the word "all"
  2. For the country entered, displays each active athlete that is from that country by last name and first name, each
      athlete's age, and each athlete's ad revenue. Also displays the total ad revenue in that country.
  3. If the user entered "all" displays information for all countries by each country.
  4. If no line matches the country or "all", displays the message "No country found", and return false.
  
 adRevenueReport():
  1. Prompts the user for the athlete last name the would like to search for, OR the word "all"
  2. For the athlete last name entered, displays each athlete that matches that last name, and the athlete's ad revenue. 
  3. If the user entered the "all", displays information for all athletes that includes each last name, first name, 
     and ad revenue. 
  4. If no line matches the athlete's last name or "all", displays the message "No athlete found", and return false.
  
 surfaceReport():
  1. Prompts the user for the surface they would like to search for ('i' or 's'), OR the word "all"
  2. For the surface entered, displays the athlete's last name and first name. If the surface is 'i', is also displays:
      a. If the athlete is a figure skater, displays the phrase "full rink" after the athlete's name
      b. If the athlete is a speed skater, displays the phrase "oval rink" after the athlete's name
      c. If the user entered "all" then displays information for all athletes by each surface.
      d. If no line matches the surface or "all", displays the message "No surface found", and return false
  
  
 finalStats(): 
  1. Displays the number of times each menu letter was entered by the user. 
 

_______________________________________________________________________________________________

The file gonzalezalvarezguadalupeAthlete.java contains:
1. Contructor Method(s)
2. Accessor Methods
3. Mutator Methods
4. Display Method
5. toString Method
6. equals Method

