package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UnifiedSettleOrderDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.unifiedsettle.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-06 19:59:28
 */
public class AlipayTradeUnifiedsettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8152679815349181399L;

	/** 
	 * 收结易明细列表数据
	 */
	@ApiListField("order_detail_list")
	@ApiField("unified_settle_order_detail")
	private List<UnifiedSettleOrderDetail> orderDetailList;

	public void setOrderDetailList(List<UnifiedSettleOrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	public List<UnifiedSettleOrderDetail> getOrderDetailList( ) {
		return this.orderDetailList;
	}

}
