package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业乐企可用开票员信息查询
 *
 * @author auto create
 * @since 1.0, 2026-05-15 19:32:43
 */
public class AlipayCommerceEcRecyclinginvoiceInvoiceclerkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3484754768639733363L;

	/**
	 * 企业（商户）税号
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
