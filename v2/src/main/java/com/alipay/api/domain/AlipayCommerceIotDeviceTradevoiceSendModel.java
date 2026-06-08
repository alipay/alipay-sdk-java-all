package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到账播报
 *
 * @author auto create
 * @since 1.0, 2026-03-25 21:16:27
 */
public class AlipayCommerceIotDeviceTradevoiceSendModel extends AlipayObject {

	private static final long serialVersionUID = 1125663624167332328L;

	/**
	 * 播报的金额，单位元 必须大于0
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 语料资源的消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 支付宝外部订单号，即商家订单号。当交易类型为ALIPAY_TRADE时，和支付宝订单号trade_id两者选其中之一传，为OTHER时out_order_no不用传，trade_id必传
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 间连商户id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 交易订单id,生产环境交易类型为OTHER必传。
为ALIPAY_TARDE时和out_order_no两者选一传
工厂验收设备的时候可不传，通过白名单管控。
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 交易类型
可选值: ALIPAY_TRADE 支付宝交易  OTHER 其他交易途径
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
