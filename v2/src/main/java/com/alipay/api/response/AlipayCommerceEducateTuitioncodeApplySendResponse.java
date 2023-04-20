package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.apply.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-12 10:52:29
 */
public class AlipayCommerceEducateTuitioncodeApplySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6871114977316542164L;

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
