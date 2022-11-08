package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AuthorityDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.authority.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 10:14:19
 */
public class AlipayCommerceOperationTimescardAuthorityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2841195181211975248L;

	/** 
	 * 详情
	 */
	@ApiListField("data_list")
	@ApiField("authority_detail_response")
	private List<AuthorityDetailResponse> dataList;

	/** 
	 * 返回list对应的页码, 从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 返回list对应的页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总共的查询页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总共的查询记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setDataList(List<AuthorityDetailResponse> dataList) {
		this.dataList = dataList;
	}
	public List<AuthorityDetailResponse> getDataList( ) {
		return this.dataList;
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
