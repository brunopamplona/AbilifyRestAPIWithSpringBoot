INSERT INTO abilify_db.states (stateId, stateName, stateCepMin, stateCepMax)
VALUES (1, "Rio de Janeiro", "20000-000", "28999-999");

INSERT INTO abilify_db.states (stateId, stateName, stateCepMin, stateCepMax)
VALUES (2, "São Paulo", "01000-000", "19999-999");

INSERT INTO abilify_db.states (stateId, stateName, stateCepMin, stateCepMax)
VALUES (3, "Minas Gerais", "30000-000", "39999-999");

commit;

INSERT INTO abilify_db.cities (cityId, cityName, stateId)
VALUES (1, "Rio de Janeiro",1);

INSERT INTO abilify_db.cities (cityId, cityName, stateId)
VALUES (2, "São Paulo",2);

INSERT INTO abilify_db.cities (cityId, cityName, stateId)
VALUES (3, "Minas Gerais",3);

commit;

INSERT INTO abilify_db.neighborhoods (neighborId, cityId, neighborName, neighborCepMin, neighborCepMax)
VALUES (1, 1,"Leblon","22430-060", "22450-200");

INSERT INTO abilify_db.coveredneighborhoods (neighborId, cityId, serviceProviderId)
VALUES (1, 1, 1);

commit;

INSERT INTO abilify_db.serviceproviders   (serviceProviderId, cellPhone, cityId, cnpj,
											cpf, email, firstName, lastName, 
                                            passWord, photoId, professionalDescription,
                                            userName)
									
VALUES (1, "21974342801", 1, 30803795000137, 06932451743, "bruno.cortereal@gmail.com",
		"Bruno", "Pamplona", "brubru#2011", "123456", "Montador de Móveis", "bruno.pamplona77");

INSERT INTO abilify_db.customers   (customerId, firstName, lastName, userName,
											password, cnpj, cpf, email, 
                                            cellPhone, photoId)
									
VALUES (1, "Paula", "Costa", "paula.costa77", "ga304201", "30803795000137", "06932451743", "paula_v_costa@hotmail.com",
		"21999998888", "123456");

commit;

INSERT INTO abilify_db.fullAddress   (cityId, stateId, customerId, neighborId,
											cep, street, streetNumber, AptNumber)
									
VALUES (1, 1, 1, 1, 22431040, "Rua General Urquiza", "44", "404");

commit;

-- -----------------------------------------------------
-- Table `abilify`.`States`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `abilify_db`.`States` (
  `stateId` INT NOT NULL AUTO_INCREMENT,
  `stateName` VARCHAR(45) NOT NULL,
  `stateCepMin` VARCHAR(45) NOT NULL,
  `stateCepMax` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`stateId`),
  UNIQUE INDEX `stateId_UNIQUE` (`stateId` ASC))

ENGINE = InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `abilify`.`Cities`
-- -----------------------------------------------------

CREATE TABLE `abilify_db`.`Cities` (
  `cityId` INT NOT NULL AUTO_INCREMENT,
  `cityName` VARCHAR(45) NOT NULL,
  `stateId` INT NOT NULL,

  FOREIGN KEY (`stateId`) REFERENCES States(`stateId`),
  PRIMARY KEY (`cityId`),
  UNIQUE INDEX `cityId_UNIQUE` (`cityId` ASC))
  
 ENGINE = InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `abilify`.`Customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `abilify_db`.`Customers` (
  `customerId` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `userName` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `cnpj` VARCHAR(14) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `cellPhone` VARCHAR(11) NOT NULL,
  `photoId` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`customerId`),
  UNIQUE INDEX `customerId_UNIQUE` (`customerId` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `abilify`.`ServiceProviders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `abilify_db`.`ServiceProviders` (
  `serviceProviderId` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `passWord` VARCHAR(45) NOT NULL,
  `userName` VARCHAR(45) NOT NULL,
  `photoId` VARCHAR(45) NOT NULL,
  `professionalDescription` VARCHAR(1024) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `cnpj` VARCHAR(14) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `cellPhone` VARCHAR(11) NOT NULL,
  `cityId` INT NOT NULL,
  
  FOREIGN KEY (`cityId`) REFERENCES Cities(`cityId`),
  PRIMARY KEY (`serviceProviderId`),
  UNIQUE INDEX `serviceProviderId_UNIQUE` (`serviceProviderId` ASC))
  
ENGINE = InnoDB 
AUTO_INCREMENT = 1;

drop table abilify_db.ServiceProviders;

commit;

-- -----------------------------------------------------
-- Table `abilify`.`Neighborhoods`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `abilify_db`.`Neighborhoods` (
  `neighborId` INT NOT NULL,
  `cityId` INT NOT NULL,
  `neighborName` VARCHAR(45) NOT NULL,
  `neighborCepMin` VARCHAR(45) NULL,
  `neighborCepMax` VARCHAR(45) NULL,
  PRIMARY KEY (`neighborId`),
  FOREIGN KEY (`cityId`) REFERENCES Cities(`cityId`))

