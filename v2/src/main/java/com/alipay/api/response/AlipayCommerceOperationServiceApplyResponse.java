package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.service.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-20 11:12:45
 */
public class AlipayCommerceOperationServiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5179774987842497523L;

	/** 
	 * 报名记录id
	 */
	@ApiField("apply_record_id")
	private String applyRecordId;

	/** 
	 * 序列化后的报名出参信息
	 */
	@ApiField("response_data")
	private String responseData;

	public void setApplyRecordId(String applyRecordId) {
		this.applyRecordId = applyRecordId;
	}
	public String getApplyRecordId( ) {
		return this.applyRecordId;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	public String getResponseData( ) {
		return this.responseData;
	}

}
