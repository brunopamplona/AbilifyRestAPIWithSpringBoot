# Abilify Rest API Implemented in Java Spring Boot, Hibernates and MySQL

The Abilify MarketPlace is a Service Oriented Architecture use case implementation of Tech Support service providers 

and customers marketplace (Tech Support service include: Smart phones, TVs and all related smart devices Tech Support)  

(currently under full-stack development). A sample use case could be ...

A customer has it´s Iphone screen broken and wants to repair it (after warranty has expired) he/she can do so by posting

a repair service gig on the Abilify Platform.

__

This code base is the implementantion of a Spring Boot RestFull API for the Ability Marketplace platform. The implementation,

Is done using Hibernates, API-First & Domain Driven Design, Designed to Support Multiple front-end technologies & 

Operation Systems (MAC & PC), using Object Oriented Programming Standards, using cloud computing services and servers, using MySQL 

relational database model and ANSI SQL.

__

# Abilify API Non functional requirements:

+ Escalability -> It is service oriented so it scales vertically by functionality volume usage;

+ Maintainability -> Compliant with SOLID Development practices and code using design patterns and OOP;

+ Flexibility -> Designed for multiple frontend devices and operating systems implementation (Mobile, Notebook, Desktop, Windoes, Android, IOS);

+ Hostability -> Designed to be hosted in the cloud (Google Cloud, AWS or Azure);

+ Documentation -> Product Management using (Scrum Agile) methodology, API Development using Postman and Swagger;

+ Usability -> Designed for great user experience workflows and easy-to-use functionalities (such as:  post a tech support job, neighbourhood and email first then receive tech service providers contacts and ratea by email only then login using your facebook account and submit your full home address and phone to interact with tech service providers);
__

# System / API Services / Relational Database Model Design:

1) Tech Support Provider user profilling service

   API CRUD EndPoints (ver 1.0):

   - registerProviderUser;              
   - signInProviderUser;
   - signOutProviderUser;
   - deleteProviderUser;

   - registerProviderUserContactInfo;
   - registerProviderUserPhoto&Video;
   - registerProviderUserProfileFAQs;
   - registerProviderUserFullAddress;

   - registerProviderUserCoveredServices;
   - registerProviderUserCoveredNeighbourhoods;

   - registerProviderUserBillingInfo;
   - registerProviderUserPaymentInfo;

   - getProviderUserTotalScores;
   - getProviderUserRecommendations;
   - getProviderUserJobHistory;

   __
   
2) Tech Support Customer user profilling service

   API CRUD EndPoints (ver 1.0):

   - registerCustomerUser;
   - signInCustomerUser;
   - signOutCustomerUser;
   - removeCustomerUser;
   
   - registerCustomerUserContactInfo;
   - registerCustomerUserPhoto;
   - registerCustomerUserFullAddress;
   
   - registerCustomerUserBillingInfo;
   - registerCustomerChargingInfo;
   
   - getCustomerRecommendationList;
   - getCustomerUserJobsHistory;
  
   __
   
3) Tech Support Offering Services 
   (Tech support customer posts an Tech support job on the platform)

   API CRUD EndPoints (ver 1.0):
   
   - registerTechSupportJob;
   - registerTechSupportJobOperSystem;
   - registerTechSupportJobType;
   
   - registerTechSupportJobDescription;
   - registerTechSupportJobLocale;
   - registerTechSupportJobDate;
   - registerTechSupportJobItens;
   
   __
   
4) Tech Support Job Service Matcher 
   (Tech support provider gets notified on a new job post 
    / service provider bids for the job; etc ...)

   API CRUD EndPoints (ver 1.0):   
   
   - matchJobsWithTechPros;
   - notifyMatchedProsAboutJobs;
   - notifyCustomerAboutMatchedPros;
   - sendCustomerJobExecutionProposals;
   
   __
   
5) Tech Support Job Negotiation Chat Session Service
   (Chat service between Tech Support customer and 
    the Tech Support provider to clear any doubts or
    refine service price, tech support execution dates/times)

   API CRUD EndPoints (ver 2.0):
   (to be done ...)

   __
   
6) Tech Support Job Payment Service
   (Used for approval and processing Tech support job invocing
    and Tech support provider payment for a customer approved job done)

   API CRUD EndPoints (ver 2.0):
   (to be done ...)

   __
   
7) Tech Support Recommendation Service
   (Used for recommending and ratting a Tech Service Provider for
    a job well done or for not recommending at all)

   API CRUD EndPoints (ver 2.0):
   (to be done ...)
   
 # TO GET THE CODE BASE FULL VERSION: 
 Send email to: bruno.cortereal@gmail.com | Subject: Abilify API
