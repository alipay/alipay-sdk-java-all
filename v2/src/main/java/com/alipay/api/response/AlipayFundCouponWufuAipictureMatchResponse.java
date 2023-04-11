package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.aipicture.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:36:43
 */
public class AlipayFundCouponWufuAipictureMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 2867713698669365952L;

	/** 
	 * 是否通过
	 */
	@ApiField("pass")
	private Boolean pass;

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

}
