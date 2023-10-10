package pojo;

public class LocationChecks {

	private String lead_id;
	private String pincode;
	private String email;
	private String action;
	
	public String getLead_id() {
		return lead_id;
	}
	public void setLead_id(String lead_id) {
		this.lead_id = lead_id;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
	
	
	
	
	
//	return "{\r\n"
//			+ "  \"eligibility_check\": {\r\n"
//			+ "    \"lead_id\": \""+leadid+"\",\r\n"
//			+ "    \"pincode\": \""+pincode+"\",\r\n"
//			+ "    \"email\": \""+email+"\",\r\n"
//			+ "    \"action\": \"business_location\"\r\n"
//			+ "  }\r\n"
//			+ "}";
}
