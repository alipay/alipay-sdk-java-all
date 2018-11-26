package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.shop.license.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-14 16:05:00
 */
public class KoubeiServindustryShopLicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1321899861194969183L;

	/** 
	 * 有一家shop有营业执照：true
所有shop无营业执照：false
	 */
	@ApiField("have_permit")
	private Boolean havePermit;

	public void setHavePermit(Boolean havePermit) {
		this.havePermit = havePermit;
	}
	public Boolean getHavePermit( ) {
		return this.havePermit;
	}

}
