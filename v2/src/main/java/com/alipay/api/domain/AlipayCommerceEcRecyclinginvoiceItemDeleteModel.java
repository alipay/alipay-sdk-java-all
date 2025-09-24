package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品库删除商品信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:55
 */
public class AlipayCommerceEcRecyclinginvoiceItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3631734919118973729L;

	/**
	 * 商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	/**
	 * 企业（商户）税号
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
