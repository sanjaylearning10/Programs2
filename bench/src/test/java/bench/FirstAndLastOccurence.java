package bench;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstAndLastOccurence {
	
	public static void main(String...args)

	{	

		String str="Hello World";
		char ch='l';
		
		for(int i=0;i<str.toCharArray().length;i++)
		{
			if(str.charAt(i)==ch)
			{
				System.out.println("First Occurence is at index:: "+i +"==>"+ str.charAt(i));
				break;
			}
		}
		
		for(int i=str.toCharArray().length-1;i>=0;i--)
		{
			if(str.charAt(i)==ch)
			{
				System.out.println("Last Occurence is at index:: "+i +"==>"+ str.charAt(i));
				break;
			}
		}
	}

}

