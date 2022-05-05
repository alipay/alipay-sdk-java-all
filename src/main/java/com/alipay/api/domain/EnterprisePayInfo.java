package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公付支付信息
 *
 * @author auto create
 * @since 1.0, 2022-04-07 18:10:40
 */
public class EnterprisePayInfo extends AlipayObject {

	private static final long serialVersionUID = 4191617568583122535L;

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

}
