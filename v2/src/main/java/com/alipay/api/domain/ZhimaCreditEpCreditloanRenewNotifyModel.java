package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信金融续贷通知服务
 *
 * @author auto create
 * @since 1.0, 2024-12-03 10:22:57
 */
public class ZhimaCreditEpCreditloanRenewNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7161752767341361641L;

	/**
	 * 金融产品code码，接口提供方分配
	 */
	@ApiField("financial_product_code")
	private String financialProductCode;

	/**
	 * 商户自身的请求id，需保证其唯一性
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/**
	 * 续贷通知具体内容,JSON字符串
	 */
	@ApiField("notify_content")
	private String notifyContent;

	public String getFinancialProductCode() {
		return this.financialProductCode;
	}
	public void setFinancialProductCode(String financialProductCode) {
		this.financialProductCode = financialProductCode;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

	public String getNotifyContent() {
		return this.notifyContent;
	}
	public void setNotifyContent(String notifyContent) {
		this.notifyContent = notifyContent;
	}

}
