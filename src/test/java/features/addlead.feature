Feature: Validating Place API
@Addlead
Scenario Outline: Verify if Lead is being Succesfully added using RegisterAPI
	Given AddLeadAPI Payload with "<Mobilenumber>"
	When user calls endpoint "InstaOtpSent" with "POST" http request
	Then the API call got success with status code 200
	And "message" in response body is "OTP sent successfully"
	And the call Payload with "<Mobilenumber>" "<OTP>"
	Then calls endpoint "InstaVerifyOTP" with "POST" http request
	Then the API call got success with status code 200
	And "message" in response body is "OTP verified successfully. Welcome ."
	
  

Examples:
	|Mobilenumber|OTP|
	|9567189110 |123456|
#	|785643266  |123456|
 #|87654320972|123456|
 
 
 Scenario Outline: Quick Eligibilty checks for Buisness Location
	
	Given EligibilitychecksAPI Payload with "<lead_id>" "<pincode>" "<email>"
	When calls Endpoint "Instaeligibiltychecks" with "POST" http Requests
	Then the API call got success with status code 200 
	And "message" in response body is "Lead updated successfully"
	And "email" in response body is "huj@gmail.com"
#	And "occupation_type" in response body is "Business Owner"
	
	
	Examples:
	|lead_id|pincode|email|
	|2266053a-b11d-d9df-f00e-64a3cc8969b2|560040|huj@gmail.com|
#	|2266053a-b11d-d9df-f00e-64a3cc8969b2|560078|huj@|

Scenario Outline: Verify the Business information
Given Add Business Information payload with "<lead>" "<occupationType>" "<BusinessVintage>" "<Industryid>" "<action>"
When call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200
And "message" in response body is "Lead updated successfully"
#And "business_vintage" in response body is ">36 months"

Examples:
|lead                                |occupationType|BusinessVintage|Industryid|action              |
|2266053a-b11d-d9df-f00e-64a3cc8969b2|Business Owner|>36 months     |1         |business_information|


Scenario Outline: Verify the Business Nature
Given Add Business Nature Payload with values of "<Leadid>"  "<NatureBusinessID>" "<action>"
And call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200
And "message" in response body is "Lead updated successfully"
#And "email" in response body is "check@gmail.com"

Examples:
|Leadid                              |NatureBusinessID|action                 |
|37faa01f-e9ab-d47f-62f8-634f828110b2|1               |nature_of_business     |





Scenario Outline: Verify the Buiness pan 
Given Add Business PAN payload with values of "<Leadid>"  "<PAN>" "<action>" "<masterid>"
And call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200
And "message" in response body is "Lead updated successfully"
#And "application_type_master_id" in response body is "1"


Examples:
|Leadid                              |PAN       |action      |masterid|
|37faa01f-e9ab-d47f-62f8-634f828110b2|BAWPM3735P|business_pan|1       |
#|37faa01f-e9ab-d47f-62f8-634f828110b2|BAWPM3735|business_pan|2        |

Scenario Outline: Verify the Business Documents
Given Add Business Documents payload with values of "<Leadid>"  "<docboolean>" "<action>"
And call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200
And "message" in response body is "Lead updated successfully"
#And "business_vintage" in response body is ">36 months"


Examples:
|Leadid                              |docboolean|action           |
|37faa01f-e9ab-d47f-62f8-634f828110b2|true      |business_document|

Scenario Outline: Verify the Business Loan Purpose
Given Add Business loan purpose payload value of "<Leadid>"  "<num>" "<loanpurpose>"
And call end point "Instaeligibiltychecks" and "POST" the request
Then the API call got success with status code 200
And "message" in response body is "Lead updated successfully"
#And "pan" in response body is "BAWPM3735P"


Examples:
|Leadid                              |num|loanpurpose |
|37faa01f-e9ab-d47f-62f8-634f828110b2|5  |loan_purpose|







	
	
	
	
	
	
	 



	

	
	
	
	
	
	

	
	
	