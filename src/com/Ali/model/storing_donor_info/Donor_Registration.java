package com.Ali.model.storing_donor_info;
import java.io.Serializable;


public class Donor_Registration implements Serializable {
    static int id;
    String donorFirstName ;
    String getDonorSecondName;
    String donorGender ;
    int donorAge ;
    String donorMobileNumber;
    String donorBloodGroup ;
    String donorEmail ;
    String donorAddress ;
    String donorPassword ;





    public void setDonorFirstName(String donorFirstName){  this.donorFirstName=donorFirstName; }
    public void setGetDonorSecondName(String donorSecondName){
        this.getDonorSecondName=donorSecondName;
    }
    public void setDonorGender(String donorGender){
        this.donorGender=donorGender;
    }
    public void setDonorAge(int donorAge){
        this.donorAge=donorAge;
    }
    public void setDonorMobileNumber(String donorMobileNumber){
        this.donorMobileNumber=donorMobileNumber;
    }
    public void setDonorBloodGroup(String donorBloodGroup){
        this.donorBloodGroup=donorBloodGroup;
    }
    public void setDonorEmail(String donorEmail){
        this.donorEmail=donorEmail;
    }
    public void setDonorAddress(String donorAddress){
        this.donorAddress=donorAddress;
    }
    public void setDonorPassword(String donorPassword){
        this.donorPassword=donorPassword;
    }
    public void setId(int id){
        this.id=id;
    }



    public int getId(){

        return id;
    }
    public String getDonorFirstName(){

        return donorFirstName;
    }
    public String getDonorSecondName() {

        return getDonorSecondName;
    }

    public String getDonorGender(){

        return donorGender;
    }

    public int getDonorAge(){

        return donorAge;
    }

    public String getDonorMobileNumber(){

        return donorMobileNumber;
    }

    public String getDonorBloodGroup(){

        return donorBloodGroup;
    }

    public String getDonorEmail(){

        return donorEmail;
    }

    public String getDonorAddress(){

        return donorAddress;
    }

    public String getDonorPassword(){

        return donorPassword;
    }
}
