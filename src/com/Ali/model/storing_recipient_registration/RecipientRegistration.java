package com.Ali.model.storing_recipient_registration;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class RecipientRegistration implements Serializable {

    private Integer id;
    String recipientFirstName;
    String recipientSecondName;
    String recipientGender ;
    int recipientAge ;
    String recipientMobileNumber;
    String recipientBloodGroup ;
    String recipientEmail ;
    String recipientAddress ;
    String recipientPassword ;



    private static final AtomicInteger idGenerator = new AtomicInteger(1);
    public void uniqueID() {
        //assign unique id to an instance variable
        id = idGenerator.getAndIncrement();
    }


    public int getId(){

        return id;
    }
    public void setRecipientFirstName(String recipientFirstName){
        this.recipientFirstName =recipientFirstName;
    }
    public void setRecipientSecondName(String recipientSecondName){
        this.recipientSecondName =recipientSecondName;
    }
    public void setRecipientGender(String recipientGender){
        this.recipientGender=recipientGender;
    }

    public void setRecipientAge(int recipientAge){
        this.recipientAge=recipientAge;
    }
    public void setRecipientMobileNumber(String recipientMobileNumber){
        this.recipientMobileNumber=recipientMobileNumber;
    }
    public void setRecipientBloodGroup(String recipientBloodGroup){
        this.recipientBloodGroup=recipientBloodGroup;
    }
    public void setRecipientEmail(String recipientEmail){
        this.recipientEmail=recipientEmail;
    }
    public void setRecipientAddress(String recipientAddress){
        this.recipientAddress=recipientAddress;
    }
    public void setRecipientPassword(String recipientPassword){
        this.recipientPassword=recipientPassword;
    }

    public String getRecipientFirstName(){

        return recipientFirstName;
    }
    public String getRecipientSecondName(){

        return recipientSecondName;
    }

    public String getRecipientGender(){

        return recipientGender;
    }

    public int getRecipientAge(){

        return recipientAge;
    }

    public String getRecipientMobileNumber(){

        return recipientMobileNumber;
    }

    public String getRecipientBloodGroup(){

        return recipientBloodGroup;
    }

    public String getRecipientEmail(){

        return recipientEmail;
    }

    public String getRecipientAddress(){

        return recipientAddress;
    }

    public String getRecipientPassword(){

        return recipientPassword;
    }
}
