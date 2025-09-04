package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubServiceKeyWordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.subservicekeyword.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:17:37
 */
public class AlipayOpenSearchSubservicekeywordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2569312372864179964L;

	/** 
	 * 第几页
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 关键词明细
	 */
	@ApiListField("subservice_keyword_info")
	@ApiField("sub_service_key_word_info")
	private List<SubServiceKeyWordInfo> subserviceKeywordInfo;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

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

	public void setSubserviceKeywordInfo(List<SubServiceKeyWordInfo> subserviceKeywordInfo) {
		this.subserviceKeywordInfo = subserviceKeywordInfo;
	}
	public List<SubServiceKeyWordInfo> getSubserviceKeywordInfo( ) {
		return this.subserviceKeywordInfo;
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
