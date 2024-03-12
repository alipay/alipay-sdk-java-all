package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.aipicture.match response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:05
 */
public class AlipayFundCouponWufuAipictureMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3399729725853482532L;

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
