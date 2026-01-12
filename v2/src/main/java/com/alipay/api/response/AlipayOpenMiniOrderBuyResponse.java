package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderBuyResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.buy response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-05 17:42:42
 */
public class AlipayOpenMiniOrderBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5883117281558582947L;

	/** 
	 * 合并交易号
	 */
	@ApiField("merge_trade_no")
	private String mergeTradeNo;

	/** 
	 * 聚合交易子订单信息列表
	 */
	@ApiListField("mini_trade_create_responses")
	@ApiField("order_buy_response")
	private List<OrderBuyResponse> miniTradeCreateResponses;

	/** 
	 * 合并交易号的业务类型
	 */
	@ApiField("trade_no_biz_type")
	private String tradeNoBizType;

	public void setMergeTradeNo(String mergeTradeNo) {
		this.mergeTradeNo = mergeTradeNo;
	}
	public String getMergeTradeNo( ) {
		return this.mergeTradeNo;
	}

	public void setMiniTradeCreateResponses(List<OrderBuyResponse> miniTradeCreateResponses) {
		this.miniTradeCreateResponses = miniTradeCreateResponses;
	}
	public List<OrderBuyResponse> getMiniTradeCreateResponses( ) {
		return this.miniTradeCreateResponses;
	}

	public void setTradeNoBizType(String tradeNoBizType) {
		this.tradeNoBizType = tradeNoBizType;
	}
	public String getTradeNoBizType( ) {
		return this.tradeNoBizType;
	}

}
