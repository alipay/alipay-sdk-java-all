package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻可信名片声誉回传
 *
 * @author auto create
 * @since 1.0, 2026-04-29 13:07:48
 */
public class ZhimaCreditPeAcpReputationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6615992282493649977L;

	/**
	 * 交易发起方智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 交易参与方智能体id
	 */
	@ApiField("relate_agent_id")
	private String relateAgentId;

	/**
	 * 商家侧的交易id
	 */
	@ApiField("trade_id")
	private String tradeId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getRelateAgentId() {
		return this.relateAgentId;
	}
	public void setRelateAgentId(String relateAgentId) {
		this.relateAgentId = relateAgentId;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}
