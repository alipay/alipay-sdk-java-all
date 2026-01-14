package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OfflineLaborProjectRegistRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.offlinelabor.register.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-09 11:22:41
 */
public class AlipayEbppIndustryOfflinelaborRegisterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1123137135589226613L;

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
	@ApiField("offline_labor_project_regist_record")
	private List<OfflineLaborProjectRegistRecord> recordList;

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

	public void setRecordList(List<OfflineLaborProjectRegistRecord> recordList) {
		this.recordList = recordList;
	}
	public List<OfflineLaborProjectRegistRecord> getRecordList( ) {
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
