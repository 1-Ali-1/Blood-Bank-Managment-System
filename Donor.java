class Donor extends Person
{
    
    
   private String bloodBankName;
    private String  donorType;
    private String  donationDate;
    
    public Donor() {
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) 
    {
        this.bloodBankName = bloodBankName;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }
}