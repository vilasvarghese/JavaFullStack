package assignment2;

public class ElectronicMusicPlayer implements Guitar, Piano{
	
	public void play() {
		System.out.println("play() method in ElectronicMusicPlayer .");
		Guitar.super.play();
		Piano.super.play();
	}
	
	public static void main(String[] args) {
		Instrument instrument = new ElectronicMusicPlayer();
		instrument.play();
	}
}
