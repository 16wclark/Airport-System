
public class Flight extends AirlineCompany{

	public Flight() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight flight1 = new Flight();
		
		flight1.setPassenger("Matthew", "Schwartzkopf", "Saarland, Germany");
		flight1.setAssignedPlane(Delta);
		flight1.setDepartDate("September 25, 2018");
		flight1.setDepartPlace("Burlington");
		flight1.setDestPlace("California");
		flight1.setDepartTime("12:30pm");
		flight1.expectedDuration("3 days");
		Flight.printFlightInfo(flight1);
		//flight1.registerFlight(flight1, "12E");
	}
	
	public String setDepartDate(String date) {
		return date;
		
	}
	
	public String setDepartTime(String time) {
		return time;
		
	}
	
	public String expectedDuration(String duration) {
		return duration;
		
	}

	public String setDepartPlace(String origin) {
		return origin;
	}
	
	public int setDate() {
		return 0;
	}
	
	public int setFlightNumber() {
		return 0;
	}
	
	public String setDestPlace(String place) {
		return place;
	}
	
	public boolean checkIfFlightExists() { // Figure this out later if possible
		return false;
		
	}
}
