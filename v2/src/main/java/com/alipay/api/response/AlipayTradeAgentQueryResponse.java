package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.agent.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-21 17:52:18
 */
public class AlipayTradeAgentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8891166657218252978L;

	/** 
	 * 支付宝侧智能体唯一ID。
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 本次申请的操作类型。
	 */
	@ApiField("operation")
	private String operation;

	/** 
	 * 千问平台侧外部请求号。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 审核拒绝原因。
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 当前申请状态。
	 */
	@ApiField("status")
	private String status;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getOperation( ) {
		return this.operation;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
