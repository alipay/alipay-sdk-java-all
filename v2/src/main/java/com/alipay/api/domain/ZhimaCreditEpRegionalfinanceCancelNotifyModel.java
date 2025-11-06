package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信区域金融机构作废通知服务
 *
 * @author auto create
 * @since 1.0, 2024-07-29 10:53:12
 */
public class ZhimaCreditEpRegionalfinanceCancelNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8349116124842818287L;

	/**
	 * 金融产品code码，接口提供方分配。不同的机构的金融产品code码不同
	 */
	@ApiField("financial_product_code")
	private String financialProductCode;

	/**
	 * 商户自身的请求id，需保证其唯一性
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/**
	 * 作废通知具体内容，JSON字符串
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
