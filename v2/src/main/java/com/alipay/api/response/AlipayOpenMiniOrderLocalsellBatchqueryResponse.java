package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemSellOrderResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.localsell.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-23 09:57:20
 */
public class AlipayOpenMiniOrderLocalsellBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2218148199664472956L;

	/** 
	 * 订单对账列表
	 */
	@ApiListField("order_list")
	@ApiField("item_sell_order_response")
	private List<ItemSellOrderResponse> orderList;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小，单位：条目数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 对账账单列表返回的订单总数
	 */
	@ApiField("total")
	private Long total;

	public void setOrderList(List<ItemSellOrderResponse> orderList) {
		this.orderList = orderList;
	}
	public List<ItemSellOrderResponse> getOrderList( ) {
		return this.orderList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
