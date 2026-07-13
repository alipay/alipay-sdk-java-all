package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业基本信息
 *
 * @author auto create
 * @since 1.0, 2026-04-23 19:19:16
 */
public class ReliableEnterpriseBaseInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4754172828661235858L;

	/**
	 * 企业认证状态
	 */
	@ApiField("auth_status")
	private String authStatus;

	/**
	 * 企业营业执照中的统一社会信用代码，只能是数字和字母组成
	 */
	@ApiField("enterprise_code")
	private String enterpriseCode;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 企业所属行业
	 */
	@ApiField("industry")
	private String industry;

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
