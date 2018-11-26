package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cert.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-17 14:15:23
 */
public class AlipayMarketingCampaignCertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7298123876858413555L;

	/** 
	 * 凭证id
	 */
	@ApiField("lot_number")
	private String lotNumber;

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}
	public String getLotNumber( ) {
		return this.lotNumber;
	}

}
