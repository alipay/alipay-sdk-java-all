package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: aft.finsecure.riskplus.security.policy.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:08
 */
public class AftFinsecureRiskplusSecurityPolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2423373389428493171L;

	/** 
	 * 风险咨询情况下返回的风险等级，风险处理不会返回该值
	 */
	@ApiField("level")
	private Long level;

	/** 
	 * 反馈成功之后的id
	 */
	@ApiField("security_id")
	private String securityId;

	/** 
	 * 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
	 */
	@ApiField("security_result")
	private String securityResult;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 有风险需要失败业务情况下的返回码
	 */
	@ApiField("template_code")
	private String templateCode;

	/** 
	 * 有风险需要失败业务情况下的返回码描述
	 */
	@ApiField("template_desc")
	private String templateDesc;

	/** 
	 * native场景下的核身id
	 */
	@ApiField("verify_id")
	private String verifyId;

	/** 
	 * h5场景下的核身地址
	 */
	@ApiField("verify_url")
	private String verifyUrl;

	public void setLevel(Long level) {
		this.level = level;
	}
	public Long getLevel( ) {
		return this.level;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public String getSecurityId( ) {
		return this.securityId;
	}

	public void setSecurityResult(String securityResult) {
		this.securityResult = securityResult;
	}
	public String getSecurityResult( ) {
		return this.securityResult;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateCode( ) {
		return this.templateCode;
	}

	public void setTemplateDesc(String templateDesc) {
		this.templateDesc = templateDesc;
	}
	public String getTemplateDesc( ) {
		return this.templateDesc;
	}

	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}
	public String getVerifyId( ) {
		return this.verifyId;
	}

	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}
	public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

}