ENGINE = InnoDB 
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `abilify`.`CoveredNeighborHoods`
-- -----------------------------------------------------
CREATE TABLE `abilify_db`.`CoveredNeighborHoods` (
  `serviceProviderId` INT NOT NULL,
  `neighborId` INT NOT NULL,
  `cityId` INT NOT NULL)
  

   ENGINE = InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `abilify`.`CoveredServices`
-- -----------------------------------------------------
CREATE TABLE `abilify_db`.`CoveredServices` (
  `serviceProviderId` INT NOT NULL,
  `neighborId` INT NOT NULL,
  `cityId` INT NOT NULL,
  `serviceId` INT NOT NULL,
  `serviceCategoryId` INT NOT NULL)
  

   ENGINE = InnoDB
AUTO_INCREMENT = 1;

drop table abilify_db.servicecategory;
commit;

-- -----------------------------------------------------
-- Table `abilify`.`FullAddress`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `abilify_db`.`ServiceCatalog` (
  `serviceId` INT NOT NULL AUTO_INCREMENT,
  `serviceDescription` VARCHAR(45) NOT NULL,
  `serviceDefaultPrice` VARCHAR(45) NOT NULL,
  `serviceCategoryId` INT NOT NULL,

  PRIMARY KEY (`serviceId`),
  FOREIGN KEY (`serviceCategoryId`) REFERENCES ServiceCategory(`serviceCategoryId`))
ENGINE = InnoDB
AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS `abilify_db`.`ServiceCategory` (
  `serviceCategoryId` INT NOT NULL AUTO_INCREMENT,
  `serviceCategoryDescription` VARCHAR(45) NOT NULL,
 
  PRIMARY KEY (`serviceCategoryId`))
ENGINE = InnoDB
AUTO_INCREMENT = 1;



INSERT INTO abilify_db.serviceproviders   (serviceProviderId, cellPhone, cityId, cnpj,
											cpf, email, firstName, lastName, 
                                            passWord, photoId, professionalDescription,
                                            userName)
									
VALUES (2, "21974342801", "1", "30803795000137", "06932451743", "paula_v_costa@hotmail.com",
		"Paula", "Costa", "brubru#2011", "123456", "Técnica de TI", "paula.costa77");

commit;

insert into abilify_db.coveredneighborhoods (serviceProviderId, neighborId, cityId)
values (3, 1, 1);
 commit;
 
update abilify_db.serviceproviders
set cellPhone = "23974342801"
where cellPhone = "22974342801";

insert into abilify_db.servicecategory (serviceCategoryId, serviceCategoryDescription)
values (1, "Redes de Computadores");
 commit;
 
 insert into abilify_db.servicecategory (serviceCategoryId, serviceCategoryDescription)
values (2, "Servidores");
 commit;
 
 insert into abilify_db.servicecategory (serviceCategoryId, serviceCategoryDescription)
values (3, "Desktops");
 commit;
 
  insert into abilify_db.servicecategory (serviceCategoryId, serviceCategoryDescription)
values (4, "Periféricos");
 commit;
 
  insert into abilify_db.servicecategory (serviceCategoryId, serviceCategoryDescription)
values (5, "Tablets");
 commit;
 
  insert into abilify_db.servicecategory (serviceCategoryId, serviceCategoryDescription)
values (7, "Home Office");
 commit;
 
insert into abilify_db.coveredservices (serviceProviderId, neighborId, cityId, serviceId, serviceCategoryId)
values (1, 1, 1, 3, 1);
 commit;
 
 update abilify_db.servicecatalog set serviceDescription = "Instalação e configuração de redes cabeada/wireless"
 where serviceId = 1;
 
 CREATE TABLE IF NOT EXISTS `abilify_db`.`ProviderCredentials` (
  `credentialId` INT NOT NULL AUTO_INCREMENT,
  `serviceProviderId` INT NOT NULL,
  `backgroundCheck` VARCHAR(45),
  `backgroundCheckDate` VARCHAR(45),
  `verifiedBusiness` VARCHAR(45),
  `businessName` VARCHAR(45),
  `businessAddress` VARCHAR(45),
  `certification1` VARCHAR(45),
  `certification2` VARCHAR(45),
  `certification3` VARCHAR(45),
  `faq1` VARCHAR(255),
  `faq2` VARCHAR(255),
  `faq3` VARCHAR(255),
  `faq4` VARCHAR(255),
  `faq5` VARCHAR(255),
  `faq6` VARCHAR(255),
  PRIMARY KEY (`credentialId`),
  FOREIGN KEY (`serviceProviderId`) REFERENCES ServiceProviders(`serviceProviderId`))
ENGINE = InnoDB
AUTO_INCREMENT = 1;