package com.Ali.model.storing_donor_info;

import java.util.ArrayList;

public class ListOfDonors {
    ArrayList<Donor_Registration> donors = new ArrayList<>();

   public  void addToDonors(Donor_Registration ob){
       donors.add(ob);

   }
   public int sizeOfDonorsList(){
       return donors.size();
   }
   public Donor_Registration getDonor(int i){
       return donors.get(i);
   }
}
