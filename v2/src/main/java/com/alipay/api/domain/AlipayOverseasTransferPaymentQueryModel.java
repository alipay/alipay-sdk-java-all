package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款单据查询
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:06:00
 */
public class AlipayOverseasTransferPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1865925878652665815L;

	/**
	 * 透出字段。以map方式存储
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 源机构编号
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * AC交易流水号
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
