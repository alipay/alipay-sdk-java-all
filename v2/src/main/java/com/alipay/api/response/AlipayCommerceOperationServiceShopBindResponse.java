package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.service.shop.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-01 17:47:55
 */
public class AlipayCommerceOperationServiceShopBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5211673753923624854L;

	/** 
	 * 序列化后业务返回信息，可能为空
	 */
	@ApiField("response_data")
	private String responseData;

	/** 
	 * 一次提交返回的唯一id
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
