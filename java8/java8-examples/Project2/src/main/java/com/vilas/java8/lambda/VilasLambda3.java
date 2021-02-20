public class VilasLambda3{

	public void hello(Message message){
		message.perform();
	}

	public static void main(String args[]){
		Message mymsg = new HelloWorldMessage();
		Message mymsg1 = () -> System.out.println("Hello World");
		//
		
		mymsg.perform();
		mymsg1.perform();
	}
}

interface Message{
	public void perform();
}

class HelloWorldMessage{
	public void perform(){
		System.out.println("Hello World");
	}
}