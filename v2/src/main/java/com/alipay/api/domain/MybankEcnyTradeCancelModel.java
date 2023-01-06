package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币交易撤消
 *
 * @author auto create
 * @since 1.0, 2022-09-14 16:24:47
 */
public class MybankEcnyTradeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8494726524142595553L;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 调用方订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 运营机构交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
