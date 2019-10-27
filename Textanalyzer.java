import java.util.Scanner;

public class Main {

//function to calculate how many times some character (charc) is in the text (input)

public static int counting(String input, char charc) 
{

int times = 0;

//for loop to loop through the text and check for the character (charc) at each index

for(int Count1 = 0; Count1 < input.length(); Count1++)
{

  if( charc == input.charAt(Count1))

     times = times +1;

}

 return times;

}

 

public static void main(String[] args)
{

  System.out.print("Please enter a sentence: ");

  Scanner scan = new Scanner(System.in);

  String input = scan.nextLine();

  String alph = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");

   

  //for loop to loop through the alphabet

  for(int Count2 = 0; Count2 < alph.length(); Count2++)
{  

   //percentage formula

    int perc= 100* counting(input, alph.charAt(Count2))/(input.length() - counting(input, ' '));

 

  //for loop to create the individual bars depending on the percentage

    String BarChart= new String("");

    for (int Count3= 0; Count3 <= perc; Count3++){

      BarChart= BarChart + "#";

  }

  //we only want to display the characters whose perc is above 0

    if (perc != 0) 

   

    //print one line (character + percentage + bar)

     System.out.println(alph.charAt(Count2)  + ": " + perc + "%"+ ((String.valueOf(perc)).length() < 2 ? "  ": "") + 
(String.valueOf(perc).length() == 2 ? " ": "") + BarChart); 
/* the ternary conditional operator ('?') is used to add 1 or 2 extra spaces behind the percentage "%" 
so the bars are correctly aligned (depending on if the perc is 1 digit or 2 digits long) *\

      }
    }
  }


