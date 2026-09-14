public class Time{
	public static void main (String[] args){
		int hour = 13, minute = 35; //time chosen: 13:35
		int second = hour * 3600 + minute * 60;
		System.out.println(second); //seconds passed since midnight of a day
		System.out.println(86400 - second); //seconds remain in a day
		System.out.println(second * 100 / 86400); //percentage of a day passed
		System.out.println(second - 13 * 3600); //seconds passed since working on assignments
	}
}
