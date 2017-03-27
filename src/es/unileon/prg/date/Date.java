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

	public String isSameYear(int year){

		String result;

		if(this.year==year){

			result="Its the same year";
		}
		else{

			result="It isnt the same year";
		}

		return result;
	}

	public String isSameMonth(int month){

		String result;

		if(this.month==month){

			result="Its the same month";
		}
		else{

			result="It isnt the same month";
		}

		return result;
	}

	public String isSameDay(int day){

		String result;

		if(this.day==day){

			result="Its the same day";
		}
		else{

			result="It isnt the same day";
		}

		return result;
	}

	public String isSame(int day, int month, int year){

		String result;

		if(this.day==day && this.month==month && this.year==year){

			result="Its the same date";
		}
		else{

			result="It isnt the same date";
		}

		return result;
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
