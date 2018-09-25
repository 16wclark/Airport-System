
public class Passenger {

	public Passenger() {
		// TODO Auto-generated constructor stub
	}

	static String first;
	static String last;
	static String locations;
	
	//Passenger flight = new Passenger();
	
	public static void printFlightInfo(Passenger flight) {
		System.out.println(flight);
		System.out.println(first + " " + last + " " + locations);
		
		
	}
	
	public void registerFlight(Flight flight, Seat seat) {
		
	}
	
	public String setPassenger(String firstName, String lastName, String location) {
		first = firstName;
		last = lastName;
		locations = location;
		return firstName;
	}
}
