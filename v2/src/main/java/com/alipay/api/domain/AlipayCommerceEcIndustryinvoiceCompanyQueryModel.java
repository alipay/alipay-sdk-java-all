package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息查询
 *
 * @author auto create
 * @since 1.0, 2026-09-30 13:49:30
 */
public class AlipayCommerceEcIndustryinvoiceCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5489913937697644935L;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 是否更新税务信息，默认 false。 为 true会先同步税务信息后，返回最新的税务信息
	 */
	@ApiField("update_tax_info")
	private Boolean updateTaxInfo;

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public Boolean getUpdateTaxInfo() {
		return this.updateTaxInfo;
	}
	public void setUpdateTaxInfo(Boolean updateTaxInfo) {
		this.updateTaxInfo = updateTaxInfo;
	}

}
