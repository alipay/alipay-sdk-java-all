package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.account.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 17:27:33
 */
public class AlipayMarketingBenefitaccountAccountPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2364992254225853678L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 拉起pc端收银台链接
	 */
	@ApiField("pc_payment_url")
	private String pcPaymentUrl;

	/** 
	 * 充值订单号
	 */
	@ApiField("recharge_no")
	private String rechargeNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setPcPaymentUrl(String pcPaymentUrl) {
		this.pcPaymentUrl = pcPaymentUrl;
	}
	public String getPcPaymentUrl( ) {
		return this.pcPaymentUrl;
	}

	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}
	public String getRechargeNo( ) {
		return this.rechargeNo;
	}

}
