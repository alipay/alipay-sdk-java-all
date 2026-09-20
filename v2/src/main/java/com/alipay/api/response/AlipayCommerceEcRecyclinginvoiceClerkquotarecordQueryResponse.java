package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ClerkQuotaRecordQueryOpenResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.clerkquotarecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 10:02:51
 */
public class AlipayCommerceEcRecyclinginvoiceClerkquotarecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5633331989874738488L;

	/** 
	 * 当前页实际数据条数
	 */
	@ApiField("curr_page_size")
	private Long currPageSize;

	/** 
	 * 变更明细列表
	 */
	@ApiListField("data_list")
	@ApiField("clerk_quota_record_query_open_result")
	private List<ClerkQuotaRecordQueryOpenResult> dataList;

	/** 
	 * 页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小，单位：条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数量，单位：条
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrPageSize(Long currPageSize) {
		this.currPageSize = currPageSize;
	}
	public Long getCurrPageSize( ) {
		return this.currPageSize;
	}

	public void setDataList(List<ClerkQuotaRecordQueryOpenResult> dataList) {
		this.dataList = dataList;
	}
	public List<ClerkQuotaRecordQueryOpenResult> getDataList( ) {
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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
