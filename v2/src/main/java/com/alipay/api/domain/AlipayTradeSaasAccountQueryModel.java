package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Saas账户查询
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:57:50
 */
public class AlipayTradeSaasAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4689591487124639388L;

	/**
	 * SaaS客户ID。与out_merchant_no至少传入一个，两个字段同时传入时按AND条件查询。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 外部平台给二级商户分配的唯一编码。与customer_id至少传入一个，两个字段同时传入时按AND条件查询。
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
