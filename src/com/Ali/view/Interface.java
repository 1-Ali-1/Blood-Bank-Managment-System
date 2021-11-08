package com.Ali.view;


import com.Ali.model.InsertingAndShowingData;
import com.Ali.model.Stock;
import com.Ali.model.storing_donor_info.Donor_Registration;
import com.Ali.model.storing_donor_info.ListOfDonors;
import com.Ali.model.storing_recipient_registration.ListOfRecipient;
import com.Ali.model.storing_recipient_registration.RecipientRegistration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Interface {


    public void ui() throws IOException {
        ListOfDonors listOfDonors=new ListOfDonors();
        ListOfRecipient listOfRecipient=new ListOfRecipient();
        InsertingAndShowingData insertingAndShowingData=new InsertingAndShowingData();
        Stock stock=new Stock();

        Optional<Integer> i;

            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("");
            System.out.println("* * * * * * Welcome To Blood Bank * * * * * * * * * * * * ");

            System.out.println("* please choose with objective you want:                *");
            System.out.println("* enter (1) for registering new Donor                   *");
            System.out.println("* enter (2) for registering new Recipient               *");
            System.out.println("* enter (3) for Reading info About Donor and Recipient  *");
            System.out.println("* enter (4) for deleting Donor and Recipient            *");
            System.out.println("* enter (5) for showing blood groups                    *");
            System.out.println("* enter (0)  for exit the program                       *");
            System.out.println("*                                                       *");
            System.out.println("* * * * * 👨‍🎓 Made By Group A students 👨‍🎓 * * * * * * *");

        String temp = stdin.readLine();
            i= Optional.of(Integer.parseInt(temp.matches("^[a-zA-Z]*$") ?  "404" : temp ));

            while(i.get() != 0 ){
            if(i.get() == 404){
                System.out.println("please type a number among the objectives");
               i= Optional.of(0);
            }



                if(i.isPresent() && i.get() == 1){
                    Donor_Registration dr=new Donor_Registration();
                    insertingAndShowingData.InsertForDonor(dr);

                    listOfDonors.addToDonors(dr);


                    System.out.println("Done Registering !!");
                }

                else if(i.isPresent() && i.get() == 2){

                    RecipientRegistration ur=new RecipientRegistration();
                    insertingAndShowingData.InsertForRecipient(ur);

                    // writing to file
                   listOfRecipient.addToRecipient(ur);

                    System.out.println("Done Registering !!");

                }


                else if(i.isPresent() && i.get() == 3){


                    System.out.println(" enter (1) for knowing donor info");
                    System.out.println(" enter (2) for knowing recipient info");
                    BufferedReader oneORtwo = new BufferedReader(new InputStreamReader(System.in));
                    String choice = oneORtwo.readLine();
                    if(Integer.parseInt(choice) == 1){
                        insertingAndShowingData.ShowingDonorData(listOfDonors);
                    }
                    else {
                        insertingAndShowingData.ShowingRecipientData(listOfRecipient);
                    }



                }

                else if(i.isPresent() && i.get() == 4){


                    System.out.println(" enter (1) for deleting donor with a specific ID");
                    System.out.println(" enter (2) for deleting recipient with a specific ID");
                    BufferedReader idbuffer = new BufferedReader(new InputStreamReader(System.in));
                    String idChoice = idbuffer.readLine();
                    if(Integer.parseInt(idChoice) == 1){
                        BufferedReader idb = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("enter id");
                        String realID = idb.readLine();
                        ListOfDonors.deleteDonor(Integer.parseInt(realID));
                        System.out.println("successfully deleted");

                    }
                    else {
                        BufferedReader idb = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("enter id");
                        String realID = idb.readLine();
                        ListOfRecipient.deleteRecipient(Integer.parseInt(realID));
                        System.out.println("successfully deleted");

                    }



                }


                else if(i.isPresent() && i.get() == 5){

                    if (stock.isMapEmpty()){
                        System.out.println("Empty");
                    } else{
                        stock.getDonorBloodLiters();
                    }



                }

                System.out.println("");
                System.out.println("* * * * * * Welcome To Blood Bank * * * * * * * * * * * * ");

                System.out.println("* please choose with objective you want:                *");
                System.out.println("* enter (1) for registering new Donor                   *");
                System.out.println("* enter (2) for registering new Recipient               *");
                System.out.println("* enter (3) for Reading info About Donor and Recipient  *");
                System.out.println("* enter (4) for deleting Donor and Recipient            *");
                System.out.println("* enter (5) for showing blood groups                    *");
                System.out.println("* enter (0)  for exit the program                       *");
                System.out.println("*                                                       *");
                System.out.println("* * * * * 👨‍🎓 Made By Group A students 👨‍🎓 * * * * * * *");


                String temp2=stdin.readLine();
                i= Optional.of(Integer.parseInt(temp2.matches("^[a-zA-Z]*$") ?  "404" : temp2 ));
                if(i.get() == 404){
                    System.out.println("please type a number among the objectives");
                }

            }



    }


}
