package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 市监局添加一键和解商户
 *
 * @author auto create
 * @since 1.0, 2025-10-24 10:36:07
 */
public class AlipayMerchantComplainReconciliationSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2131377117225994742L;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("merchant_cert_no")
	private String merchantCertNo;

	/**
	 * 支付宝侧订单号，可从账单中获取
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getMerchantCertNo() {
		return this.merchantCertNo;
	}
	public void setMerchantCertNo(String merchantCertNo) {
		this.merchantCertNo = merchantCertNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
