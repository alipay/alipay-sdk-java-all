package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.aipicture.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:36:56
 */
public class AlipayFundCouponWufuAipictureMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1271574754387944664L;

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
