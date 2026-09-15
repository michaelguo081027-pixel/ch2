public class Time{
	public static void main (String[] args){
		int hour = 13, minute = 15; //time chosen: 13:15
		int second = hour * 3600 + minute * 60;
		System.out.println(second); //seconds passed since midnight of a day
		System.out.println(24 * 60 * 60 - second); //seconds remain in a day
		System.out.println(second * 100 / (24 * 60 * 60) ); //percentage of a day passed
		System.out.println(second - 13 * 60 * 60); //seconds passed since working on assignments, assume from 13:00 to 13:15
	}
}
