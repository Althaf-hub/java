 import java.util.Scanner;
public class palindrome {
public static void main (String[] args) {
Scanner sc= new Scanner(System.in);
String input=sc.next();
boolean ispalindrome=check(input);
if (ispalindrome) {
	System.out.println("The given string is palindrome");
}
else 
{
System.out.println("the given string is not palindrome");	
}
}

 static boolean check(String input) {
 char[]charArray=input.toCharArray();
 int length=input.length();
 for(int i=0;i<length/2;i++) {
 if(charArray[i]!=charArray[length-i-1]) {
	 return false;
 }
 }
 return true;
 }
}




