package com.Ali.model;

import com.Ali.model.storing_donor_info.Donor_Registration;
import com.Ali.model.storing_donor_info.ListOfDonors;
import com.Ali.model.storing_recipient_registration.ListOfRecipient;
import com.Ali.model.storing_recipient_registration.RecipientRegistration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertingAndShowingData {

    public void InsertForDonor(Donor_Registration dr) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert donor id");
        dr.setId(Integer.parseInt(stdin.readLine()));
        System.out.println("Insert Donor First Name");
        dr.setDonorFirstName(stdin.readLine());
        System.out.println("Insert Donor Second Name");
        dr.setGetDonorSecondName(stdin.readLine());
        System.out.println("Insert Donor Gender");
        dr.setDonorGender(stdin.readLine());
        System.out.println("Insert Donor Age");
        dr.setDonorAge(Integer.parseInt(stdin.readLine()));
        System.out.println("Insert Donor Mobile Number");
        dr.setDonorMobileNumber(stdin.readLine());
        System.out.println("Insert Donor Blood Group");
        dr.setDonorBloodGroup(stdin.readLine());
        System.out.println("Insert Donor Email Address");
        dr.setDonorEmail(stdin.readLine());
        System.out.println("Insert Donor Address");
        dr.setDonorAddress(stdin.readLine());
        System.out.println("Insert Donor Password");
        dr.setDonorPassword(stdin.readLine());

    }




    public void InsertForRecipient(RecipientRegistration ur) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert Recipient id");
        ur.setId(Integer.parseInt(stdin.readLine()));

        System.out.println("Insert Recipient First Name");
        ur.setRecipientFirstName(stdin.readLine());
        System.out.println("Insert Recipient Second Name");
        ur.setRecipientSecondName(stdin.readLine());
        System.out.println("Insert Recipient Gender");
        ur.setRecipientGender(stdin.readLine());
        System.out.println("Insert Recipient Age");
        ur.setRecipientAge(Integer.parseInt(stdin.readLine()));
        System.out.println("Insert Recipient Mobile Number");
        ur.setRecipientMobileNumber(stdin.readLine());
        System.out.println("Insert Recipient Blood Group");
        ur.setRecipientBloodGroup(stdin.readLine());
        System.out.println("Insert Recipient Email Address");
        ur.setRecipientEmail(stdin.readLine());
        System.out.println("Insert Recipient Address");
        ur.setRecipientAddress(stdin.readLine());
        System.out.println("Insert Recipient Password");
        ur.setRecipientPassword(stdin.readLine());


    }

    public void ShowingDonorData(ListOfDonors listOfDonors){
        for (int index=0; index < listOfDonors.sizeOfDonorsList(); index++){

            System.out.println("Donor Information");
            System.out.println("ID:"+listOfDonors.getDonor(index).getId());
            System.out.println("First Name:"+listOfDonors.getDonor(index).getDonorFirstName());
            System.out.println("Second Name:"+listOfDonors.getDonor(index).getDonorSecondName());
            System.out.println("Gender:"+listOfDonors.getDonor(index).getDonorGender());
            System.out.println("Age:"+listOfDonors.getDonor(index).getDonorAge());
            System.out.println("Mobile Number:"+listOfDonors.getDonor(index).getDonorMobileNumber());
            System.out.println("Blood Group:"+listOfDonors.getDonor(index).getDonorBloodGroup());
            System.out.println("Email Address:"+listOfDonors.getDonor(index).getDonorEmail());
            System.out.println("Address:"+listOfDonors.getDonor(index).getDonorAddress());
            System.out.println("Password:"+listOfDonors.getDonor(index).getDonorPassword());
            System.out.println("********************");
        }
    }




    public void ShowingRecipientData(ListOfRecipient listOfRecipient){
        for (int index=0; index < listOfRecipient.sizeOfRecipientsList(); index++) {


            System.out.println("Recipient Information");
            System.out.println("ID:" + listOfRecipient.getRecipients(index).getId());
            System.out.println("First Name:"+listOfRecipient.getRecipients(index).getRecipientFirstName());
            System.out.println("Second Name:" + listOfRecipient.getRecipients(index).getRecipientSecondName());
            System.out.println("Gender:" + listOfRecipient.getRecipients(index).getRecipientGender());
            System.out.println("Age:" + listOfRecipient.getRecipients(index).getRecipientAge());
            System.out.println("Mobile Number:" + listOfRecipient.getRecipients(index).getRecipientMobileNumber());
            System.out.println("Blood Group:" + listOfRecipient.getRecipients(index).getRecipientBloodGroup());
            System.out.println("Email Address:" + listOfRecipient.getRecipients(index).getRecipientEmail());
            System.out.println("Address:" + listOfRecipient.getRecipients(index).getRecipientAddress());
            System.out.println("Password:" + listOfRecipient.getRecipients(index).getRecipientPassword());
            System.out.println("****************");

        }
}}
