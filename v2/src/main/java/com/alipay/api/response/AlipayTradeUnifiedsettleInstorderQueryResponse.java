package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UnifiedSettleTradeInstOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.unifiedsettle.instorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:37
 */
public class AlipayTradeUnifiedsettleInstorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2515495716439777386L;

	/** 
	 * 返回true表示可以调整时间范围继续搜索更多数据
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 明细信息列表
	 */
	@ApiListField("order_info_list")
	@ApiField("unified_settle_trade_inst_order_info")
	private List<UnifiedSettleTradeInstOrderInfo> orderInfoList;

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setOrderInfoList(List<UnifiedSettleTradeInstOrderInfo> orderInfoList) {
		this.orderInfoList = orderInfoList;
	}
	public List<UnifiedSettleTradeInstOrderInfo> getOrderInfoList( ) {
		return this.orderInfoList;
	}

}
