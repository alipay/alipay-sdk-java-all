package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向开票订单业务转账授权申请
 *
 * @author auto create
 * @since 1.0, 2026-06-25 16:31:27
 */
public class AlipayCommerceEcRecyclinginvoiceBiztransferauthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7221197711823257577L;

	/**
	 * 企业转账账户 ID，来自 `company.query` 的 `company_product_list.company_account_id`
	 */
	@ApiField("company_account_id")
	private String companyAccountId;

	/**
	 * 企业税号
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
