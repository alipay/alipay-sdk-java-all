package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 乐企开票员查询
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:30:00
 */
public class AlipayCommerceEcInvoiceClerkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6824813185877153846L;

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
