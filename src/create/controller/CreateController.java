package create.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import create.view.CreatePanel;
import create.view.CreateFrame;


public class CreateController 
{
	private static Pattern LowercasePattern = Pattern.compile("(?=.*[a-z])");
	private static Pattern DigitPattern = Pattern.compile("(?=.*d)");
	private static Pattern SpecialCharPattern = Pattern.compile("(?=.*[@#$%])");
	private static Pattern UppercasePattern = Pattern.compile("((?=.*[A-Z])");
	private static Pattern CompletePattern = Pattern.compile("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]))");
	
	public void start() 
	{
		CreateFrame.getPanel().showMessage("Let's test that password of yours.");
	}
	
	public static boolean checkLowercase(String password)
	{
		Matcher mtch = LowercasePattern.matcher(password);
		if(mtch.matches())
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkDigitPattern(String password)
	{
		Matcher mtch = DigitPattern.matcher(password);
		if(mtch.matches())
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkSpecialChar(String password)
	{
		Matcher mtch = SpecialCharPattern.matcher(password);
		if(mtch.matches())
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkUppercase(String password)
	{
		Matcher mtch = UppercasePattern.matcher(password);
		if(mtch.matches())
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkAll(String password)
	{
		Matcher mtch = CompletePattern.matcher(password);
		if(mtch.matches())
		{
			return true;
		}
		return false;
	}

}
