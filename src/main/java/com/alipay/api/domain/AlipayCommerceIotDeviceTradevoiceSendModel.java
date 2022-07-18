package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到账播报
 *
 * @author auto create
 * @since 1.0, 2022-04-11 15:44:07
 */
public class AlipayCommerceIotDeviceTradevoiceSendModel extends AlipayObject {

	private static final long serialVersionUID = 1323467512331896169L;

	/**
	 * 播报的金额，必须大于0
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
	 * 间连商户id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 交易订单id,生产环境必传。
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
