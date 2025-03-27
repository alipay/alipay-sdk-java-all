package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AnxinkaDeliverDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.anxinitemdeliver.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-23 10:32:21
 */
public class AlipayOpenMiniOrderAnxinitemdeliverBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7833124893219613414L;

	/** 
	 * 安心卡使用明细列表
	 */
	@ApiListField("order_list")
	@ApiField("anxinka_deliver_detail_response")
	private List<AnxinkaDeliverDetailResponse> orderList;

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
	 * 账单列表数目总数，单位：条目数
	 */
	@ApiField("total")
	private Long total;

	public void setOrderList(List<AnxinkaDeliverDetailResponse> orderList) {
		this.orderList = orderList;
	}
	public List<AnxinkaDeliverDetailResponse> getOrderList( ) {
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
