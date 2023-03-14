package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportshealth.account.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:41:44
 */
public class AlipayUserSportshealthAccountConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6469955713477434718L;

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
