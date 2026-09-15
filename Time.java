public class Time{
	public static void main (String[] args){
		//time chosen: 13:15
		int hour = 13, minute = 15;
		int second = hour * 3600 + minute * 60;
		
		System.out.print("Seconds passed since midnight of a day: ");
		System.out.println(second);
		System.out.print("Seconds remain in a day: ");
		System.out.println(24 * 60 * 60 - second);
		System.out.print("Percentage of a day passed: ");
		System.out.println(second * 100 / (24 * 60 * 60) );
		System.out.print("Seconds passed since working on assignments: ");
		System.out.println(second - 13 * 60 * 60); //assume from 13:00 to 13:15
	}
}
