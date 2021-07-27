Selenium_Exit_Siddhant_Panda_3164895
=========================
Automation Test Practice UI Automation [Testing Website URL](https://www.redbus.in/)
==============================================================

[Git Hub Repo](https://github.com/sodp/QAExitTestRedBusAutomation.git)
====================================================================

Abstract
========
This project uses Page Object Model (POM) Framework  and  it use test driven approach. Automates basic UI functionality & navigation of redbus website & dependencies can be found in pom.xml(maven project). Screenshots  along with error description can be found in extent test report

# Modules in Testing
  Module 1 : Manage Booking (Pages Java Class and Test Class)

		-bookingCancelTest/cancelBookingPage
		-bookingchangeTravelDateTest/bookingManagingPage
		-bookingShowTicketTest/bookingManagingPage

  Module 2 : Home Page

		-busOperatorTest/busOperatorPage
		-careerTest/careerPage
		-contactTest/contactPage
		-helpTest/helpPage
		-offerTest/offerPage
		-partnerWebsiteTest/partnerWebsitePage
		-signinTest/signinPage
		-rpoolTest/rpoolPage

  Module 3: Global Booking
			
		-globalSiteBookingPage
		-Singapore Booking Page
		-Malaysia Booking Page
		-Indonesia Booking Page
		-Peru Booking Page
		-Colombia Booking Page

  Module 4: Section Info
			
		-InfoSection sectionInfoPage
		-Terms and Condition Page
		-Privacy Policy Page	
		-FAQ Page	
		-Blog Page	
		-Insurance Page	
		-User Agreement Page	
		-Agent Registration Page	

  Module 5 : Bus Hire

		-busHireLocationTest valid
		-busHireOutstationPage valid 

  Module 6: Search Bus

       -Valid Search Bus		
       -Valid Modify Search Bus		

  Docker module

  Steps to set up docker:

	 			 -Install docker in your system
	
				  Pull the following docker images :
	
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
					  Special Case To Run Test Case Parallel
					   ======================================
					            -To run the test cases parallelly in two browsers in docker
					            -Use the contents of testngparallel.xml file in resources folder
					            -comment lines 120 - 180 and uncomment lines 112 - 118 in the BaseTest.java 
					            -Use webDriver.java as web intializer from web util  
					            -sample screenshot of running test cases parallelly in two browsers in main directory

 Jenkins module ( word file present in the directory)

			*The project has been integrated with github and jenkins.
			*https://github.com/sodp/QAExitTestRedBusAutomation.git (Git Hub Link)
			*A screenshot & doc of the jenkins and docker integration is present in the project directory.



 Use the following steps to execute this project.

			1. Extract the zip and then place it in your workspace.
			2. Open a terminal window/command prompt from that location.
			3. mvn clean test

# or
Run  the "runner.bat" file present in the directory itself to run it directly.


# or
To Run  the framework in jenkins follow the jenkin.doc 

## Special Note & Errors:
		* Headless mode for docker is not running
		* serial execution of test cases is running smoothly but parallel some test cases failing in docker
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
           
## Tested Website Functionalities:

	 1 Cancel Ticket Page Navigation
	
	 2 Change Travel Date Page
	
	 3 ShowTicket navigation scenario test
	
	 4 Bus Hire Outstation Functionality
	
	 5 Bus Hire Local Functionality
	
	 6 All Bus Operators Navigation Test
	
	 7 Valid careers page scenario test
	
	 8 Valid SearchBus scenario test
	
	 9 Global Site booking Singapore Navigation Scenario test
	
	 10 Global Site Booking of Malaysia Navigation Scenario test
	
	 11 Global Site Booking of Indonesia Navigation Scenario test
	
	 12 Global Site Booking of Peru Navigation Scenario Test
	
	 13 Globally Site Booking of Colombia Navigation Scenario Test
	
	 14 Valid HelpButton Navigationtest
	
	 15 Invalid App Link Scenario test
	
	 16 Valid App Link Scenario test
	
	 17 Valid Modify Search Bus Location Functionality Test
	
	 18 Offers Page Navigation Test
	
	 19 Valid Goibibo Navigation Test
	
	 20 Valid Make My Trip Navigation test
	
	 21 rpool Page Andriod App page test
	
	 23 rpool Page IOS App page test
	
	 24 Valid search bus test
	 
	 25 Navigate to term And Condition page scenario test
	
	 26 Navigate to Privacy Policy page  scenario test
	
	 27 Navigate to FAQ Page  scenario test
	
	 28 Navigate to Blog Section  scenario test
	
	 29 Navigate to Insurance Section  scenario test
	
	 30 Navigate to User Agreement Section  scenario test
	
	 31 Navigate to Agent Registration  scenario test


## Folder structure    
          
## src/main/java

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
			
## src/main/java

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

## Drivers

			chromedriver
			edgedriver
			geckodriver
			
## Reports

			report.html
			screenshots

## Resources

			conf.config
			data.xlsx
			log4j
			Readme.md
			runner.bat
			pom.xml
			docker-compose.yml
