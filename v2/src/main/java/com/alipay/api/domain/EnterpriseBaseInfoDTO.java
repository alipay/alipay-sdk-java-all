package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业基本信息
 *
 * @author auto create
 * @since 1.0, 2025-08-25 14:03:36
 */
public class EnterpriseBaseInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8658784115834462642L;

	/**
	 * 企业注册页面需要回显的企业简称
	 */
	@ApiField("enterprise_alias")
	private String enterpriseAlias;

	/**
	 * 企业注册页面需要回显的统一社会信用代码，只能是数字和字母组成
	 */
	@ApiField("enterprise_code")
	private String enterpriseCode;

	/**
	 * 企业注册页面需要回显的企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 企业注册页面需要回显的企业所属行业
	 */
	@ApiField("industry")
	private String industry;

	public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}
	public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
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
