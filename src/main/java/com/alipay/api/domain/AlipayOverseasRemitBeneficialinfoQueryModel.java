package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境汇款查询收款人信息
 *
 * @author auto create
 * @since 1.0, 2019-10-24 15:00:29
 */
public class AlipayOverseasRemitBeneficialinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2215676986925248517L;

	/**
	 * 相对于汇率的基准货币
	 */
	@ApiField("base_currency")
	private String baseCurrency;

	/**
	 * 汇率
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/**
	 * 登录ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 外部单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款的金额
	 */
	@ApiField("receive_amount")
	private String receiveAmount;

	/**
	 * 收款的金额币种
	 */
	@ApiField("receive_currency")
	private String receiveCurrency;

	/**
	 * 接收端的ID
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/**
	 * 汇款用途
	 */
	@ApiField("remit_purpose")
	private String remitPurpose;

	/**
	 * 汇款金额
	 */
	@ApiField("send_amount")
	private String sendAmount;

	/**
	 * 汇款人国家
	 */
	@ApiField("send_country")
	private String sendCountry;

	/**
	 * 汇款币种
	 */
	@ApiField("send_currency")
	private String sendCurrency;

	/**
	 * 发端ID
	 */
	@ApiField("sender_mid")
	private String senderMid;

	/**
	 * 汇款人姓名
	 */
	@ApiField("sender_name")
	private String senderName;

	public String getBaseCurrency() {
		return this.baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReceiveAmount() {
		return this.receiveAmount;
	}
	public void setReceiveAmount(String receiveAmount) {
		this.receiveAmount = receiveAmount;
	}

	public String getReceiveCurrency() {
		return this.receiveCurrency;
	}
	public void setReceiveCurrency(String receiveCurrency) {
		this.receiveCurrency = receiveCurrency;
	}

	public String getReceiverMid() {
		return this.receiverMid;
	}
	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}

	public String getRemitPurpose() {
		return this.remitPurpose;
	}
	public void setRemitPurpose(String remitPurpose) {
		this.remitPurpose = remitPurpose;
	}

	public String getSendAmount() {
		return this.sendAmount;
	}
	public void setSendAmount(String sendAmount) {
		this.sendAmount = sendAmount;
	}

	public String getSendCountry() {
		return this.sendCountry;
	}
	public void setSendCountry(String sendCountry) {
		this.sendCountry = sendCountry;
	}

	public String getSendCurrency() {
		return this.sendCurrency;
	}
	public void setSendCurrency(String sendCurrency) {
		this.sendCurrency = sendCurrency;
	}

	public String getSenderMid() {
		return this.senderMid;
	}
	public void setSenderMid(String senderMid) {
		this.senderMid = senderMid;
	}

	public String getSenderName() {
		return this.senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

}
