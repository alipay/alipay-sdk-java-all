package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.codecount response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 16:07:14
 */
public class AlipayMarketingActivityOrdervoucherCodecountResponse extends AlipayResponse {

	private static final long serialVersionUID = 4181583998119773844L;

	/** 
	 * 已经导入的券码数量
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
