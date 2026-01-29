package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.order.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:17:38
 */
public class AlipayOfflineSmddOrderListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5222589916247994393L;

	/** 
	 * 订单列表
	 */
	@ApiListField("order_list")
	@ApiField("order_bean")
	private List<OrderBean> orderList;

	public void setOrderList(List<OrderBean> orderList) {
		this.orderList = orderList;
	}
	public List<OrderBean> getOrderList( ) {
		return this.orderList;
	}

}
