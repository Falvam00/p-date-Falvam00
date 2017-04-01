//Felipe Alvarez Martin

package es.unileon.prg.date;

public class Date{

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{

		this.day=day;

		if(month<1 || month>12){
			
			throw new DateException("Month " + month + " invalid");
		} else{
			
			this.month=month;
		}
		
		this.year=year;
	}
	
	public Date(int year){
		
		this.year=year;
		
		this.month=(int)(Math.random()*12+1);
		
		this.day=(int)(Math.random()*daysOfMonth(this.month)+1);
		
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

	public boolean isSameYear(int year){

		boolean result=false;

		if(this.year==year){
			
			result=true;
		}

		return result;
	}

	public boolean isSameMonth(int month){

		boolean result=false;

		if(this.month==month){
			
			result=true;
		}

		return result;
	}

	public boolean isSameDay(int day){

		boolean result=false;

		if(this.day==day){
			
			result=true;
		}

		return result;
	}

	public boolean isSame(int day, int month, int year){

		boolean result=false;

		if(this.day==day && this.month==month && this.year==year){

			result=true;
		}

		return result;
	}

	public String getNameMonth(int month){

		String name="";

		switch(month){

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

	public int daysOfMonth(int month){

		int number=0;

		switch(month){

			case 1:	//next
			case 3:	//next
			case 5:	//next
			case 7:	//next
			case 8:	//next
			case 10:	//next
			case 12:
				number=31;
				break;
			case 2:
				number=28;
				break;
			case 4:	//next
			case 6:	//next
			case 9:	//next
			case 11:
				number=30;
				break;
		}

		return number;
	}

	public boolean isDayRigth(){

		boolean result=true;

		if(this.day<=0 || this.day>daysOfMonth(this.month)){

			result=false;
		}

		return result;
	}

	public String getSeason(){

		String season="";

		switch(this.month){

			case 12:
				if(this.day<21){
					season="Autumn";
				} else{
					season="Winter";
				}
				break;
			case 1: 	//next
			case 2: 
				season="Winter";
				break;
			case 3:
				if(this.day<21){
					season="Winter";
				} else{
					season="Spring";
				}
				break;
			case 4: 	//next
			case 5:
				season="Spring";
				break;
			case 6:
				if(this.day<21){
					season="Spring";
				} else{
					season="Summer";
				}
				break;
			case 7: 	//next
			case 8:
				season="Summer";
				break;
			case 9:
				if(this.day<21){
					season="Summer";
				} else{
					season="Autumn";
				}
				break;
			case 10: 	//next
			case 11:
				season="Autumn";
				break;
		}

		return season;
	}
	
	public int monthsLeft(){
		
		int number=0;
		int i;
		
		for(i=this.month+1;i<=12;i++){
			
			number++;
		}
		
		return number;
	}

	public String toString(){

		return this.day + "/"+ this.month + "/" + this.year;
	}
	
	public int countDaysUntilEndMonth(){
		
		int number;
		
		number=daysOfMonth(this.month)-this.day;
		
		return number;
	}
	
	public String monthsWithSameDays(){
		
		String result="";
		
		for(int i=1;i<=12;i++){
			
			if(daysOfMonth(this.month)==daysOfMonth(i)){
				
				result=result + getNameMonth(i) + ", ";
			}
		}
		
		return result;
	}

	public int countDaysYear(){

		int counter=0;

		for(int i=1; i<this.month; i++){

			counter=counter+daysOfMonth(i);
		}

		counter=counter+this.day;

		return counter;
	}

	public int getNumGuess(){

		int counter=0;
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
	}

}
