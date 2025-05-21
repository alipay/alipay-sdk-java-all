package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业信息查询
 *
 * @author auto create
 * @since 1.0, 2025-05-20 20:12:30
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3757916896139424389L;

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
