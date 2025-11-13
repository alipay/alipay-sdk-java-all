package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商品
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:30:02
 */
public class AlipayCommerceEcIndustryinvoiceItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2894676455867146168L;

	/**
	 * 企业商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getCompanyItemId() {
		return this.companyItemId;
	}
	public void setCompanyItemId(String companyItemId) {
		this.companyItemId = companyItemId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
