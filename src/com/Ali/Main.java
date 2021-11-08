package com.Ali;

import com.Ali.model.InsertingAndShowingData;
import com.Ali.model.storing_donor_info.Donor_Registration;
import com.Ali.model.storing_donor_info.ListOfDonors;
import com.Ali.model.storing_recipient_registration.ListOfRecipient;
import com.Ali.model.storing_recipient_registration.RecipientRegistration;
import com.Ali.view.Interface;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public  static void main(String[]args) throws IOException {

        Interface viewController = new Interface();
        viewController.ui();
    }


}

