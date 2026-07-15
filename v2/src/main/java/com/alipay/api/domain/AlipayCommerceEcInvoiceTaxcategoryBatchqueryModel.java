package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税收分类编码查询
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:56:52
 */
public class AlipayCommerceEcInvoiceTaxcategoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6548362788457412133L;

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
