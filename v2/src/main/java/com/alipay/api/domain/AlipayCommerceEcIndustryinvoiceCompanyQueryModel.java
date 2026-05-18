package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息查询
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:57:25
 */
public class AlipayCommerceEcIndustryinvoiceCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7631185885466153313L;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
