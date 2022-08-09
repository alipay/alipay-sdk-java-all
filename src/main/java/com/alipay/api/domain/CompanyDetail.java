package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OU查询返回公司信息
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:33:08
 */
public class CompanyDetail extends AlipayObject {

	private static final long serialVersionUID = 4783215323375992253L;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 公司对应ouCode
	 */
	@ApiField("ou_code")
	private String ouCode;

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

}
