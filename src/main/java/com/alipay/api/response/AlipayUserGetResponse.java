package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayUserDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-22 16:11:55
 */
public class AlipayUserGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2115398116517671124L;

	/** 
	 * 支付宝用户信息
	 */
	@ApiField("alipay_user_detail")
	private AlipayUserDetail alipayUserDetail;

	public void setAlipayUserDetail(AlipayUserDetail alipayUserDetail) {
		this.alipayUserDetail = alipayUserDetail;
	}
	public AlipayUserDetail getAlipayUserDetail( ) {
		return this.alipayUserDetail;
	}

}
