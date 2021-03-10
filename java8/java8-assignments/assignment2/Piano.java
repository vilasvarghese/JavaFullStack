package assignment2;

public interface Piano extends Instrument{
	
	default void play() {
		System.out.println("play() method in Piano interface.");
	}
}
