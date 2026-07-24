package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AplusOrderDetailList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.order.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-02 19:42:50
 */
public class AlipayMarketingOrderBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6531914416692776649L;

	/** 
	 * 订单列表
	 */
	@ApiField("order_list")
	private AplusOrderDetailList orderList;

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

	public void setOrderList(AplusOrderDetailList orderList) {
		this.orderList = orderList;
	}
	public AplusOrderDetailList getOrderList( ) {
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
