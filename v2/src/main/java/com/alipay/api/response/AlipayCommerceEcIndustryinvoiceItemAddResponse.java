package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.industryinvoice.item.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-19 19:02:39
 */
public class AlipayCommerceEcIndustryinvoiceItemAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6891616855869856232L;

	/** 
	 * 企业商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	public void setCompanyItemId(String companyItemId) {
		this.companyItemId = companyItemId;
	}
	public String getCompanyItemId( ) {
		return this.companyItemId;
	}

}
