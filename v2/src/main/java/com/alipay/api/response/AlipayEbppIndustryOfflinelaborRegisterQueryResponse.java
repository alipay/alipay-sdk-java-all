package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OfflineLaborProjectRegistRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.offlinelabor.register.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-17 14:32:50
 */
public class AlipayEbppIndustryOfflinelaborRegisterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5273668865185682435L;

	/** 
	 * 页码（从 1 开始）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页面记录（最大 50 ）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 项目登记记录
	 */
	@ApiField("record_list")
	private OfflineLaborProjectRegistRecord recordList;

	/** 
	 * 匹配总记录数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 匹配总页码数
	 */
	@ApiField("total_page")
	private Long totalPage;

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

	public void setRecordList(OfflineLaborProjectRegistRecord recordList) {
		this.recordList = recordList;
	}
	public OfflineLaborProjectRegistRecord getRecordList( ) {
		return this.recordList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
