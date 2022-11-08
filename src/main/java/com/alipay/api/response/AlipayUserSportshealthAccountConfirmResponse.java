package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportshealth.account.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-24 15:11:49
 */
public class AlipayUserSportshealthAccountConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8269227463172273347L;

	/** 
	 * 运动币账户支付流水号
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
