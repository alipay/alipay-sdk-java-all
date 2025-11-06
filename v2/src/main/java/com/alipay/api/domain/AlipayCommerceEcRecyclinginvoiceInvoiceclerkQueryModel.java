package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业乐企可用开票员信息查询
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:19:50
 */
public class AlipayCommerceEcRecyclinginvoiceInvoiceclerkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4887349667754112857L;

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
