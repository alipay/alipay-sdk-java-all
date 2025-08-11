package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cstraining.userdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 13:42:35
 */
public class AlipayIserviceCstrainingUserdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3551866749411461336L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 结果数据
	 */
	@ApiField("result_list")
	private String resultList;

	/** 
	 * 总共数据数量
	 */
	@ApiField("total_size")
	private Long totalSize;

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

	public void setResultList(String resultList) {
		this.resultList = resultList;
	}
	public String getResultList( ) {
		return this.resultList;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
