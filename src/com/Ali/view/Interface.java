package com.Ali.view;

import com.Ali.Storage_From_File_To_Collection.ReadFromFile;
import com.Ali.Storage_From_File_To_Collection.WriteToFile;
import com.Ali.model.InsertingAndShowingData;
import com.Ali.model.storing_donor_info.Donor_Registration;
import com.Ali.model.storing_donor_info.ListOfDonors;
import com.Ali.model.storing_recipient_registration.ListOfRecipient;
import com.Ali.model.storing_recipient_registration.RecipientRegistration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Interface {


    public void ui(){
        ListOfDonors listOfDonors=new ListOfDonors();
        ListOfRecipient listOfRecipient=new ListOfRecipient();
        InsertingAndShowingData insertingAndShowingData=new InsertingAndShowingData();

        int i;

        try {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" * * * * * Welcome To Blood Bank * * * * *");
            System.out.println(" please choose with objective you want:");
            System.out.println(" enter (1) for registering new Donor");
            System.out.println(" enter (2) for registering new Recipient");
            System.out.println(" enter (3) for read Donor details");
            System.out.println(" enter (4) for read Recipient details ");
            System.out.println(" enter (0)  for exit the program");

            i=Integer.parseInt(stdin.readLine());

            while(i!=0){




                if(i==1){
                    Donor_Registration dr=new Donor_Registration();
                    insertingAndShowingData.InsertForDonor(dr);
                    // writing to file
                    WriteToFile writeToFile=new WriteToFile();
                    writeToFile.writeObjectToFile(dr,"Donor details.txt");

                    System.out.println("Done Registering !!");
                }

                else if(i==2){

                    RecipientRegistration ur=new RecipientRegistration();
                    insertingAndShowingData.InsertForRecipient(ur);

                    // writing to file
                    WriteToFile writeToFile=new WriteToFile();
                    writeToFile.writeObjectToFile(ur,"Recipient details.txt");

                    System.out.println("Done Registering !!");

                }


                else if(i==3){


                    try{ ReadFromFile readFromFile = new ReadFromFile();
                        readFromFile.readFromFileForDonor(listOfDonors);

                    }catch (Exception e){
                        System.out.println("there is no data ");
                    }
                    // read from file


                    //showing donor data
                    insertingAndShowingData.ShowingDonorData(listOfDonors);




                }

                else if(i==4){


                    // read from file

                    try{   ReadFromFile readFromFile=new ReadFromFile();
                        readFromFile.readFromFileForRecipient(listOfRecipient);


                    }catch (Exception e){
                        System.out.println("there is no data ");
                    }

                    //showing recipient data
                    insertingAndShowingData.ShowingRecipientData(listOfRecipient);

                }

                System.out.println("*********Welcome To Blood Bank***********");
                System.out.println(" enter (1) for registering new donor");
                System.out.println(" enter (2) for registering new Recipient");
                System.out.println(" enter (3) for read Donor");
                System.out.println(" enter (4) for read  Recipient");
                System.out.println(" enter (0) for exit the program");

                i=Integer.parseInt(stdin.readLine());

            }

        } catch (Exception ex) { System.out.println(ex.getMessage());}

    }


}
