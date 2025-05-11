package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业营业员删除
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:37
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyclerkDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4245195659726754543L;

	/**
	 * 企业营业员ID
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getCompanyClerkId() {
		return this.companyClerkId;
	}
	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
