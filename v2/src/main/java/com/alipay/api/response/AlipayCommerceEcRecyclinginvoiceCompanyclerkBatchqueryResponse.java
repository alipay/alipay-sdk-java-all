package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CompanyClerkQueryOpenResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.companyclerk.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-27 18:00:02
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyclerkBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1863217212786971562L;

	/** 
	 * 当前页实际数据条数
	 */
	@ApiField("curr_page_size")
	private Long currPageSize;

	/** 
	 * 营业员列表信息
	 */
	@ApiListField("data_list")
	@ApiField("company_clerk_query_open_result")
	private List<CompanyClerkQueryOpenResult> dataList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数量（条）
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrPageSize(Long currPageSize) {
		this.currPageSize = currPageSize;
	}
	public Long getCurrPageSize( ) {
		return this.currPageSize;
	}

	public void setDataList(List<CompanyClerkQueryOpenResult> dataList) {
		this.dataList = dataList;
	}
	public List<CompanyClerkQueryOpenResult> getDataList( ) {
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
