package com.Ali.model.storing_donor_info;

import java.util.ArrayList;

public class ListOfDonors {
   public static ArrayList<Donor_Registration> donors = new ArrayList<>();

   public static void addToDonors(Donor_Registration ob){
       donors.add(ob);
       System.out.println(donors.size());

   }
    public static void deleteDonor(int id){
        donors.removeIf(e -> e.getId() == id);
    }

    public  static int sizeOfDonorsList(){
       return donors.size();
   }
   public static Donor_Registration getDonor(int i){
       return donors.get(i);
   }
}
