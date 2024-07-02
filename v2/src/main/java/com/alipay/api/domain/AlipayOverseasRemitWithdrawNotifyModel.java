package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境汇款，网商银行提现结果通知回调
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:04:39
 */
public class AlipayOverseasRemitWithdrawNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3367248181764975384L;

	/**
	 * APS定义的机构ID
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * json map 对象，透传一些额外的信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * ISO 4217规范的三位货币码
	 */
	@ApiField("withdraw_amount_currency")
	private String withdrawAmountCurrency;

	/**
	 * 对应货币的最小单位的货币值，例如 CNY，1就是1分
	 */
	@ApiField("withdraw_amount_value")
	private String withdrawAmountValue;

	/**
	 * 提现唯一id，由APS生成
	 */
	@ApiField("withdraw_id")
	private String withdrawId;

	/**
	 * 提现申请ID，由提现申请方定义
	 */
	@ApiField("withdraw_request_id")
	private String withdrawRequestId;

	/**
	 * 提现申请结果
	 */
	@ApiField("withdraw_result_code")
	private String withdrawResultCode;

	/**
	 * 提现结果消息
	 */
	@ApiField("withdraw_result_message")
	private String withdrawResultMessage;

	/**
	 * S 成功
F 失败
	 */
	@ApiField("withdraw_result_status")
	private String withdrawResultStatus;

	/**
	 * 提现结束时间
	 */
	@ApiField("withdraw_time")
	private Date withdrawTime;

	public String getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public String getWithdrawAmountCurrency() {
		return this.withdrawAmountCurrency;
	}
	public void setWithdrawAmountCurrency(String withdrawAmountCurrency) {
		this.withdrawAmountCurrency = withdrawAmountCurrency;
	}

	public String getWithdrawAmountValue() {
		return this.withdrawAmountValue;
	}
	public void setWithdrawAmountValue(String withdrawAmountValue) {
		this.withdrawAmountValue = withdrawAmountValue;
	}

	public String getWithdrawId() {
		return this.withdrawId;
	}
	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}

	public String getWithdrawRequestId() {
		return this.withdrawRequestId;
	}
	public void setWithdrawRequestId(String withdrawRequestId) {
		this.withdrawRequestId = withdrawRequestId;
	}

	public String getWithdrawResultCode() {
		return this.withdrawResultCode;
	}
	public void setWithdrawResultCode(String withdrawResultCode) {
		this.withdrawResultCode = withdrawResultCode;
	}

	public String getWithdrawResultMessage() {
		return this.withdrawResultMessage;
	}
	public void setWithdrawResultMessage(String withdrawResultMessage) {
		this.withdrawResultMessage = withdrawResultMessage;
	}

	public String getWithdrawResultStatus() {
		return this.withdrawResultStatus;
	}
	public void setWithdrawResultStatus(String withdrawResultStatus) {
		this.withdrawResultStatus = withdrawResultStatus;
	}

	public Date getWithdrawTime() {
		return this.withdrawTime;
	}
	public void setWithdrawTime(Date withdrawTime) {
		this.withdrawTime = withdrawTime;
	}

}
