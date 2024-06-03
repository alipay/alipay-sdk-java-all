package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportshealth.account.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:33
 */
public class AlipayUserSportshealthAccountFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6282889387648368722L;

	/** 
	 * 运动币账户支付流水号,运动侧作为事务id
	 */
	@ApiField("pay_order_no")
	private String payOrderNo;

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getPayOrderNo( ) {
		return this.payOrderNo;
	}

}
