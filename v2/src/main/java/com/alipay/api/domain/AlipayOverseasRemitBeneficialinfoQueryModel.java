package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境汇款查询收款人信息
 *
 * @author auto create
 * @since 1.0, 2021-07-15 15:07:50
 */
public class AlipayOverseasRemitBeneficialinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2717966985382245455L;

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
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

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
	 * 用户的名，拼音
	 */
	@ApiField("receiver_first_name")
	private String receiverFirstName;

	/**
	 * 用户的全名拼音
	 */
	@ApiField("receiver_full_name")
	private String receiverFullName;

	/**
	 * 用户的姓，拼音
	 */
	@ApiField("receiver_last_name")
	private String receiverLastName;

	/**
	 * 接收端的ID
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/**
	 * 用户中间的名字
	 */
	@ApiField("receiver_middle_name")
	private String receiverMiddleName;

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
	 * 汇款人国家，与sender_nationality不能同时为空
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

	/**
	 * 汇款人国籍，与send_country不能同时为空
	 */
	@ApiField("sender_nationality")
	private String senderNationality;

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

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
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

	public String getReceiverFirstName() {
		return this.receiverFirstName;
	}
	public void setReceiverFirstName(String receiverFirstName) {
		this.receiverFirstName = receiverFirstName;
	}

	public String getReceiverFullName() {
		return this.receiverFullName;
	}
	public void setReceiverFullName(String receiverFullName) {
		this.receiverFullName = receiverFullName;
	}

	public String getReceiverLastName() {
		return this.receiverLastName;
	}
	public void setReceiverLastName(String receiverLastName) {
		this.receiverLastName = receiverLastName;
	}

	public String getReceiverMid() {
		return this.receiverMid;
	}
	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}

	public String getReceiverMiddleName() {
		return this.receiverMiddleName;
	}
	public void setReceiverMiddleName(String receiverMiddleName) {
		this.receiverMiddleName = receiverMiddleName;
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

	public String getSenderNationality() {
		return this.senderNationality;
	}
	public void setSenderNationality(String senderNationality) {
		this.senderNationality = senderNationality;
	}

}
