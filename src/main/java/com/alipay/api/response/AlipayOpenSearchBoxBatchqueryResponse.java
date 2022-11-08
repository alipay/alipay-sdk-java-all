package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SearchBoxBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.box.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-09 11:08:40
 */
public class AlipayOpenSearchBoxBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3283633733266235133L;

	/** 
	 * 搜索直达基础信息
	 */
	@ApiListField("box_infos")
	@ApiField("search_box_basic_info")
	private List<SearchBoxBasicInfo> boxInfos;

	/** 
	 * 当前页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

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

	public void setBoxInfos(List<SearchBoxBasicInfo> boxInfos) {
		this.boxInfos = boxInfos;
	}
	public List<SearchBoxBasicInfo> getBoxInfos( ) {
		return this.boxInfos;
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
