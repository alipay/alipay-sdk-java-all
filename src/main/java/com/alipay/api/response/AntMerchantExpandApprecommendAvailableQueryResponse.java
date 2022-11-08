package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.apprecommend.available.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 12:09:47
 */
public class AntMerchantExpandApprecommendAvailableQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7836458996476373229L;

	/** 
	 * 总页数
	 */
	@ApiListField("list")
	@ApiField("string")
	private List<String> list;

	/** 
	 * 当前页码
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
