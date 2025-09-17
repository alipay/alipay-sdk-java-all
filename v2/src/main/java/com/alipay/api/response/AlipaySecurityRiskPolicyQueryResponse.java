package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.policy.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 13:57:30
 */
public class AlipaySecurityRiskPolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7682847351172541686L;

	/** 
	 * 是否出二次核身的标识
	 */
	@ApiField("has_to_check")
	private Boolean hasToCheck;

	/** 
	 * 参数主要描述安全内部不透出对外的系统状态，相当于是标
	 */
	@ApiListField("inner_system_code")
	@ApiField("string")
	private List<String> innerSystemCode;

	/** 
	 * 风险咨询情况下返回的风险等级，风险处理不会返回该值
	 */
	@ApiField("level")
	private Long level;

	/** 
	 * 查询是否成功
	 */
	@ApiField("query_success")
	private Boolean querySuccess;

	/** 
	 * 安全请求生成的唯一ID
	 */
	@ApiField("security_id")
	private String securityId;

	/** 
	 * 是否成功，本版本废弃
	 */
	@ApiField("success")
	private Boolean success;

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

	public void setHasToCheck(Boolean hasToCheck) {
		this.hasToCheck = hasToCheck;
	}
	public Boolean getHasToCheck( ) {
		return this.hasToCheck;
	}

	public void setInnerSystemCode(List<String> innerSystemCode) {
		this.innerSystemCode = innerSystemCode;
	}
	public List<String> getInnerSystemCode( ) {
		return this.innerSystemCode;
	}

	public void setLevel(Long level) {
		this.level = level;
	}
	public Long getLevel( ) {
		return this.level;
	}

	public void setQuerySuccess(Boolean querySuccess) {
		this.querySuccess = querySuccess;
	}
	public Boolean getQuerySuccess( ) {
		return this.querySuccess;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public String getSecurityId( ) {
		return this.securityId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
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
