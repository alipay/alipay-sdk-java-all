package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-18 14:32:40
 */
public class AlipayCommerceEcRecyclinginvoiceItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5229624147187944629L;

	/** 
	 * 商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	/** 
	 * 外部商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public void setCompanyItemId(String companyItemId) {
		this.companyItemId = companyItemId;
	}
	public String getCompanyItemId( ) {
		return this.companyItemId;
	}

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}
	public String getOutItemId( ) {
		return this.outItemId;
	}

}
