package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LivestreamOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.livestream.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-17 17:26:46
 */
public class AlipayCommerceLivestreamOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4889837225825558433L;

	/** 
	 * 订单列表
	 */
	@ApiListField("contents")
	@ApiField("livestream_order")
	private List<LivestreamOrder> contents;

	/** 
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 订单总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setContents(List<LivestreamOrder> contents) {
		this.contents = contents;
	}
	public List<LivestreamOrder> getContents( ) {
		return this.contents;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
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
