package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Agent收款单预下单
 *
 * @author auto create
 * @since 1.0, 2025-12-24 17:22:41
 */
public class AlipayAipayTradePrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 5277749152928342617L;

	/**
	 * 研发平台分配的智能体ID。
如果是开发者自研则自定义传入
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 智能体名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 订单总金额。
单位为元，精确到小数点后两位，取值范围[0.01,100000000]，金额不能为0
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商户外部订单号。
由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 请求渠道来源，如mcp_1.0.0
	 */
	@ApiField("request_channel_source")
	private String requestChannelSource;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getRequestChannelSource() {
		return this.requestChannelSource;
	}
	public void setRequestChannelSource(String requestChannelSource) {
		this.requestChannelSource = requestChannelSource;
	}

}
