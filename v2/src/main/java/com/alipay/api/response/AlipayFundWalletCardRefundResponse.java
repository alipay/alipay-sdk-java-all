package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.card.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:11:46
 */
public class AlipayFundWalletCardRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5792962476954278552L;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
