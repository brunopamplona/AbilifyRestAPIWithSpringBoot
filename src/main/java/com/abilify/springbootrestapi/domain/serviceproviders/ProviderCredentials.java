package com.abilify.springbootrestapi.domain.serviceproviders;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="providercredentials")

public class ProviderCredentials implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "credentialid")
        private long credentialId;

        @Column(name = "serviceproviderid")
        private long serviceProviderId;

        @Column(name = "backgroundcheck")
        private String backgroundCheck;

        @Column(name = "backgroundcheckdate")
        private String backgroundCheckDate;

        @Column(name = "verifiedbusiness")
        private String verifiedBusiness;

        @Column(name = "businessname")
        private String businessName;

        @Column(name = "businessaddress")
        private String businessAddress;

        @Column(name = "certification1")
        private String certification1;

        @Column(name = "certification2")
        private String certification2;

        @Column(name = "certification3")
        private String certification3;

        @Column(name = "faq1")
        private String faq1;

        @Column(name = "faq2")
        private String faq2;

        @Column(name = "faq3")
        private String faq3;

        @Column(name = "faq4")
        private String faq4;

        @Column(name = "faq5")
        private String faq5;

        @Column(name = "faq6")
        private String faq6;

        public ProviderCredentials()
        {
                super();
        }

        public ProviderCredentials(long credentialId, long serviceProviderId, String backgroundCheck, String backgroundCheckDate,
                                   String verifiedBusiness, String businessName, String businessAddress, String certification1,
                                   String certification2, String certification3, String faq1,
                                   String faq2, String faq3, String faq4,
                                   String faq5, String faq6) {
                this.serviceProviderId = serviceProviderId;
                this.credentialId = credentialId;
                this.backgroundCheck = backgroundCheck;
                this.backgroundCheckDate = backgroundCheckDate;
                this.verifiedBusiness = verifiedBusiness;
                this.businessName = businessName;
                this.businessAddress = businessAddress;
                this.certification1 = certification1;
                this.certification2 = certification2;
                this.certification3 = certification3;
                this.faq1 = faq1;
                this.faq2 = faq2;
                this.faq3 = faq3;
                this.faq4 = faq4;
                this.faq5 = faq5;
                this.faq6 = faq6;
        }

        public long getServiceProviderId() {
                return serviceProviderId;
        }

        public void setServiceProviderId(long serviceProviderId) {
                this.serviceProviderId = serviceProviderId;
        }

        public long getCredentialId() {
                return credentialId;
        }

        public void setCredentialIdd(long credentialIdId) {
                this.credentialId = credentialId;
        }

        public void setCredentialId(long credentialId) {
                this.credentialId = credentialId;
        }

        public String getBackgroundCheck() {
                return backgroundCheck;
        }

        public void setBackgroundCheck(String backgroundCheck) {
                this.backgroundCheck = backgroundCheck;
        }

        public String getBackgroundCheckDate() {
                return backgroundCheckDate;
        }

        public void setBackgroundCheckDate(String backgroundCheckDate) {
                this.backgroundCheckDate = backgroundCheckDate;
        }

        public String getVerifiedBusiness() {
                return verifiedBusiness;
        }

        public void setVerifiedBusiness(String verifiedBusiness) {
                this.verifiedBusiness = verifiedBusiness;
        }

        public String getBusinessName() {
                return businessName;
        }

        public void setBusinessName(String businessName) {
                this.businessName = businessName;
        }

        public String getBusinessAddress() {
                return businessAddress;
        }

        public void setBusinessAddress(String businessAddress) {
                this.businessAddress = businessAddress;
        }

        public String getCertification1() {
                return certification1;
        }

        public void setCertification1(String certification1) {
                this.certification1 = certification1;
        }

        public String getCertification2() {
                return certification2;
        }

        public void setCertification2(String certification2) {
                this.certification2 = certification2;
        }

        public String getCertification3() {
                return certification3;
        }

        public void setCertification3(String certification3) {
                this.certification3 = certification3;
        }

        public String getFaq1() {
                return faq1;
        }

        public void setFaq1(String faq1) {
                this.faq1 = faq1;
        }

        public String getFaq2() {
                return faq2;
        }

        public void setFaq2(String faq2) {
                this.faq2 = faq2;
        }

        public String getFaq3() {
                return faq3;
        }

        public void setFaq3(String faq3) {
                this.faq3 = faq3;
        }

        public String getFaq4() {
                return faq4;
        }

        public void setFaq4(String faq4) {
                this.faq4 = faq4;
        }

        public String getFaq5() {
                return faq5;
        }

        public void setFaq5(String faq5) {
                this.faq5 = faq5;
        }

        public String getFaq6() {
                return faq6;
        }

        public void setFaq6(String faq6) {
                this.faq6 = faq6;
        }
}