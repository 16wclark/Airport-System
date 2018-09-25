
public class AirlineCompany extends Passenger{

	protected String planeCompanyList[] = {"Delta", "Vigin Mobile", "American Airlines", ""};
	static AirlineCompany Delta = new AirlineCompany();
	static AirlineCompany AmericanAirlines = new AirlineCompany();
	static AirlineCompany VirginMobile = new AirlineCompany();
	
	public AirlineCompany() {
		// TODO Auto-generated constructor stub
	}
	
	public AirlineCompany setAssignedPlane(AirlineCompany airplainName) {
		if(airplainName == Delta)
			return Delta;
		if(airplainName == VirginMobile)
			return VirginMobile;
		
		return AmericanAirlines;
	}

	public void test() {}
}
