package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.industryinvoice.item.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 11:07:41
 */
public class AlipayCommerceEcIndustryinvoiceItemAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4339279951846891155L;

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
