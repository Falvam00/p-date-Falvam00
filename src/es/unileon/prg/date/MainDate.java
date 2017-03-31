//Felipe Alvarez Martin

package es.unileon.prg.date;

public class MainDate{

	public static void main(String args[]){

		Date today;

		try{

			today=new Date(45,3,2017);
			System.out.println(today);
			System.out.println(today.monthsWithSameDays());

		} catch(DateException e){
				System.out.println(e.getMessage());
		}
		
	}
}
