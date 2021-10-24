package com.Ali;
import java.io.Serializable;


public class Donor_Registration implements Serializable {
    int id;
    String donorFirstName ;
    String getDonorSecondName;
    String donorGender ;
    int donorAge ;
    String donorMobileNumber;
    String donorBloodGroup ;
    String donorEmail ;
    String donorAddress ;
    String donorPassword ;





    void setDonorFirstName(String donorFirstName){  this.donorFirstName=donorFirstName; }
    void setGetDonorSecondName(String donorSecondName){
        this.getDonorSecondName=donorSecondName;
    }
    void setDonorGender(String donorGender){
        this.donorGender=donorGender;
    }
    void setDonorAge(int donorAge){
        this.donorAge=donorAge;
    }
    void setDonorMobileNumber(String donorMobileNumber){
        this.donorMobileNumber=donorMobileNumber;
    }
    void setDonorBloodGroup(String donorBloodGroup){
        this.donorBloodGroup=donorBloodGroup;
    }
    void setDonorEmail(String donorEmail){
        this.donorEmail=donorEmail;
    }
    void setDonorAddress(String donorAddress){
        this.donorAddress=donorAddress;
    }
    void setDonorPassword(String donorPassword){
        this.donorPassword=donorPassword;
    }
    void setId(int id){
        this.id=id;
    }



    int getId(){

        return id;
    }
    String getDonorFirstName(){

        return donorFirstName;
    }
    String getDonorSecondName() {

        return getDonorSecondName;
    }

    String getDonorGender(){

        return donorGender;
    }

    int getDonorAge(){

        return donorAge;
    }

    String getDonorMobileNumber(){

        return donorMobileNumber;
    }

    String getDonorBloodGroup(){

        return donorBloodGroup;
    }

    String getDonorEmail(){

        return donorEmail;
    }

    String getDonorAddress(){

        return donorAddress;
    }

    String getDonorPassword(){

        return donorPassword;
    }
}
