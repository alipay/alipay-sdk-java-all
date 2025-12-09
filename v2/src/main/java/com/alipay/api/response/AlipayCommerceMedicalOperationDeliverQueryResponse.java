package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.operation.deliver.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 15:52:41
 */
public class AlipayCommerceMedicalOperationDeliverQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3374323638838816628L;

	/** 
	 * 模版的投放内容
	 */
	@ApiField("content_info")
	private String contentInfo;

	public void setContentInfo(String contentInfo) {
		this.contentInfo = contentInfo;
	}
	public String getContentInfo( ) {
		return this.contentInfo;
	}

}
