package week3.day2;

public class OddUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		String[] split = test.split(" ");
		for(int i=0; i<split.length; i++)
		{
			if(i%2!=0) {
				System.out.print(split[i].toUpperCase());
			}
		else
		{
			System.out.print(split[i]);
		}
		}
}}