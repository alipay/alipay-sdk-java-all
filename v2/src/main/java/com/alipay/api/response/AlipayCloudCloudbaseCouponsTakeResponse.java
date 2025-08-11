package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.coupons.take response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:12:12
 */
public class AlipayCloudCloudbaseCouponsTakeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1833532388984187616L;

	/** 
	 * 领券是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
