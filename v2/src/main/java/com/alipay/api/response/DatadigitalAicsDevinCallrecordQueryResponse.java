package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DtCallRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.callrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 10:49:29
 */
public class DatadigitalAicsDevinCallrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4493449143538517713L;

	/** 
	 * null
	 */
	@ApiListField("call_record_list")
	@ApiField("dt_call_record")
	private List<DtCallRecord> callRecordList;

	/** 
	 * 页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 页大小（单位：条）
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setCallRecordList(List<DtCallRecord> callRecordList) {
		this.callRecordList = callRecordList;
	}
	public List<DtCallRecord> getCallRecordList( ) {
		return this.callRecordList;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
