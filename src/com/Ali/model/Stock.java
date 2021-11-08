package com.Ali.model;

import com.Ali.model.storing_donor_info.Donor_Registration;
import com.Ali.model.storing_donor_info.ListOfDonors;
import com.Ali.model.storing_recipient_registration.ListOfRecipient;

import java.util.*;

public class Stock {
    Map<String,Integer> map = new HashMap<String,Integer>();





    public void getDonorBloodLiters() {

        for (int i=0; i<ListOfDonors.sizeOfDonorsList(); i++) {


            if (  map.containsKey(ListOfDonors.donors.get(i).getDonorBloodGroup())){

                map.put(ListOfDonors.donors.get(i).getDonorBloodGroup(), map.get(ListOfDonors.donors.get(i).getDonorBloodGroup()) +1 );
            }else{

                map.put(ListOfDonors.donors.get(i).getDonorBloodGroup(), 1);
            }
        }
        for (int i=0; i<map.size(); i++){


            System.out.println(map.keySet().toArray()[i].toString().toUpperCase(Locale.ROOT) + " : " + map.get(map.keySet().toArray()[i]) + " liter");

        }


    }
    public boolean isMapEmpty(){
        return map.isEmpty();
    }
}
