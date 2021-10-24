package com.Ali;
import java.io.Serializable;

public class RecipientRegistration implements Serializable {

    int id;
    String recipientFirstName;
    String recipientSecondName;
    String recipientGender ;
    int recipientAge ;
    String recipientMobileNumber;
    String recipientBloodGroup ;
    String recipientEmail ;
    String recipientAddress ;
    String recipientPassword ;

    void setId(int id){
        this.id=id;
    }

    int getId(){

        return id;
    }
    void setRecipientFirstName(String recipientFirstName){
        this.recipientFirstName =recipientFirstName;
    }
    void setRecipientSecondName(String recipientSecondName){
        this.recipientSecondName =recipientSecondName;
    }
    void setRecipientGender(String recipientGender){
        this.recipientGender=recipientGender;
    }
    void setRecipientAge(int recipientAge){
        this.recipientAge=recipientAge;
    }
    void setRecipientMobileNumber(String recipientMobileNumber){
        this.recipientMobileNumber=recipientMobileNumber;
    }
    void setRecipientBloodGroup(String recipientBloodGroup){
        this.recipientBloodGroup=recipientBloodGroup;
    }
    void setRecipientEmail(String recipientEmail){
        this.recipientEmail=recipientEmail;
    }
    void setRecipientAddress(String recipientAddress){
        this.recipientAddress=recipientAddress;
    }
    void setRecipientPassword(String recipientPassword){
        this.recipientPassword=recipientPassword;
    }

    String getRecipientFirstName(){

        return recipientFirstName;
    }
    String getRecipientSecondName(){

        return recipientSecondName;
    }

    String getRecipientGender(){

        return recipientGender;
    }

    int getRecipientAge(){

        return recipientAge;
    }

    String getRecipientMobileNumber(){

        return recipientMobileNumber;
    }

    String getRecipientBloodGroup(){

        return recipientBloodGroup;
    }

    String getRecipientEmail(){

        return recipientEmail;
    }

    String getRecipientAddress(){

        return recipientAddress;
    }

    String getRecipientPassword(){

        return recipientPassword;
    }
}
