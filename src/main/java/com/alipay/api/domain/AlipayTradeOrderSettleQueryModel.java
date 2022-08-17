package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易分账查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-16 18:51:38
 */
public class AlipayTradeOrderSettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4253792723416754166L;

	/**
	 * 外部请求号，需要和支付宝交易号一起传入
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付宝分账请求单号，传入该字段，无需再传外部请求号和支付宝交易号
	 */
	@ApiField("settle_no")
	private String settleNo;

	/**
	 * 支付宝交易号，传入该字段，需要和外部请求号一起传入
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSettleNo() {
		return this.settleNo;
	}
	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
