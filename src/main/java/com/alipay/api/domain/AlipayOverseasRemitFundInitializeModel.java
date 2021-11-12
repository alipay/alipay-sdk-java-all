package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 准备汇款
 *
 * @author auto create
 * @since 1.0, 2020-05-29 14:55:59
 */
public class AlipayOverseasRemitFundInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1516885929847747224L;

	/**
	 * 发端生成的单据号
	 */
	@ApiField("bc_remit_id")
	private String bcRemitId;

	/**
	 * 区块链上需要做合规检查的mid
	 */
	@ApiField("compliance_mid")
	private String complianceMid;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 报价和路由信息
	 */
	@ApiField("quote_route_info")
	private String quoteRouteInfo;

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
	 * 収端用户信息
	 */
	@ApiField("receiver_info")
	private String receiverInfo;

	/**
	 * 接收端的mid
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/**
	 * 汇款附言
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 汇款用途
	 */
	@ApiField("remit_purpose")
	private String remitPurpose;

	/**
	 * 汇款发起的时间
	 */
	@ApiField("send_date")
	private String sendDate;

	/**
	 * 发端用户的地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

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
	 * 发端用户的用户id
	 */
	@ApiField("sender_id")
	private String senderId;

	/**
	 * 发端用户信息
	 */
	@ApiField("sender_info")
	private String senderInfo;

	/**
	 * 发端的mid
	 */
	@ApiField("sender_mid")
	private String senderMid;

	/**
	 * 发端用户的国籍
	 */
	@ApiField("sender_nationality")
	private String senderNationality;

	/**
	 * 交易币种
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	public String getBcRemitId() {
		return this.bcRemitId;
	}
	public void setBcRemitId(String bcRemitId) {
		this.bcRemitId = bcRemitId;
	}

	public String getComplianceMid() {
		return this.complianceMid;
	}
	public void setComplianceMid(String complianceMid) {
		this.complianceMid = complianceMid;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getQuoteRouteInfo() {
		return this.quoteRouteInfo;
	}
	public void setQuoteRouteInfo(String quoteRouteInfo) {
		this.quoteRouteInfo = quoteRouteInfo;
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

	public String getReceiverInfo() {
		return this.receiverInfo;
	}
	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
	}

	public String getReceiverMid() {
		return this.receiverMid;
	}
	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemitPurpose() {
		return this.remitPurpose;
	}
	public void setRemitPurpose(String remitPurpose) {
		this.remitPurpose = remitPurpose;
	}

	public String getSendDate() {
		return this.sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getSenderAddress() {
		return this.senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
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

	public String getSenderId() {
		return this.senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSenderInfo() {
		return this.senderInfo;
	}
	public void setSenderInfo(String senderInfo) {
		this.senderInfo = senderInfo;
	}

	public String getSenderMid() {
		return this.senderMid;
	}
	public void setSenderMid(String senderMid) {
		this.senderMid = senderMid;
	}

	public String getSenderNationality() {
		return this.senderNationality;
	}
	public void setSenderNationality(String senderNationality) {
		this.senderNationality = senderNationality;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

}
