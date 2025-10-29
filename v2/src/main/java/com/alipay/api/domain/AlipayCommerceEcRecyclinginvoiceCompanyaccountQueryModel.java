package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业转账账户信息查询
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:21:02
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1523226819735362765L;

	/**
	 * 企业（商户）转账账户ID
	 */
	@ApiField("company_account_id")
	private String companyAccountId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getCompanyAccountId() {
		return this.companyAccountId;
	}
	public void setCompanyAccountId(String companyAccountId) {
		this.companyAccountId = companyAccountId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
