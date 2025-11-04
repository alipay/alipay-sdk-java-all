package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:56
 */
public class AlipayOverseasTaxOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7199314517627227559L;

	/** 
	 * 支付宝的退税流水号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getTaxNo( ) {
		return this.taxNo;
	}

}
