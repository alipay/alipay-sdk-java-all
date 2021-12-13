package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易订单查询接口
 *
 * @author auto create
 * @since 1.0, 2021-10-26 15:23:12
 */
public class AlipayEcoMycarTradeOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4638545471947957287L;

	/**
	 * 车主平台交易号，与车主业务平台订单号相同。和trade_no，out_biz_trade_no不能同时为空。
	 */
	@ApiField("biz_trade_no")
	private String bizTradeNo;

	/**
	 * 外部订单号，和biz_trade_no，trade_no不能同时为空
	 */
	@ApiField("out_biz_trade_no")
	private String outBizTradeNo;

	/**
	 * 支付宝交易号。该笔车主平台对应的支付宝交易编号，使用该交易号也可以直接调用支付宝开放平台的交易查询接口查询交易信息。 和biz_trade_no，out_biz_trade_no不能同时为空。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizTradeNo() {
		return this.bizTradeNo;
	}
	public void setBizTradeNo(String bizTradeNo) {
		this.bizTradeNo = bizTradeNo;
	}

	public String getOutBizTradeNo() {
		return this.outBizTradeNo;
	}
	public void setOutBizTradeNo(String outBizTradeNo) {
		this.outBizTradeNo = outBizTradeNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
