package hw.hw4;


// The measurement data generated by WeatherInput should contain four values:
// the city, temperature, humidity, and pressure. You can think of the
// WeatherInput object as aggregating weather measurements from all
// over the world and sending them to WeatherMgr.

// In this assignment there should be one WeatherInput object, which sends its data to the WeatherMgr object

public interface WeatherInput {
	
	public void run();

}