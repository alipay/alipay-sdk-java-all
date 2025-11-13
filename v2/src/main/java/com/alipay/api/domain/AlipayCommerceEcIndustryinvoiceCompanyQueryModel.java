package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息查询
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:29:55
 */
public class AlipayCommerceEcIndustryinvoiceCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6325852984297146366L;

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
