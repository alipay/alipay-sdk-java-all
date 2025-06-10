package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemOrderBillDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.itembill.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-31 09:47:04
 */
public class AlipayOpenMiniOrderItembillBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1697317978525157576L;

	/** 
	 * 订单对账列表
	 */
	@ApiListField("order_list")
	@ApiField("item_order_bill_detail_response")
	private List<ItemOrderBillDetailResponse> orderList;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setOrderList(List<ItemOrderBillDetailResponse> orderList) {
		this.orderList = orderList;
	}
	public List<ItemOrderBillDetailResponse> getOrderList( ) {
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
