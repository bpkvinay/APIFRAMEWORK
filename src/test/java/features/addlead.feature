Feature: Validating Place API
@Addlead
Scenario Outline: Verify if Lead is being Succesfully added using RegisterAPI
	Given AddLeadAPI Payload with "<Mobilenumber>"
	When user calls endpoint "InstaOtpSent" with "POST" http request
	Then the API call got success with status code 200
	And the call Payload with "<Mobilenumber>" "<OTP>"
	Then calls endpoint "InstaVerifyOTP" with "POST" http request
	Then verifyOTP call got success with status code 200
#	And "status" in response body is "OK"
#	And "scope" in response body is "APP"
#	And verify place_Id created maps to "<name>" using "getPlaceAPI"
	
Examples:
	|Mobilenumber|OTP|
	|9567189110 |123456|

	 


	

	
	
	
	
	
	

	
	
	