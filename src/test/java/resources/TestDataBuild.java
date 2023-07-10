package resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pojo.VerfiyOtp;
import pojo.sendotp;

public class TestDataBuild {

	
	
	public sendotp sendotpPayLoad(String mobilenumber)
	{
		sendotp p =new sendotp();
		p.setMobilenumber(mobilenumber);
		return p;

	}
	
	public VerfiyOtp verifyotppayload(String mobilenumber,String leadsource) throws IOException {
		VerfiyOtp v= new VerfiyOtp();
	    v.setMobileNumber(mobilenumber);
	    v.setOtp(Utils.getGlobalValue("otp"));
	    v.setLead_source(leadsource);
	    return v;
	}
	
public static String addlead(String number) {
		
		return "{\r\n"
	    		+ "\"mobile\": \""+number+"\"\r\n"
	    		+ "}";
		
		
	}

public static String addotpwithmobile(String number, String otp) {
     
	return "{\r\n"
			+ "    \"mobile\":\""+number+"\",\r\n"
			+ "    \"otp\":\""+otp+"\"\r\n"
			+ "}";
	
	
}

public static String payloadlocationeligibiltychecks(String leadid,String pincode,String email) {
	return "{\r\n"
			+ "  \"eligibility_check\": {\r\n"
			+ "    \"lead_id\": \""+leadid+"\",\r\n"
			+ "    \"pincode\": \""+pincode+"\",\r\n"
			+ "    \"email\": \""+email+"\",\r\n"
			+ "    \"action\": \"business_location\"\r\n"
			+ "  }\r\n"
			+ "}";
	
	
}
	

	
}
