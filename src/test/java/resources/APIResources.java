package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	InstaOtpSent("/api/v2/otp"),
	InstaVerifyOTP("/api/v2/register"),
	CRMGetLeadDetails("/index.php?entryPoint=crmapi"),
	Instaeligibiltychecks("/api/v2/eligibility_checks");
	
	
	
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
