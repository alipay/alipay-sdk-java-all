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

	private static final long serialVersionUID = 6887768285598742864L;

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
