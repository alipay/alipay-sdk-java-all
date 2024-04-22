package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.thirdparty.reward.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:58
 */
public class AlipayFundTransThirdpartyRewardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4669119851938863393L;

	/** 
	 * 打赏金额，单位：人民币分
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 打赏未成功时的错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 打赏时间，毫秒数
	 */
	@ApiField("last_modified")
	private String lastModified;

	/** 
	 * 被打赏用户支付宝UserId
	 */
	@ApiField("receiver_user_id")
	private String receiverUserId;

	/** 
	 * 打赏用户支付宝UserId
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/** 
	 * 打赏状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 转账单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public String getLastModified( ) {
		return this.lastModified;
	}

	public void setReceiverUserId(String receiverUserId) {
		this.receiverUserId = receiverUserId;
	}
	public String getReceiverUserId( ) {
		return this.receiverUserId;
	}

	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}
	public String getSenderUserId( ) {
		return this.senderUserId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}
	public String getTransferNo( ) {
		return this.transferNo;
	}

}
