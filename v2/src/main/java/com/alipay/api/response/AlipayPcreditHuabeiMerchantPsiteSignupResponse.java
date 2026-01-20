package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.psite.signup response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-25 09:47:34
 */
public class AlipayPcreditHuabeiMerchantPsiteSignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 7392761647196125674L;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 报名记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/** 
	 * 报名结果状态
	 */
	@ApiField("signup_status")
	private String signupStatus;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

	public void setSignupStatus(String signupStatus) {
		this.signupStatus = signupStatus;
	}
	public String getSignupStatus( ) {
		return this.signupStatus;
	}

}
