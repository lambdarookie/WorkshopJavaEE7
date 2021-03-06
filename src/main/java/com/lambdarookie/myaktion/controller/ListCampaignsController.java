package com.lambdarookie.myaktion.controller;

import com.lambdarookie.myaktion.data.CampaignProducer;
import com.lambdarookie.myaktion.model.Campaign;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SessionScoped
@Named
public class ListCampaignsController implements Serializable {
  private static final long serialVersionUID = 8693277383648025822L;

  @Inject
  private CampaignProducer campaignProducer;
  private Campaign campaignToDelete;

  public String doAddCampaign() {
    this.campaignProducer.prepareAddCampaign();
    return Pages.EDIT_CAMPAIGN;
  }

  public String doEditCampaign(Campaign campaign) {
    this.campaignProducer.prepareEditCampaign(campaign);
    return Pages.EDIT_CAMPAIGN;
  }

  public String doEditDonationForm(Campaign campaign) {
    this.campaignProducer.setSelectedCampaign(campaign);
    return Pages.EDIT_DONATION_FORM;
  }

  public String doListDonations(Campaign campaign) {
    this.campaignProducer.setSelectedCampaign(campaign);
    return Pages.LIST_DONATIONS;
  }

  public void doDeleteCampaign(Campaign campaign) {
    this.campaignToDelete = campaign;
    System.out.println("Campaign is booked to be deleted.");
  }

  public void commitDeleteCampaign() {
    System.out.println("Campaign deletion is not implemented yet.");
  }
}
