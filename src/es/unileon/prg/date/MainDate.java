package es.unileon.prg.date;

public class MainDate{

	public static void main(String args[]){

		Date today;

		today=new Date(27,3,2017);

		System.out.println("Day: " + today.getDay() + "\nMonth: " + today.getMonth() + "\nYear: " + today.getYear());
		
	}
}
