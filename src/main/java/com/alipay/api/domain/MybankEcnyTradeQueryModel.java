package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币交易查询
 *
 * @author auto create
 * @since 1.0, 2021-12-09 14:55:53
 */
public class MybankEcnyTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5836174561558511529L;

	/**
	 * 调用方单号
商户订单号和运营机构交易号不能同时为空。
trade_no,out_trade_no如果同时存在优先取trade_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 运营机构交易号，和商户订单号不能同时为空
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
