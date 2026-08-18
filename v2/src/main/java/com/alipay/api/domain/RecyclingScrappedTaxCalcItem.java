package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报废产品收购算税参数
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:27:37
 */
public class RecyclingScrappedTaxCalcItem extends AlipayObject {

	private static final long serialVersionUID = 1454762873482825158L;

	/**
	 * 减征比例（个税无，增值税无）
	 */
	@ApiField("reduction_ratio")
	private String reductionRatio;

	/**
	 * 税目编码
	 */
	@ApiField("tax_item_code")
	private String taxItemCode;

	/**
	 * 税目名称
	 */
	@ApiField("tax_item_name")
	private String taxItemName;

	/**
	 * 税种项目代码
	 */
	@ApiField("tax_project_code")
	private String taxProjectCode;

	/**
	 * 税种项目名称
	 */
	@ApiField("tax_project_name")
	private String taxProjectName;

	/**
	 * 税率或征收率（个税无，增值税无）
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public String getReductionRatio() {
		return this.reductionRatio;
	}
	public void setReductionRatio(String reductionRatio) {
		this.reductionRatio = reductionRatio;
	}

	public String getTaxItemCode() {
		return this.taxItemCode;
	}
	public void setTaxItemCode(String taxItemCode) {
		this.taxItemCode = taxItemCode;
	}

	public String getTaxItemName() {
		return this.taxItemName;
	}
	public void setTaxItemName(String taxItemName) {
		this.taxItemName = taxItemName;
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

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
