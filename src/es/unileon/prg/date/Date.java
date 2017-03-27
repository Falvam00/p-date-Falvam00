//Felipe Alvarez Martin

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

	public String getNameMonth(){

		String name="";

		switch(this.month){

			case 1:
				name="January";
				break;
			case 2:
				name="February";
				break;
			case 3:
				name="March";
				break;
			case 4:
				name="April";
				break;
			case 5:
				name="May";
				break;
			case 6:
				name="June";
				break;
			case 7:
				name="July";
				break;
			case 8:
				name="August";
				break;
			case 9:
				name="September";
				break;
			case 10:
				name="October";
				break;
			case 11:
				name="November";
				break;
			case 12:
				name="December";
				break;
		}

		return name;
	}

	public int daysOfMonth(){

		int number=0;

		switch(this.month){

			case 1:
				number=31;
				break;
			case 2:
				number=28;
				break;
			case 3:
				number=31;
				break;
			case 4:
				number=30;
				break;
			case 5:
				number=31;
				break;
			case 6:
				number=30;
				break;
			case 7:
				number=31;
				break;
			case 8:
				number=31;
				break;
			case 9:
				number=30;
				break;
			case 10:
				number=31;
				break;
			case 11:
				number=30;
				break;
			case 12:
				number=31;
				break;
		}

		return number;
	}

	public String isDayRigth(){

		String result;

		if(this.day<=0 || this.day>this.daysOfMonth()){

			result="The day is wrong";
		}
		else{

			result="The day is rigth";
		}

		return result;
	}

	public String getSeason(){

		String season="";

		switch(this.month){

			case 12: 	//next
			case 1: 	//next
			case 2: 
				season="Winter";
				break;
			case 3: 	//next
			case 4: 	//next
			case 5:
				season="Spring";
				break;
			case 6: 	//next
			case 7: 	//next
			case 8:
				season="Summer";
				break;
			case 9:		//next
			case 10: 	//next
			case 11:
				season="Autumn";
				break;
		}

		return season;
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
