package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税收分类编码查询
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:29:56
 */
public class AlipayCommerceEcInvoiceTaxcategoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4176456748921873893L;

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
