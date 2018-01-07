package com.lambdarookie.myaktion.test;

import com.lambdarookie.myaktion.model.Account;
import com.lambdarookie.myaktion.model.Campaign;
import com.lambdarookie.myaktion.model.Donation;
import com.lambdarookie.myaktion.model.Donation.Status;

public class DataFactory {
  public static Campaign createTestCampaign() {
    Campaign campaign = new Campaign();
    campaign.setName("Trikots für A-Jugend");
    campaign.setTargetAmount(1000d);
    campaign.setDonationMinimum(20d);
    campaign.setAccount(new Account("Max Mustermann", "ABC Bank", "DE44123456780100200300"));
    return campaign;
  }

  public static Donation createDonation() {
    Donation donation = new Donation();
    donation.setDonorName("Heinz Schmidt");
    donation.setAmount(20d);
    donation.setReceiptRequested(true);
    donation.setStatus(Status.TRANSFERRED);
    donation.setAccount(new Account(donation.getDonorName(), "XXX Bank", "DE44876543210000123456"));
    return donation;
  }
}
