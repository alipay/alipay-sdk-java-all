package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公司信息DTO
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:51:37
 */
public class CompanyInfoRequestDTO extends AlipayObject {

	private static final long serialVersionUID = 2311384356454371115L;

	/**
	 * 公司代码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * erp套件
	 */
	@ApiField("erp_instance")
	private String erpInstance;

	/**
	 * OU
	 */
	@ApiField("ou_code")
	private String ouCode;

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getErpInstance() {
		return this.erpInstance;
	}
	public void setErpInstance(String erpInstance) {
		this.erpInstance = erpInstance;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

}
