package assignment2;

public interface Guitar extends Instrument {

	default void play() {
		System.out.println("play() method in Guitar interface.");
	}
}
