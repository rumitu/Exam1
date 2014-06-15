
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateLogger extends Logger{
	public void log(int newLevel, String newMessage){
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
		//get current date time with Date()
		Calendar cal = Calendar.getInstance();
		if(getLevel() >= newLevel){
			level = newLevel;
			message = newMessage;
		}
		else{
			System.out.println("Less importmant than Level.");
			level = getLevel();
			message = getMessage();
		

		}
		System.out.println(dateFormat.format(cal.getTime()) +  " " +  getLevel()+ " " + ':' + " " + getMessage());
		
	}
	public void log(String newMessage){
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
		//get current date time with Date()
		Calendar cal = Calendar.getInstance();
		if(getLevel() >= 3){
			message = newMessage;
		}
		else{
			System.out.println("Does not get printed because level is higher!");
		
		}
		System.out.println(dateFormat.format(cal.getTime())+ " " + getMessage());
		
	}

}
