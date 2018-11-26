package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.enrollcertify.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-03 16:50:00
 */
public class ZolozIdentificationCustomerEnrollcertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3651783768839942439L;

	/** 
	 * 业务单据号，用于核对和排查
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
