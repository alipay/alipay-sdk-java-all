package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收单创单相关参数
 *
 * @author auto create
 * @since 1.0, 2024-10-21 11:32:51
 */
public class PayInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 7533867915749354929L;

	/**
	 * 收单超时关单时间，单位：s
	 */
	@ApiField("no_pay_close_time")
	private String noPayCloseTime;

	/**
	 * 支付宝收单交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getNoPayCloseTime() {
		return this.noPayCloseTime;
	}
	public void setNoPayCloseTime(String noPayCloseTime) {
		this.noPayCloseTime = noPayCloseTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
