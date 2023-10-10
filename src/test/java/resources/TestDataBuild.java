package resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pojo.BuisnessDocument;
import pojo.BuisnessInformation;
import pojo.BuisnessNature;
import pojo.BuisnessPanChecks;
import pojo.LoanPurpose;
import pojo.LocationChecks;
import pojo.VerfiyOtp;
import pojo.buisnesspan;
import pojo.sendotp;

public class TestDataBuild {

	public sendotp sendotpPayLoad(String mobile) {
		sendotp p = new sendotp();
		p.setMobile(mobile);
		return p;
	}

	public VerfiyOtp verifyotppayload(String mobilenumber, String leadsource) throws IOException {
		VerfiyOtp v = new VerfiyOtp();
		v.setmobile(mobilenumber);
		v.setOtp(Utils.getGlobalValue("otp"));
		v.setLead_source(leadsource);
		return v;
	}

	public static sendotp addlead(String number) {
		sendotp p1 = new sendotp();
		p1.setMobile(number);
		return p1;
	}

	public static VerfiyOtp addotpwithmobile(String number, String otp) throws IOException {
		VerfiyOtp v = new VerfiyOtp();
		v.setmobile(number);
		v.setOtp(Utils.getGlobalValue("otp"));
		return v;

	}

	public static BuisnessNature AddBusinessNature(String Leadid, String Nature, String Action) {

		BuisnessNature bs = new BuisnessNature();
		bs.setLead_id(Leadid);
		bs.setNature_of_business_id(Nature);
		bs.setAction(Action);
		return bs;

	}

	public static BuisnessPanChecks AddBusinessPAN(String Leadid, String PAN, String action, int masterid) {

		BuisnessPanChecks BPC = new BuisnessPanChecks();
		BPC.setLead_id(Leadid);
		BPC.setPan(PAN);
		BPC.setAction(action);
		BPC.setApplication_type_master_id(masterid);
		return BPC;
	}

	public static BuisnessDocument AddBusinessDocument(String Leadid, String docboolean, String action) {

		BuisnessDocument BD = new BuisnessDocument();
		BD.setLead_id(Leadid);
		BD.setBusiness_document(docboolean);
		BD.setAction(action);
		return BD;

	}

	public static LoanPurpose Addloanpurpose(String Leadid, String num, String loanpurpose) {
		LoanPurpose LP = new LoanPurpose();
		LP.setLead_id(Leadid);
		LP.setPurpose_of_loan_master_id(num);
		LP.setAction(loanpurpose);
		return LP;
	}

	public static LocationChecks payloadlocationeligibiltychecks(String leadid, String pincode, String email,
			String action) {

		LocationChecks LC = new LocationChecks();
		LC.setLead_id(leadid);
		LC.setPincode(pincode);
		LC.setEmail(email);
		LC.setAction(action);
		return LC;

	}

	public static BuisnessInformation Businessinformationpayload(String lead, String occupationType,
			String BusinessVintage, String Industryid, String action) {

		BuisnessInformation BI = new BuisnessInformation();
		BI.setLead_id(lead);
		BI.setOccupation_type(occupationType);
		BI.setBusiness_vintage(BusinessVintage);
		BI.setIndustry_master_id(Industryid);
		BI.setAction(action);
		return BI;

	}

}
