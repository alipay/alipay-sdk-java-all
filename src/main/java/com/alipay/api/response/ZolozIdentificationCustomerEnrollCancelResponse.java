package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.enroll.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-18 15:35:56
 */
public class ZolozIdentificationCustomerEnrollCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2636357695478222463L;

	/** 
	 * 与入参值保持一致
	 */
	@ApiField("biz_id")
	private String bizId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

}
