
public class Exeption {

	private String message;
	
	Exeption(){
		message="Ti budi tu";
	}
	
	Exeption(String message){
		setMessage(message);
	}
	
	public void setMessage(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
