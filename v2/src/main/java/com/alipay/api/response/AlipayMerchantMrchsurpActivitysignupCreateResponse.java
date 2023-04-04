package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurp.activitysignup.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:17:59
 */
public class AlipayMerchantMrchsurpActivitysignupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8118236151556648711L;

	/** 
	 * 报名成功后返回报名记录ID，报名失败无该字段
	 */
	@ApiField("signup_record_id")
	private String signupRecordId;

	public void setSignupRecordId(String signupRecordId) {
		this.signupRecordId = signupRecordId;
	}
	public String getSignupRecordId( ) {
		return this.signupRecordId;
	}

}
