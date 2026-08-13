package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.service.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-24 10:37:50
 */
public class AlipayCommerceOperationServiceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2262644618716693473L;

	/** 
	 * 序列化后的报名出参信息
	 */
	@ApiField("response_data")
	private String responseData;

	/** 
	 * 报名记录id
	 */
	@ApiField("submit_record_id")
	private String submitRecordId;

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	public String getResponseData( ) {
		return this.responseData;
	}

	public void setSubmitRecordId(String submitRecordId) {
		this.submitRecordId = submitRecordId;
	}
	public String getSubmitRecordId( ) {
		return this.submitRecordId;
	}

}
