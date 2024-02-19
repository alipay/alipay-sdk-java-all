package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycleetfrecord.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-05 10:41:57
 */
public class AlipayCommerceRecycleetfrecordStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5145231969147795581L;

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
