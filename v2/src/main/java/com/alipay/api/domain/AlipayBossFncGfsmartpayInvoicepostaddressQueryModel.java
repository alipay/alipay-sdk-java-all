package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智付发票邮寄地址查询
 *
 * @author auto create
 * @since 1.0, 2024-07-18 10:06:31
 */
public class AlipayBossFncGfsmartpayInvoicepostaddressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6589183122773869651L;

	/**
	 * 业务身份编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 公司代码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * ERP实例
	 */
	@ApiField("erp_instance")
	private String erpInstance;

	/**
	 * 公司ou编码
	 */
	@ApiField("ou_code")
	private String ouCode;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

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
