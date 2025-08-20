package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.brand.asset.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-01 11:33:10
 */
public class AntMerchantExpandBrandAssetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1219514258563493181L;

	/** 
	 * 资产ID集合
	 */
	@ApiListField("list")
	@ApiField("string")
	private List<String> list;

	/** 
	 * 页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/** 
	 * 单页行数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总行数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setList(List<String> list) {
		this.list = list;
	}
	public List<String> getList( ) {
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
