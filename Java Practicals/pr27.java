import java.io.File;
import java.io.IOException;
import java.util.*;
public class pr27
{
public static void main(String[] args)
{
	try{
	File f = new File("file3.txt");
	Scanner sc = new Scanner(f);
	Scanner scaa = new Scanner(System.in);
	int i,j,size,count;
	if(args.length > 1)
	{
		System.out.println("Please Enter Only One Argument.");
		args[0] = scaa.nextLine();
		if (args[0].length()>1)
		{
			System.out.println("Please Enter Only One Character as A Argument.");
			args[0] = scaa.nextLine();
		}
	}
	String k = args[0];
	char [] c = new char[k.length()];
	for (i = 0; i <k.length();i++)
	{
		c[i] = k.charAt(i);
	}
	size=0;
	while(sc.hasNextLine())
	{
		size++;
		sc.nextLine(); 
	}
	String [] x = new String[size];
	Scanner sca = new Scanner(f); 
	i=0;
	while(sca.hasNextLine())
	{
		x[i] = new String(sca.nextLine());
		i++;
	}
	count = 0;
	for (i = 0;i<x.length;i++)
	{
		String s = x[i];
		for(j=0;j<s.length();j++)
		{
			if (s.charAt(j) == c[0])
			{
			count++;
			}
		}
	}
	System.out.println("There Are " + count +" occurances of " + c[0] + " in the File.");
	sc.close();
	}
	catch (IOException e)
	{
		System.out.println("error");
		e.printStackTrace();
	}
}
}