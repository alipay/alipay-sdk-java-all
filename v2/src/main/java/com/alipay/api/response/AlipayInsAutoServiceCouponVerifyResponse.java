package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.service.coupon.verify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-16 15:31:41
 */
public class AlipayInsAutoServiceCouponVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5188236633155249145L;

	/** 
	 * 核销同步结果，返回成功或失败。
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
