package com.MspIntegration.tests;

import com.MultiSafepay.client.MspClient;
import com.google.gson.JsonObject;

/**
 * GET - issuers
 * GET - issuers/{id}
 * @author Multisafepay.com
 */
public class GetIssuersTest {

	 public static void main(String[] args) {
	    	
	    	//Initialises MspClient
	    	MspClient.init(true);
	   
	    	JsonObject jsonResponse = MspClient.sendRequest("issuers/ideal");
	    	
	    	System.out.println("Response:");
	    	System.out.println(jsonResponse);
	    }
}
