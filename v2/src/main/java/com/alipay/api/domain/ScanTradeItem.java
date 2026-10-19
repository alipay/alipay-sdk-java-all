package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-12 11:27:59
 */
public class ScanTradeItem extends AlipayObject {

	private static final long serialVersionUID = 2364442546138258374L;

	/**
	 * IOT加密信息
	 */
	@ApiField("encrypt_info")
	private String encryptInfo;

	/**
	 * 支付宝扫码交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getEncryptInfo() {
		return this.encryptInfo;
	}
	public void setEncryptInfo(String encryptInfo) {
		this.encryptInfo = encryptInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
