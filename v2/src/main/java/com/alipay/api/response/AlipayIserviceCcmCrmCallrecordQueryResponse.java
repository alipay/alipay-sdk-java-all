package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CallRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.callrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-05 17:12:41
 */
public class AlipayIserviceCcmCrmCallrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2218425341796491412L;

	/** 
	 * 通话记录列表
	 */
	@ApiListField("call_record_list")
	@ApiField("call_record")
	private List<CallRecord> callRecordList;

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

	public void setCallRecordList(List<CallRecord> callRecordList) {
		this.callRecordList = callRecordList;
	}
	public List<CallRecord> getCallRecordList( ) {
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
