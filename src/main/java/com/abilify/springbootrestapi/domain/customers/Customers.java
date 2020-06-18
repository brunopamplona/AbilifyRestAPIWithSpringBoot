package com.abilify.springbootrestapi.domain.customers;

import java.io.Serializable;

public class Customers implements Serializable {

    private  long customerId;
    private  String firstName;
    private  String userName;
    private  String lastName;
    private  String passWord;
    private  String photoId;
    private  String cpf;
    private  String cnpj;
    private  String email;
    private  String cellPhone;

    public Customers(long customerId, String firstName, String userName, String lastName, String passWord, String photoId, String professionDescription, String cpf, String cnpj, String email, String cellPhone) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.userName = userName;
        this.lastName = lastName;
        this.passWord = passWord;
        this.photoId = photoId;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.email = email;
        this.cellPhone = cellPhone;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
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
}
