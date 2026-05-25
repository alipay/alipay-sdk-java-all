package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupBuyOrderDetailList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-11 01:22:45
 */
public class AlipayMerchantOrderHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5775114754761613462L;

	/** 
	 * 订单id
	 */
	@ApiField("order_list")
	private GroupBuyOrderDetailList orderList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setOrderList(GroupBuyOrderDetailList orderList) {
		this.orderList = orderList;
	}
	public GroupBuyOrderDetailList getOrderList( ) {
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
