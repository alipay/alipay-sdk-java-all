package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KeyWordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.appkeyword.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 22:57:02
 */
public class AlipayOpenSearchAppkeywordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8895178178655696483L;

	/** 
	 * 审核通过关键词明细
	 */
	@ApiListField("key_word_info")
	@ApiField("key_word_info")
	private List<KeyWordInfo> keyWordInfo;

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
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setKeyWordInfo(List<KeyWordInfo> keyWordInfo) {
		this.keyWordInfo = keyWordInfo;
	}
	public List<KeyWordInfo> getKeyWordInfo( ) {
		return this.keyWordInfo;
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
