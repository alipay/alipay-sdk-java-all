package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 乐企开票员查询
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:57:34
 */
public class AlipayCommerceEcInvoiceClerkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5424258113378233116L;

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
