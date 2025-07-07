package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.misetorder.orderno.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 20:53:02
 */
public class AlipayCommerceMedicalMisetorderOrdernoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2895521674497913572L;

	/** 
	 * 订单号
	 */
	@ApiListField("data")
	@ApiField("number")
	private List<Long> data;

	/** 
	 * 是：有下一页，否：无下一页数据
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 页码，默认1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页显示多少条，默认为20,最大100,取值范围：[20,100]
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setData(List<Long> data) {
		this.data = data;
	}
	public List<Long> getData( ) {
		return this.data;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
