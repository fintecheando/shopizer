package com.salesmanager.core.model.payments;

/**
 * When the user performs a payment using Codi Payments
 * @author Victor Romero
 *
 */
public class CodiPayment extends Payment {
	
    private String mobileNumber;

    public String getMobileNumber() {
            return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
    }	

}
