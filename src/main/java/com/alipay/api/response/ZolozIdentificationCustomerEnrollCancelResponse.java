package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.enroll.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-18 16:10:50
 */
public class ZolozIdentificationCustomerEnrollCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5876732559931635569L;

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
