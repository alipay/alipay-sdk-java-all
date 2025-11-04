package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OfflineLaborProjectJob;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.offlinelabor.project.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-23 20:47:40
 */
public class AlipayEbppIndustryOfflinelaborProjectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1251683772874669214L;

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
	 * null
	 */
	@ApiListField("record_list")
	@ApiField("offline_labor_project_job")
	private List<OfflineLaborProjectJob> recordList;

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

	public void setRecordList(List<OfflineLaborProjectJob> recordList) {
		this.recordList = recordList;
	}
	public List<OfflineLaborProjectJob> getRecordList( ) {
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
