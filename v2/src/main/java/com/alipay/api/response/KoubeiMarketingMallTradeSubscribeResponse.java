package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.trade.subscribe response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:27:46
 */
public class KoubeiMarketingMallTradeSubscribeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1688394575784469891L;

	/** 
	 * 申请工单id（用以查询申请工单状态）
	 */
	@ApiField("order_flow_id")
	private String orderFlowId;

	public void setOrderFlowId(String orderFlowId) {
		this.orderFlowId = orderFlowId;
	}
	public String getOrderFlowId( ) {
		return this.orderFlowId;
	}

}
