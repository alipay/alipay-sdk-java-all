package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StoreOrderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.order.store.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:11
 */
public class AntMerchantOrderStoreBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1347321374496945736L;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 订单列表
	 */
	@ApiListField("order_list")
	@ApiField("store_order_d_t_o")
	private List<StoreOrderDTO> orderList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 查询总数量
	 */
	@ApiField("total")
	private Long total;

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setOrderList(List<StoreOrderDTO> orderList) {
		this.orderList = orderList;
	}
	public List<StoreOrderDTO> getOrderList( ) {
		return this.orderList;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
