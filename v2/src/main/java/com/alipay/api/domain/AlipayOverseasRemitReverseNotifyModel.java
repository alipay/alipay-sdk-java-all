package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中国汇出汇款退票通知接口
 *
 * @author auto create
 * @since 1.0, 2023-06-23 13:11:42
 */
public class AlipayOverseasRemitReverseNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1237146475878843531L;

	/**
	 * 拓展信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 退票请求金额，单位为最小币种单位，如人民币的分、港币的分、日元的元
	 */
	@ApiField("reverse_from_amount")
	private Money reverseFromAmount;

	/**
	 * 退票ID
	 */
	@ApiField("reverse_id")
	private String reverseId;

	/**
	 * 退票汇率,格式为json
	 */
	@ApiField("reverse_quote")
	private String reverseQuote;

	/**
	 * 退票原因
	 */
	@ApiField("reverse_reason")
	private String reverseReason;

	/**
	 * 退票原因信息
	 */
	@ApiField("reverse_reason_message")
	private String reverseReasonMessage;

	/**
	 * 退票请求单号
	 */
	@ApiField("reverse_request_id")
	private String reverseRequestId;

	/**
	 * 退票结果
	 */
	@ApiField("reverse_result")
	private String reverseResult;

	/**
	 * 时间字符串
	 */
	@ApiField("reverse_time")
	private String reverseTime;

	/**
	 * 退票目标金额，单位为最小币种单位，如人民币的分、港币的分、日元的元
	 */
	@ApiField("reverse_to_amount")
	private Money reverseToAmount;

	/**
	 * 汇款请求单号
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public Money getReverseFromAmount() {
		return this.reverseFromAmount;
	}
	public void setReverseFromAmount(Money reverseFromAmount) {
		this.reverseFromAmount = reverseFromAmount;
	}

	public String getReverseId() {
		return this.reverseId;
	}
	public void setReverseId(String reverseId) {
		this.reverseId = reverseId;
	}

	public String getReverseQuote() {
		return this.reverseQuote;
	}
	public void setReverseQuote(String reverseQuote) {
		this.reverseQuote = reverseQuote;
	}

	public String getReverseReason() {
		return this.reverseReason;
	}
	public void setReverseReason(String reverseReason) {
		this.reverseReason = reverseReason;
	}

	public String getReverseReasonMessage() {
		return this.reverseReasonMessage;
	}
	public void setReverseReasonMessage(String reverseReasonMessage) {
		this.reverseReasonMessage = reverseReasonMessage;
	}

	public String getReverseRequestId() {
		return this.reverseRequestId;
	}
	public void setReverseRequestId(String reverseRequestId) {
		this.reverseRequestId = reverseRequestId;
	}

	public String getReverseResult() {
		return this.reverseResult;
	}
	public void setReverseResult(String reverseResult) {
		this.reverseResult = reverseResult;
	}

	public String getReverseTime() {
		return this.reverseTime;
	}
	public void setReverseTime(String reverseTime) {
		this.reverseTime = reverseTime;
	}

	public Money getReverseToAmount() {
		return this.reverseToAmount;
	}
	public void setReverseToAmount(Money reverseToAmount) {
		this.reverseToAmount = reverseToAmount;
	}

	public String getTransferRequestId() {
		return this.transferRequestId;
	}
	public void setTransferRequestId(String transferRequestId) {
		this.transferRequestId = transferRequestId;
	}

}
