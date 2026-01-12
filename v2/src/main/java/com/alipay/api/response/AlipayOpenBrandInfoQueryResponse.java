package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BrandQueryOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.brand.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class AlipayOpenBrandInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5559716988973324952L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("brand_query_open_api_result")
	private List<BrandQueryOpenApiResult> list;

	/** 
	 * 页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总数，单位ti
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setList(List<BrandQueryOpenApiResult> list) {
		this.list = list;
	}
	public List<BrandQueryOpenApiResult> getList( ) {
		return this.list;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Long getPageNumber( ) {
		return this.pageNumber;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
