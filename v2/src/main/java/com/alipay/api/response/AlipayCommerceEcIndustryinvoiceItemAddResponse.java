package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.industryinvoice.item.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 14:30:01
 */
public class AlipayCommerceEcIndustryinvoiceItemAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2814679579155327764L;

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
