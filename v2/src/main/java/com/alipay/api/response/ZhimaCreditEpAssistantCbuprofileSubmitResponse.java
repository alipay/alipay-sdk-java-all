package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.cbuprofile.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-27 10:17:52
 */
public class ZhimaCreditEpAssistantCbuprofileSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2237679732473828376L;

	/** 
	 * 用户画像记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
