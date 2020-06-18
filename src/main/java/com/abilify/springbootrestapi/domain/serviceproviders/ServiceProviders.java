package com.abilify.springbootrestapi.domain.serviceproviders;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="serviceproviders")
public class ServiceProviders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "serviceproviderid")
    private  long serviceProviderId;

    @Column(name = "firstname", nullable = false)
    private  String firstName;

    @Column(name = "username", nullable = false)
    private  String userName;

    @Column(name = "lastname", nullable = false)
    private  String lastName;

    @Column(name = "password", nullable = false)
    private  String passWord;

    @Column(name = "photoid", nullable = false)
    private  String photoId;

    @Column(name = "professionaldescription", nullable = false)
    private  String professionalDescription;

    @Column(name = "cpf", nullable = false)
    private  String cpf;

    @Column(name = "cnpj", nullable = false)
    private  String cnpj;

    @Column(name = "email", nullable = false)
    private  String email;

    @Column(name = "cellphone", nullable = false)
    private  String cellPhone;

    @Column(name = "cityid", nullable = false)
    private  String city;

    public ServiceProviders()
    {
        super();
    }

    public ServiceProviders(long serviceProviderId, String firstName, String userName, String lastName, String passWord, String photoId, String professionalDescription, String cpf, String cnpj, String email, String cellPhone, String city) {
        this.serviceProviderId = serviceProviderId;
        this.firstName = firstName;
        this.userName = userName;
        this.lastName = lastName;
        this.passWord = passWord;
        this.photoId = photoId;
        this.professionalDescription = professionalDescription;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.email = email;
        this.cellPhone = cellPhone;
        this.city = city;
    }

    public long getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(long serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getProfessionDescription() { return professionalDescription; }

    public void setProfessionDescription(String professionalDescription) {
        this.professionalDescription = professionalDescription;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

}
