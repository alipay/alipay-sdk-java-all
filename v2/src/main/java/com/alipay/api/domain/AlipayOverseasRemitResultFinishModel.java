package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收到汇款的结果
 *
 * @author auto create
 * @since 1.0, 2019-10-24 13:45:28
 */
public class AlipayOverseasRemitResultFinishModel extends AlipayObject {

	private static final long serialVersionUID = 8378285356349746724L;

	/**
	 * 汇款结果
	 */
	@ApiField("biz_result_code")
	private String bizResultCode;

	/**
	 * 汇款结果描述
	 */
	@ApiField("biz_result_msg")
	private String bizResultMsg;

	/**
	 * 失败
	 */
	@ApiField("biz_result_status")
	private String bizResultStatus;

	/**
	 * 完成时间
	 */
	@ApiField("complete_time")
	private String completeTime;

	/**
	 * 发端的单据号
	 */
	@ApiField("external_biz_no")
	private String externalBizNo;

	/**
	 * 接收端的mid
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/**
	 * 发端的mid
	 */
	@ApiField("sender_mid")
	private String senderMid;

	public String getBizResultCode() {
		return this.bizResultCode;
	}
	public void setBizResultCode(String bizResultCode) {
		this.bizResultCode = bizResultCode;
	}

	public String getBizResultMsg() {
		return this.bizResultMsg;
	}
	public void setBizResultMsg(String bizResultMsg) {
		this.bizResultMsg = bizResultMsg;
	}

	public String getBizResultStatus() {
		return this.bizResultStatus;
	}
	public void setBizResultStatus(String bizResultStatus) {
		this.bizResultStatus = bizResultStatus;
	}

	public String getCompleteTime() {
		return this.completeTime;
	}
	public void setCompleteTime(String completeTime) {
		this.completeTime = completeTime;
	}

	public String getExternalBizNo() {
		return this.externalBizNo;
	}
	public void setExternalBizNo(String externalBizNo) {
		this.externalBizNo = externalBizNo;
	}

	public String getReceiverMid() {
		return this.receiverMid;
	}
	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}

	public String getSenderMid() {
		return this.senderMid;
	}
	public void setSenderMid(String senderMid) {
		this.senderMid = senderMid;
	}

}
