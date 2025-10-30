package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LearnCenterContentInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.learncenter.contentinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-06 13:47:22
 */
public class AlipayOpenMiniLearncenterContentinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2788833989359655676L;

	/** 
	 * 学习中心内容信息列表
	 */
	@ApiField("data_list")
	private LearnCenterContentInfo dataList;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setDataList(LearnCenterContentInfo dataList) {
		this.dataList = dataList;
	}
	public LearnCenterContentInfo getDataList( ) {
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
