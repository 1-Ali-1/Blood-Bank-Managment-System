package com.Ali;

import com.Ali.Storage_From_File_To_Collection.ReadFromFile;
import com.Ali.model.InsertingAndShowingData;
import com.Ali.model.storing_donor_info.Donor_Registration;
import com.Ali.model.storing_donor_info.ListOfDonors;
import com.Ali.model.storing_recipient_registration.ListOfRecipient;
import com.Ali.model.storing_recipient_registration.RecipientRegistration;
import com.Ali.Storage_From_File_To_Collection.WriteToFile;
import com.Ali.view.Interface;

import java.io.BufferedReader;

import java.io.InputStreamReader;



public class Main {

    public  static void main(String[]args){

        Interface viewController = new Interface();
        viewController.ui();
    }


}