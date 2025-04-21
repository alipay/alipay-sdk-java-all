package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.coupons.take response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 10:32:02
 */
public class AlipayCloudCloudbaseCouponsTakeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5882733137222374274L;

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
