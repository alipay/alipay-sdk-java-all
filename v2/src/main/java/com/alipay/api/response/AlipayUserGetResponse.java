package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayUserDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-04 14:59:15
 */
public class AlipayUserGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6834478379931451463L;

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
