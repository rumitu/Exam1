
public class Logger {
	protected int level;
	protected String message;
	
	public Logger(){
		level = 3;
	}
	public Logger(int newLevel, String newMessage){
		level = newLevel;
		message = newMessage;
		
	}
	public int getLevel(){
		return level;
	}
	public String getMessage(){
		return message;
	}
	public void setLevel(int newLevel){
		level = newLevel;
	}
	public void setMessage(String newMessage){
		  message=newMessage;
	}

	public void log(int newLevel, String newMessage){
		if(getLevel() >= newLevel){
			level = newLevel;
			message = newMessage;
		}
		else{
			System.out.println("Less importmant than Level.");
			level = getLevel();
			message = getMessage();
		

		}
		System.out.println(getLevel()+ " " + ':' + " " + getMessage());
		
	}
	public void log(String newMessage){
		if(getLevel() >= 3){
			message = newMessage;
		}
		else{
			System.out.println("Does not get printed because level is higher!");
		
		}
		System.out.println(getMessage());
		
	}
	
	 public static void main(String[] args) {
		 Logger logger = new Logger();
		 logger.setLevel(4);
		 logger.log("Very important");
		 logger.setLevel(2);
		 logger.setMessage("No important");
		 logger.log(3, "No very important");
		 logger.log(1, "Very important");
		 
		 Logger logger1 = new DateLogger();
		 logger1.log("My message");


	 }
}
