package resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pojo.BuisnessNature;
import pojo.VerfiyOtp;
import pojo.buisnesspan;
import pojo.sendotp;

public class TestDataBuild {

	
   
    
	public sendotp sendotpPayLoad(String mobile)
	{
		sendotp p =new sendotp();
		p.setMobile(mobile);
		return p;

	}
	
	public VerfiyOtp verifyotppayload(String mobilenumber,String leadsource) throws IOException {
		VerfiyOtp v= new VerfiyOtp();
	    v.setmobile(mobilenumber);
	    v.setOtp(Utils.getGlobalValue("otp"));
	    v.setLead_source(leadsource);
	    return v;
	}
	
public static sendotp addlead(String number) {
	sendotp p1 =new sendotp();
	p1.setMobile(number);	
	return p1;            	
	}

public static VerfiyOtp addotpwithmobile(String number, String otp) throws IOException {
    VerfiyOtp v= new VerfiyOtp();
    v.setmobile(number);
    v.setOtp(Utils.getGlobalValue("otp"));
    return v;
	
}


public static BuisnessNature AddBusinessNature(String Leadid,String Nature,String Action) {
	
	
	
	BuisnessNature bs= new BuisnessNature();
	
	bs.setLead_id(Leadid);
	bs.setNature_of_business_id(Nature);
	bs.setAction(Action);
	return bs;
		
		
	
	
//	return "{\r\n"
//			+ "\r\n"
//			+ "  \"eligibility_check\": {\r\n"
//			+ "\r\n"
//			+ "    \"lead_id\": \""+Leadid+"\",\r\n"
//			+ "\r\n"
//			+ "    \"nature_of_business_id\": \""+Nature+"\",\r\n"
//			+ "\r\n"
//			+ "    \"action\": \""+Action+"\"\r\n"
//			+ "\r\n"
//			+ "  }\r\n"
//			+ "\r\n"
//			+ "}";
//	
}
	
public static String AddBusinessPAN(String Leadid,String PAN,String action,String masterid) {
	
//	  buisnesspan bp=new buisnesspan();
//	  bp.setLead_id(Leadid);
//	  bp.setPan(PAN);
//	  bp.setAction(action);
//	    bp.setApplication_type_master_id(masterid);
//	  return bp;
	
	
	
	
	
	
	
	
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

public static String Businessinformationpayload(String lead,String occupationType,String BusinessVintage,String Industryid,String action) {

    

    return "{\r\n"

            + "  \"eligibility_check\": {\r\n"

            + "    \"lead_id\": \""+lead+"\",\r\n"

            + "    \"occupation_type\": \""+occupationType+"\",\r\n"

            + "    \"business_vintage\": \""+BusinessVintage+"\",\r\n"

            + "    \"industry_master_id\": "+Industryid+",\r\n"

            + "    \"action\": \""+action+"\"\r\n"

            + "  }\r\n"

            + "}";


}

}
