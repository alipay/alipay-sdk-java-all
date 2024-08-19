package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AnxinItemSellOrderDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.anxinitemsellorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-18 14:42:04
 */
public class AlipayOpenMiniOrderAnxinitemsellorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4855717854681355793L;

	/** 
	 * 是否有下一页，true代表有，false代表没有，如果有下一页，使用page_token翻到下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 售卖明细列表
	 */
	@ApiListField("order_list")
	@ApiField("anxin_item_sell_order_detail_response")
	private List<AnxinItemSellOrderDetailResponse> orderList;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 下一页需要携带参数查询
	 */
	@ApiField("page_token")
	private String pageToken;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setOrderList(List<AnxinItemSellOrderDetailResponse> orderList) {
		this.orderList = orderList;
	}
	public List<AnxinItemSellOrderDetailResponse> getOrderList( ) {
		return this.orderList;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	public String getPageToken( ) {
		return this.pageToken;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
