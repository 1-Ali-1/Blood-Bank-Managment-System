package com.Ali.model.storing_recipient_registration;

import com.Ali.model.storing_donor_info.Donor_Registration;

import java.util.ArrayList;

public class ListOfRecipient {

    static ArrayList<RecipientRegistration> recipients = new ArrayList<>();

    public void addToRecipient(RecipientRegistration ob){
        recipients.add(ob);

    }
    public static void deleteRecipient(int id){
        recipients.removeIf(e -> e.getId() == id);
    }

    public int sizeOfRecipientsList(){
        return recipients.size();
    }
    public RecipientRegistration getRecipients(int i){
        return recipients.get(i);
    }
}
