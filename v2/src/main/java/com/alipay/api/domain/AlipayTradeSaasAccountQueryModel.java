package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Saas账户查询
 *
 * @author auto create
 * @since 1.0, 2026-08-25 21:17:52
 */
public class AlipayTradeSaasAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6291896844466943279L;

	/**
	 * SaaS客户ID。与out_merchant_no至少传入一个；两个字段同时传入时必须指向同一客户。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 外部平台为二级商户分配的唯一编码。与customer_id至少传入一个；两个字段同时传入时必须指向同一客户。
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

}
