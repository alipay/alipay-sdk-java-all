package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付通知
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:05:16
 */
public class AlipayOverseasTransferPaymentNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6834251171519165141L;

	/**
	 * Only used for pass-through. In JSON map format.
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 发端机构
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * 交易流水号
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public String getPayerAgentId() {
		return this.payerAgentId;
	}
	public void setPayerAgentId(String payerAgentId) {
		this.payerAgentId = payerAgentId;
	}

	public String getTransferRequestId() {
		return this.transferRequestId;
	}
	public void setTransferRequestId(String transferRequestId) {
		this.transferRequestId = transferRequestId;
	}

}
