package com.Ali.Storage_From_File_To_Collection;

import com.Ali.model.storing_donor_info.Donor_Registration;
import com.Ali.model.storing_donor_info.ListOfDonors;
import com.Ali.model.storing_recipient_registration.ListOfRecipient;
import com.Ali.model.storing_recipient_registration.RecipientRegistration;

import java.io.*;

public class ReadFromFile {

  
  public void readFromFileForDonor(ListOfDonors list) throws IOException {

      FileInputStream fi = new FileInputStream(new File("Donor details.txt"));
      ObjectInputStream oi = new ObjectInputStream(fi);

      try{   while (true){

          Donor_Registration dr1 = (Donor_Registration) oi.readObject();


          if (dr1 != null){

              list.addToDonors(dr1);

          }}}catch(Exception e){



          oi.close();
          fi.close();
      }
  }



    public void readFromFileForRecipient(ListOfRecipient list) throws IOException {

        FileInputStream fi = new FileInputStream(new File("Recipient details.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);

        try{   while (true){

            RecipientRegistration r = (RecipientRegistration) oi.readObject();


            if (r != null){
                list.addToRecipient(r);

            }}}catch(Exception e){



            oi.close();
            fi.close();
        }
    }
}
