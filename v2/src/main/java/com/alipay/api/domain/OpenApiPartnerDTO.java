package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同商业关系
 *
 * @author auto create
 * @since 1.0, 2022-12-12 11:58:13
 */
public class OpenApiPartnerDTO extends AlipayObject {

	private static final long serialVersionUID = 7226275898723964318L;

	/**
	 * 公司OU编码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
