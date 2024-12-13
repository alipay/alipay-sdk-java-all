package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保支付查询
 *
 * @author auto create
 * @since 1.0, 2024-09-11 17:00:37
 */
public class AlipayCommerceMedicalTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7496179936779473231L;

	/**
	 * 外部交易流水号。与trade_no不能都为空，都有值时优先取trade_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 平台交易流水号。与out_trade_no不能都为空，都有值时优先取trade_no
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
