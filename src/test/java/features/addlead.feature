Feature: Validating Place API
@Addlead
Scenario Outline: Verify if Lead is being Succesfully added using RegisterAPI
	Given AddLeadAPI Payload with "<Mobilenumber>"
	When user calls endpoint "InstaOtpSent" with "POST" http request
	Then the API call got success with status code 200
	And the call Payload with "<Mobilenumber>" "<OTP>"
	Then calls endpoint "InstaVerifyOTP" with "POST" http request
	Then the API call got success with status code 200
#	Then verify the mobile when we call "<mobile>"
#	And "status" in response body is "OK"
#	And "scope" in response body is "APP"
#	And verify place_Id created maps to "<name>" using "getPlaceAPI"

Examples:
	|Mobilenumber|OTP|
	|9567189110 |123456|
#	|785643266  |123456|
 #|87654320972|123456|
 
 
 Scenario Outline: Quick Eligibilty checks for Buisness Location
	
	Given EligibilitychecksAPI Payload with "<lead_id>" "<pincode>" "<email>"
	When calls Endpoint "Instaeligibiltychecks" with "POST" http Requests
	Then the API call got success with status code 200 
	
	
	Examples:
	|lead_id|pincode|email|
	|2266053a-b11d-d9df-f00e-64a3cc8969b2|560040|huj@gmail.com|
	|2266053a-b11d-d9df-f00e-64a3cc8969b2|560078|huj@|
	 




Scenario Outline: Verify the Business Nature
Given Add Business Nature Payload with values of "<Leadid>"  "<NatureBusinessID>" "<action>"
And call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200

Examples:
|Leadid                              |NatureBusinessID|action                 |
|37faa01f-e9ab-d47f-62f8-634f828110b2|1               |nature_of_business     |





Scenario Outline: Verify the Buiness pan 
Given Add Business PAN payload with values of "<Leadid>"  "<PAN>" "<action>" "<masterid>"
And call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200


Examples:
|Leadid                              |PAN       |action      |masterid|
|37faa01f-e9ab-d47f-62f8-634f828110b2|BAWPM3735P|business_pan|1       |
#|37faa01f-e9ab-d47f-62f8-634f828110b2|BAWPM3735|business_pan|2        |

Scenario Outline: Verify the Business Documents
Given Add Business Documents payload with values of "<Leadid>"  "<docboolean>" "<action>"
And call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200


Examples:
|Leadid                              |docboolean|action           |
|37faa01f-e9ab-d47f-62f8-634f828110b2|true      |business_document|

Scenario Outline: Verify the Business Loan Purpose
Given Add Business loan purpose payload value of "<Leadid>"  "<num>" "<loanpurpose>"
And call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200


Examples:
|Leadid                              |num|loanpurpose |
|37faa01f-e9ab-d47f-62f8-634f828110b2|5  |loan_purpose|







	
	
	
	
	
	
	 



	

	
	
	
	
	
	

	
	
	