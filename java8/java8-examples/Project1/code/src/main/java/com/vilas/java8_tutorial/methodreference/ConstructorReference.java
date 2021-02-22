package main.java.com.vilas.java8_tutorial.methodreference;

public class ConstructorReference {

	public static void main(String[] args) {
		
		//UserFactory has a single method. That method is basically creating a new user.
		//So instead of implementing that in a Class, we can directly call the constructor.
		UserFactory userfactory = User::new;
			
		System.out.println(userfactory.createUser(1, "Vilas"));
	}
}

class User {
	private int id;
	private String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Id : "+id + " Name :"+name;
	}
}


interface UserFactory {
	public abstract User createUser(int id, String name);
}