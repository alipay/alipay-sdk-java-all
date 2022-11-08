package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SearchBoxActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.boxactivity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-09 11:07:27
 */
public class AlipayOpenSearchBoxactivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1141675672754566178L;

	/** 
	 * 活动明细列表
	 */
	@ApiListField("models")
	@ApiField("search_box_activity")
	private List<SearchBoxActivity> models;

	/** 
	 * 当前页码
	 */
	@ApiField("page_number")
	private String pageNumber;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setModels(List<SearchBoxActivity> models) {
		this.models = models;
	}
	public List<SearchBoxActivity> getModels( ) {
		return this.models;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getPageNumber( ) {
		return this.pageNumber;
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

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
