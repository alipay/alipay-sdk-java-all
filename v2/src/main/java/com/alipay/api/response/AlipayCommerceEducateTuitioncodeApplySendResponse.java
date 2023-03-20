package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.apply.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 17:48:40
 */
public class AlipayCommerceEducateTuitioncodeApplySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8422511485346946826L;

	/** 
	 * 申请id
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
