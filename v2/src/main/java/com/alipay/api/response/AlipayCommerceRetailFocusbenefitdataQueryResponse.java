package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.focusbenefitdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-11 10:07:43
 */
public class AlipayCommerceRetailFocusbenefitdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3556444799122744992L;

	/** 
	 * 返回数据信息
	 */
	@ApiField("data_list")
	private String dataList;

	/** 
	 * 分页查询游标
	 */
	@ApiField("digest")
	private String digest;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 页码
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setDataList(String dataList) {
		this.dataList = dataList;
	}
	public String getDataList( ) {
		return this.dataList;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}
	public String getDigest( ) {
		return this.digest;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
