package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.service.coupon.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:01
 */
public class AlipayInsAutoServiceCouponVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6165119455136622522L;

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
