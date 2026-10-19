package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本次交易按需静默创建的SaaS客户信息
 *
 * @author auto create
 * @since 1.0, 2026-10-15 15:32:55
 */
public class SaasCustomerInfo extends AlipayObject {

	private static final long serialVersionUID = 1824189556499777234L;

	/**
	 * SaaS客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 客户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部平台二级商户唯一编码
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

}
