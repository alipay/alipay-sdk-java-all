package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:41
 */
public class AlipayOverseasTaxOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4634964636699928128L;

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
