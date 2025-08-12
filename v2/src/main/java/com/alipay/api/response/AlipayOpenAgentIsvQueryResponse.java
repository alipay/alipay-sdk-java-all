package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.isv.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-15 09:56:57
 */
public class AlipayOpenAgentIsvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4369866223132198513L;

	/** 
	 * 智能体appId，商家确认后非空，若商家未确认或超时返回空
	 */
	@ApiField("agent_app_id")
	private String agentAppId;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单号，开发者帐号+外部订单号维度来控制请求务幂等
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * PROCESS处理中，TIMEOUT超时，AGREED同意， REJECTED拒绝
	 */
	@ApiField("status")
	private String status;

	public void setAgentAppId(String agentAppId) {
		this.agentAppId = agentAppId;
	}
	public String getAgentAppId( ) {
		return this.agentAppId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
