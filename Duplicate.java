package week3.day2;

public class Duplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		for(int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
			if (split[i] == split[j]) {
			System.out.print(split[i]+" ");
			break;
	}
			}
}}}