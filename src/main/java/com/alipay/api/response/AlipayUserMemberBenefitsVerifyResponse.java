package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MemberBenefit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.benefits.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUserMemberBenefitsVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6435649256423751125L;

	/** 
	 * 权益信息
	 */
	@ApiField("benefit")
	private MemberBenefit benefit;

	/** 
	 * 处理结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 处理结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setBenefit(MemberBenefit benefit) {
		this.benefit = benefit;
	}
	public MemberBenefit getBenefit( ) {
		return this.benefit;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
