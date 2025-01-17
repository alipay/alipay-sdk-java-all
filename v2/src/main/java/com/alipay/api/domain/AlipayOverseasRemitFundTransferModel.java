package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起汇款请求
 *
 * @author auto create
 * @since 1.0, 2020-02-11 15:27:05
 */
public class AlipayOverseasRemitFundTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2342422791157377284L;

	/**
	 * 汇率的基准币种
	 */
	@ApiField("base_currency")
	private String baseCurrency;

	/**
	 * 发端生成的单据号
	 */
	@ApiField("bc_remit_id")
	private String bcRemitId;

	/**
	 * 汇率
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/**
	 * 收端用户收到的金额
	 */
	@ApiField("receiver_amount")
	private String receiverAmount;

	/**
	 * 收端用户收到的金额币种
	 */
	@ApiField("receiver_currency")
	private String receiverCurrency;

	/**
	 * 接收端的mid
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/**
	 * 发端用户的金额
	 */
	@ApiField("sender_amount")
	private String senderAmount;

	/**
	 * 发端用户金额的币种
	 */
	@ApiField("sender_currency")
	private String senderCurrency;

	/**
	 * 发端的mid
	 */
	@ApiField("sender_mid")
	private String senderMid;

	public String getBaseCurrency() {
		return this.baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getBcRemitId() {
		return this.bcRemitId;
	}
	public void setBcRemitId(String bcRemitId) {
		this.bcRemitId = bcRemitId;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getReceiverAmount() {
		return this.receiverAmount;
	}
	public void setReceiverAmount(String receiverAmount) {
		this.receiverAmount = receiverAmount;
	}

	public String getReceiverCurrency() {
		return this.receiverCurrency;
	}
	public void setReceiverCurrency(String receiverCurrency) {
		this.receiverCurrency = receiverCurrency;
	}

	public String getReceiverMid() {
		return this.receiverMid;
	}
	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}

	public String getSenderAmount() {
		return this.senderAmount;
	}
	public void setSenderAmount(String senderAmount) {
		this.senderAmount = senderAmount;
	}

	public String getSenderCurrency() {
		return this.senderCurrency;
	}
	public void setSenderCurrency(String senderCurrency) {
		this.senderCurrency = senderCurrency;
	}

	public String getSenderMid() {
		return this.senderMid;
	}
	public void setSenderMid(String senderMid) {
		this.senderMid = senderMid;
	}

}
