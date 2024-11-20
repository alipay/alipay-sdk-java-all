package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycleetfrecord.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-10 11:37:12
 */
public class AlipayCommerceRecycleetfrecordStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7666869241274535641L;

	/** 
	 * 申购结果
	 */
	@ApiField("apply_status")
	private String applyStatus;

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

}
