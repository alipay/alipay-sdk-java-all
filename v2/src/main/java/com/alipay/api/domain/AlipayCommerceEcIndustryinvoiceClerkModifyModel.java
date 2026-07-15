package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业开票员编辑
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:50:40
 */
public class AlipayCommerceEcIndustryinvoiceClerkModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5381618566921481743L;

	/**
	 * 开票员身份标识
	 */
	@ApiField("clerk_no")
	private String clerkNo;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getClerkNo() {
		return this.clerkNo;
	}
	public void setClerkNo(String clerkNo) {
		this.clerkNo = clerkNo;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
