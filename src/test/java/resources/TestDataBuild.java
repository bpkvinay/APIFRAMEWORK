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

public static String AddBusinessNature(String Leadid,String Nature,String Action) {
	
	return "{\r\n"
			+ "\r\n"
			+ "  \"eligibility_check\": {\r\n"
			+ "\r\n"
			+ "    \"lead_id\": \""+Leadid+"\",\r\n"
			+ "\r\n"
			+ "    \"nature_of_business_id\": \""+Nature+"\",\r\n"
			+ "\r\n"
			+ "    \"action\": \""+Action+"\"\r\n"
			+ "\r\n"
			+ "  }\r\n"
			+ "\r\n"
			+ "}";
	
}
	
public static String AddBusinessPAN(String Leadid,String PAN,String action,String masterid) {
	return "{\r\n"
			+ "  \"eligibility_check\": {\r\n"
			+ "    \"lead_id\": \""+Leadid+"\",\r\n"
			+ "    \"pan\": \""+PAN+"\",\r\n"
			+ "    \"action\": \""+action+"\",\r\n"
			+ "\"application_type_master_id\": "+masterid+"\r\n"
			+ "\r\n"
			+ "  }\r\n"
			+ "}";
}

public static String AddBusinessDocument(String Leadid,String docboolean,String action) {
	return "{\r\n"
			+ "  \"eligibility_check\": {\r\n"
			+ "    \"lead_id\": \""+Leadid+"\",\r\n"
			+ "    \"business_document\": \""+docboolean+"\",\r\n"
			+ "    \"action\": \""+action+"\"\r\n"
			+ "  }\r\n"
			+ "}";
}


public static String Addloanpurpose(String Leadid,String num,String loanpurpose) {
	return "{\r\n"
			+ "  \"eligibility_check\": {\r\n"
			+ "    \"lead_id\": \""+Leadid+"\",\r\n"
			+ "    \"purpose_of_loan_master_id\": \""+num+"\",\r\n"
			+ "    \"action\": \""+loanpurpose+"\"\r\n"
			+ "  }\r\n"
			+ "}";
}








}
