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
 * @since 1.0, 2025-09-28 14:57:39
 */
public class AlipayTradeUnifiedsettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4383818561477925459L;

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
