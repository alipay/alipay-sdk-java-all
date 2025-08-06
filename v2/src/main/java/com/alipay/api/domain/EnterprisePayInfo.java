package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公付支付信息
 *
 * @author auto create
 * @since 1.0, 2023-03-24 15:15:40
 */
public class EnterprisePayInfo extends AlipayObject {

	private static final long serialVersionUID = 6338756522232453125L;

	/**
	 * 因公付业务信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 开票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 是否包含因公付资产
	 */
	@ApiField("is_use_enterprise_pay")
	private Boolean isUseEnterprisePay;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public Boolean getIsUseEnterprisePay() {
		return this.isUseEnterprisePay;
	}
	public void setIsUseEnterprisePay(Boolean isUseEnterprisePay) {
		this.isUseEnterprisePay = isUseEnterprisePay;
	}

}
