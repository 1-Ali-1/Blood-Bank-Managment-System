package com.Ali;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Main {

    public  static void main(String[]args){

        ArrayList<Donor_Registration> donors = new ArrayList<>();
        ArrayList<RecipientRegistration> recipients = new ArrayList<>();

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


                    FileOutputStream f = new FileOutputStream(new File("Donor details.txt"));
                    ObjectOutputStream o = new ObjectOutputStream(f);
                    o.writeObject(dr);
                    o.close();
                    f.close();
                    System.out.println("Done Registering !!");
                }
                else if(i==2){

                    RecipientRegistration ur=new RecipientRegistration();
                    System.out.println("Insert donor id");
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


                    FileOutputStream f1 = new FileOutputStream(new File("Recipient details.txt"));
                    ObjectOutputStream o1 = new ObjectOutputStream(f1);
                    o1.writeObject(ur);
                    o1.close();
                    f1.close();
                    System.out.println("Done Registering !!");

                }
                else if(i==3){
                    FileInputStream fi = new FileInputStream(new File("Donor details.txt"));
                    ObjectInputStream oi = new ObjectInputStream(fi);


                    try{   while (true){

                        Donor_Registration dr1 = (Donor_Registration) oi.readObject();


                        if (dr1 != null){
                            donors.add(dr1);

                        }}}catch(Exception e){
                        for (int index=0; index < donors.size(); index++){

                            System.out.println("Donor Information");
                            System.out.println("ID:"+donors.get(index).getId());
                            System.out.println("First Name:"+donors.get(index).getDonorFirstName());
                            System.out.println("Second Name:"+donors.get(index).getDonorSecondName());
                            System.out.println("Gender:"+donors.get(index).getDonorGender());
                            System.out.println("Age:"+donors.get(index).getDonorAge());
                            System.out.println("Mobile Number:"+donors.get(index).getDonorMobileNumber());
                            System.out.println("Blood Group:"+donors.get(index).getDonorBloodGroup());
                            System.out.println("Email Address:"+donors.get(index).getDonorEmail());
                            System.out.println("Address:"+donors.get(index).getDonorAddress());
                            System.out.println("Password:"+donors.get(index).getDonorPassword());
                            System.out.println("********************");
                        }


                        oi.close();
                        fi.close();
                    }




                }

                else if(i==4){
                    FileInputStream fi1 = new FileInputStream(new File("Recipient details.txt"));
                    ObjectInputStream oi1 = new ObjectInputStream(fi1);

                    try {
                        while (true){

                            RecipientRegistration r = (RecipientRegistration) oi1.readObject();


                            if (r != null){
                                recipients.add(r);

                            }}
                    }catch (Exception e){
                        for (int index=0; index < recipients.size(); index++) {


                            System.out.println("Recipient Information");
                            System.out.println("ID:" + recipients.get(index).getId());
                            System.out.println("First Name:"+recipients.get(index).getRecipientFirstName());
                            System.out.println("Second Name:" + recipients.get(index).getRecipientSecondName());
                            System.out.println("Gender:" + recipients.get(index).getRecipientGender());
                            System.out.println("Age:" + recipients.get(index).getRecipientAge());
                            System.out.println("Mobile Number:" + recipients.get(index).getRecipientMobileNumber());
                            System.out.println("Blood Group:" + recipients.get(index).getRecipientBloodGroup());
                            System.out.println("Email Address:" + recipients.get(index).getRecipientEmail());
                            System.out.println("Address:" + recipients.get(index).getRecipientAddress());
                            System.out.println("Password:" + recipients.get(index).getRecipientPassword());
                            System.out.println("****************");



                        }
                        oi1.close();
                        fi1.close();
                    }


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