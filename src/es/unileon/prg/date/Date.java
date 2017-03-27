package es.unileon.prg.date;

public class Date{

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){

		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay(){

		return this.day;
	}

	public int getMonth(){

		return this.month;
	}

	public int getYear(){

		return this.year;
	}

	/*public int countDaysYear(){

		int year;
		int counter=0;

		for(int i=1; i<this.month; i++){

			counter=counter+getNumDaysMonth(i);
		}

		counter=counter+this.day;

		return counter;
	}*/

	/*public int getNumGuess(){

		int counter;
		Date randomDate;
		boolean end=false;

		while(!end){

			randomDate=new Date(this.year);	//crear nuevo constructor para crear fechas aleatorias dado un valor solo

			counter++;

			if(this.equals(randomDate)){

				end=true;
			}
		}

		return counter;
	}*/

}
