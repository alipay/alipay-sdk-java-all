package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.leaveuser.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 14:28:12
 */
public class AlipayCommerceEducateLeaveuserAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4187335463245197758L;

	/** 
	 * 请假申请单号
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
