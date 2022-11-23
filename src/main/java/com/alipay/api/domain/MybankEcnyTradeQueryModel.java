package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币交易查询
 *
 * @author auto create
 * @since 1.0, 2022-09-14 16:19:12
 */
public class MybankEcnyTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1756446382715382211L;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 调用方单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 运营机构单号
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
