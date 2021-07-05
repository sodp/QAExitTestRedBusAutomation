Selenium_Exit_Siddhant_Panda_3164895
=========================
Automation Test Practice UI Automation [Testing Website URL](https://www.redbus.in/)
==============================================================

[Git Hub Repo](https://github.com/sodp/QAExitTestRedBusAutomation.git)
====================================================================

Abstract
========
This project uses Page Object Model (POM) Framework  and  it use test driven approach. Automates basic UI functionality & navigation of redbus website & dependencies can be found in pom.xml(maven project). Screenshots  along with error description can be found in extent test report

#Modules in Testing
* Module 1 : Manage Booking (Pages Java Class and Test Class)

		-bookingCancelTest/cancelBookingPage
		-bookingchangeTravelDateTest/bookingManagingPage
		-bookingShowTicketTest/bookingManagingPage

* Module 2 : Home Page

		-busOperatorTest/busOperatorPage
		-careerTest/careerPage
		-contactTest/contactPage
		-helpTest/helpPage
		-offerTest/offerPage
		-partnerWebsiteTest/partnerWebsitePage
		-signinTest/signinPage
		-rpoolTest/rpoolPage

* Module 3: Global Booking
			
			-globalSiteBookingPage
			-Singapore Booking Page
			-Malaysia Booking Page
			-Indonesia Booking Page
			-Peru Booking Page
			-Colombia Booking Page

* Module 4: Section Info
			
			-InfoSection sectionInfoPage
			-Terms and Condition Page
			-Privacy Policy Page	
			-FAQ Page	
			-Blog Page	
			-Insurance Page	
			-User Agreement Page	
			-Agent Registration Page	

* Module 5 : Bus Hire

		-busHireLocationTest valid
		-busHireOutstationPage valid 

* Module 6: Search Bus

       -Valid Search Bus		
       -Valid Modify Search Bus		

* Docker module

* Steps to set up docker:

	-Install docker in your system
	
	*Pull the following docker images :
	
			-docker pull selenium/hub
	
			-docker pull selenium/node-chrome
	
			-docker pull selenium/node-firefox
	
			-use the docker-compose.yml file for the next step
	
			-docker-compose -f /path/to/docker-compose.yml up -d
	
			-This makes the grid up and running. you can verify it by         
			
			-visiting : http://localhost:4444/grid/console
			
			-docker-compose up -d
          
          -docker ps -a

          -docker-compose down

(To run the test cases on docker set, browser = chrome/firefox , headless = no and docker = true)

* Jenkins module

		-The project has been integrated with github and jenkins.
	 	-https://github.com/sodp/QAExitTestRedBusAutomation.git (Git Hub Link)
       -A screenshot of the jenkins integration is present in the project directory.



* Use the following steps to execute this project.

			1. Extract the zip and then place it in your workspace.
			2. Open a terminal window/command prompt from that location.
			3. mvn clean test

#or
Run  the "runner.bat" file present in the directory itself to run it directly.


#or
To Run  the framework in jenkins follow the jenkin.doc 

##Special Note & Errors:
		* Headless mode for docker is not running
		* serial execution of test cases is running smoothly but parallel test cases failing in docker
		* execution required or not can be taken from excel

          
        
  
* for headless mode execution in chrome and firefox and docker (headless mode not available)
  
        -Go to folder Resources
        -Go to conf.properties
        -Change browser = "chrome" headless = "yes" docker =false
        -Change browser = "firefox" headless = "yes" docker = false

* for normal mode execution in chrome and firefox and dcoker
  
        -Go to folder Utilities
        -Go to conf.properties
        -Change browser = "chrome" headless = "no" docker = true
        -Change browser = "firefox" headless = "no" docker = true
        


## Requirements

		-java
		-eclipse
		-jenikins	
		-docker

## Dependencies to install
    Note : The dependencies are already present in pom file.
           -Selenium
           -Test NG
           -Extent Reports
           -Log4j
           -POI XML     
           
###Tested Website Functionalities:

	 -Cancel Ticket Page Navigation
	
	 -Change Travel Date Page
	
	 -ShowTicket navigation scenario test
	
	 -Bus Hire Outstation Functionality
	
	 -Bus Hire Local Functionality
	
	 -All Bus Operators Navigation Test
	
	 -Valid careers page scenario test
	
	 -Valid SearchBus scenario test
	
	 -Global Site booking Singapore Navigation Scenario test
	
	 -Global Site Booking of Malaysia Navigation Scenario test
	
	 -Global Site Booking of Indonesia Navigation Scenario test
	
	 -Global Site Booking of Peru Navigation Scenario Test
	
	 -Globally Site Booking of Colombia Navigation Scenario Test
	
	 -Valid HelpButton Navigationtest
	
	 -Invalid App Link Scenario test
	
	 -Valid App Link Scenario test
	
	 -Valid Modify Search Bus Location Functionality Test
	
	 -Offers Page Navigation Test
	
	 -Valid Goibibo Navigation Test
	
	 -Valid Make My Trip Navigation test
	
	 -rpool Page Andriod App page test
	
	 -rpool Page IOS App page test
	
	 -Valid search bus test
	
	 -Navigate to term And Condition page scenario test
	
	 -Navigate to Privacy Policy page  scenario test
	
	 -Navigate to FAQ Page  scenario test
	
	 -Navigate to Blog Section  scenario test
	
	 -Navigate to Insurance Section  scenario test
	
	 -Navigate to User Agreement Section  scenario test
	
	 -Navigate to Agent Registration  scenario test


### Folder structure    
          
####src/main/java

	Pages:
	
			bookingManagingPage
			busHireLocationPage
			busHireOutstationPage
			busOperatorPage
			careerPage
			contactPage
			globalSiteBookingPage
			helpPage
			mobileAppLink
			modifySearchBusPage
			offerPage
			partnerWebsitePage
			rpoolPage
			SearchBus
			sectionInfoPage
			signinPage
	util:
	
			calendar
			datetimepicker
			
####src/main/java

	Test:
	  
			BaseTest
			BookingCancelTest
			BookingchangeTravelDateTest
			bookingShowTicketTest
			busHireLocalTest
			busHireOutstationTest
			busOperatorTest
			careerTest
			contactTest
			globalSitesBookingTest
			helpTest
			mobileAppLinkTest
			modifySearchBusTest
			offerTest
			partnerWebsiteTest
			rpoolTest
			SearchBustest
			sectionInfoTest
			signinTest
			
	Utils
	
			ExcelFileIO
			Execution
			ScreenShots

####Drivers

			chromedriver
			edgedriver
			geckodriver
			
####Reports

			report.html
			screenshots

####Resources

			conf.config
			data.xlsx
			log4j
			Readme.md
			runner.bat
			pom.xml
			docker-compose.yml




