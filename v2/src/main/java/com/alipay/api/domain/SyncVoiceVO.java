package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到账播报模型
 *
 * @author auto create
 * @since 1.0, 2021-04-07 21:35:00
 */
public class SyncVoiceVO extends AlipayObject {

	private static final long serialVersionUID = 8511778928677629156L;

	/**
	 * 播报的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 合并播报开关，默认为0。设置为1后用于短时间内同时发生多笔播报时，优化播报提示内容。如支付宝到账1元、2元、3元
	 */
	@ApiField("merge_switch")
	private Long mergeSwitch;

	/**
	 * 金额播报开关。置为0则只会播报到账提示音，不会播报具体金额。
	 */
	@ApiField("money_switch")
	private Long moneySwitch;

	/**
	 * 支付的渠道类型
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 交易id
	 */
	@ApiField("trade_id")
	private String tradeId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Long getMergeSwitch() {
		return this.mergeSwitch;
	}
	public void setMergeSwitch(Long mergeSwitch) {
		this.mergeSwitch = mergeSwitch;
	}

	public Long getMoneySwitch() {
		return this.moneySwitch;
	}
	public void setMoneySwitch(Long moneySwitch) {
		this.moneySwitch = moneySwitch;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}
