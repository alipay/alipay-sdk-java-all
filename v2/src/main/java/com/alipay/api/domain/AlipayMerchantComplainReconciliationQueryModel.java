package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 市监局查询商家一键和解是否开通
 *
 * @author auto create
 * @since 1.0, 2023-06-27 09:48:43
 */
public class AlipayMerchantComplainReconciliationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4451517431484792522L;

	/**
	 * 商家支付宝账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商家类型，分为直连商家、间连商家
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 支付宝订单号，从账单中获取
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
