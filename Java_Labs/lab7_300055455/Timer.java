public class Timer {
	private int hours;
	private int minutes;
	private int seconds;

	public Timer(){
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public void incrementHours(){
		if(this.hours < 23){
			this.hours++;
		}else if(this.hours == 23){
			this.hours = 0;
		}
		
	}

	public void decrementHours(){
		if(this.hours >0){
			this.hours--;
		}else if(this.hours==0){
			this.hours = 23;
		}
		
	}

	public int getHours(){
		return hours;
	}

	public void incrementMinutes(){
		if(this.minutes < 59){
			this.minutes++; 
		}else if (this.minutes == 59){
			this.incrementHours();
			this.minutes = 0;
		}
		
	}
	public void decrementMinutes(){
		if(this.minutes > 0){
			this.minutes--;
		}else if (this.minutes == 0){
			this.decrementHours();
			this.minutes = 59;
		}
		
	}

	public int getMinutes() {
		return minutes;
	}

	public void incrementSeconds(){
		if(seconds < 59){
			this.seconds++; 
		}else if (seconds == 59){
			this.incrementMinutes();
			seconds = 0;
		}
		
	}

	public void decrementSeconds(){
		if(seconds > 0){
			this.seconds--;
		}else if (seconds == 0){
			this.decrementMinutes();
			seconds = 59;
		}
	}
	
	public int getSeconds(){
		return seconds;
	}

	public String toString () {
		return "Timer "+hours+":"+minutes+":"+seconds;
	}
}