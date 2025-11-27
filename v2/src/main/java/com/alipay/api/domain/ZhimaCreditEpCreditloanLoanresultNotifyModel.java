package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 放款结果通知回调
 *
 * @author auto create
 * @since 1.0, 2024-02-20 14:35:15
 */
public class ZhimaCreditEpCreditloanLoanresultNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2799596674756149845L;

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
	 * 放款回调通知具体内容,JSON字符串
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
