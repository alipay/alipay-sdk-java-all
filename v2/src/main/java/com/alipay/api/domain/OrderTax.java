package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单缴税明细
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:37
 */
public class OrderTax extends AlipayObject {

	private static final long serialVersionUID = 3429189869186338253L;

	/**
	 * 税额（元，两位小数）
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 征收项目代码，与税务机关公布的征收项目代码保持一致
	 */
	@ApiField("tax_project_code")
	private String taxProjectCode;

	/**
	 * 征收项目名称
	 */
	@ApiField("tax_project_name")
	private String taxProjectName;

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxProjectCode() {
		return this.taxProjectCode;
	}
	public void setTaxProjectCode(String taxProjectCode) {
		this.taxProjectCode = taxProjectCode;
	}

	public String getTaxProjectName() {
		return this.taxProjectName;
	}
	public void setTaxProjectName(String taxProjectName) {
		this.taxProjectName = taxProjectName;
	}

}
