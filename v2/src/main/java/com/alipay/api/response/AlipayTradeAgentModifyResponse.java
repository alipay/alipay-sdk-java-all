package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.agent.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-26 21:32:52
 */
public class AlipayTradeAgentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2564233939296653469L;

	/** 
	 * 支付宝侧智能体唯一ID。
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 智能体审核申请单号。
	 */
	@ApiField("order_id")
	private String orderId;

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

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
