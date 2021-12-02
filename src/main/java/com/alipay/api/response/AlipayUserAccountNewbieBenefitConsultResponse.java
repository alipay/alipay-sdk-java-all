package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AntMemberBenefitInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.newbie.benefit.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:17
 */
public class AlipayUserAccountNewbieBenefitConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6778743742691955584L;

	/** 
	 * 脱敏后的支付宝登录号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 权益信息
	 */
	@ApiField("benefit_info")
	private AntMemberBenefitInfo benefitInfo;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 成功
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 本次请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setBenefitInfo(AntMemberBenefitInfo benefitInfo) {
		this.benefitInfo = benefitInfo;
	}
	public AntMemberBenefitInfo getBenefitInfo( ) {
		return this.benefitInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
