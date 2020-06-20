# Abilify Rest API Implemented with Spring Boot, Hibernates, Domain Driven Design, Object Oriented Programming Standards

This code base is the implementantion of a Spring Boot RestFull API for the Ability Marketplace platform.

Abilify MarketPlace is a Service Oriented Architecture use case implementation of Smart phones, TVs and all related smart 

devices Tech Support service providers and customers marketplace (currently under full-stack development).

A customer has it´s Iphone screen broken and wants to repair it (after warranty has expired) he/she can do so by posting

a repair service gig on the Abilify Platform.

# System Design / API Services

1) IT Support Provider user profilling service

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

2) IT Support Customer user profilling service

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
   
3) IT Support Offering Services 
( Tech support customer posts an Tech support job on the platform)

   API CRUD EndPoints (ver 1.0):
   
   - registerTechSupportJob;
   - registerTechSupportJobOperSystem;
   - registerTechSupportJobType;
   
   - registerTechSupportJobDescription;
   - registerTechSupportJobLocale;
   - registerTechSupportJobDate;
   - registerTechSupportJobItens;
   
4) IT Support Job Service Matcher 
( Tech support provider gets notified on a new job post / service provider bids for the job; etc ...)

   API CRUD EndPoints (ver 1.0):   
   
