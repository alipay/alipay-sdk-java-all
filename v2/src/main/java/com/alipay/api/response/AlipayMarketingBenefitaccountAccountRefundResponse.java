package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.account.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-30 14:07:28
 */
public class AlipayMarketingBenefitaccountAccountRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7434792435598827481L;

	/** 
	 * 总退款金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 退款操作单号，可用于幂等
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
