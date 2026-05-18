package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.service.apply.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-06 10:27:49
 */
public class AlipayCommerceOperationServiceApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2264846359976779339L;

	/** 
	 * 报名记录id
	 */
	@ApiField("apply_record_id")
	private String applyRecordId;

	/** 
	 * 报名后产生的业务信息，是序列化字符串，具体视不同业务而定。
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
