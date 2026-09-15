public class Time{
	public static void main (String[] args){
		//time chosen: 13:15
		int hour = 13, minute = 15, second = 0;
		int totalSecond = hour * 60 * 60 + minute * 60 + second;
		
		System.out.print("Seconds passed since midnight of a day: ");
		System.out.println(totalSecond);
		System.out.print("Seconds remain in a day: ");
		System.out.println(24 * 60 * 60 - totalSecond);
		System.out.print("Percentage of a day passed: ");
		System.out.println(totalSecond * 100 / (24 * 60 * 60) );
		System.out.print("Seconds passed since working on assignments: ");
		System.out.println(totalSecond - 13 * 60 * 60); //assume from 13:00 to 13:15
	}
}
