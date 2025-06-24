package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierQueryOpenResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.companysupplier.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 16:27:30
 */
public class AlipayCommerceEcRecyclinginvoiceCompanysupplierQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6111442767838961276L;

	/** 
	 * 当前页实际数据条数
	 */
	@ApiField("curr_page_size")
	private Long currPageSize;

	/** 
	 * 供应商列表信息
	 */
	@ApiListField("data_list")
	@ApiField("supplier_query_open_result")
	private List<SupplierQueryOpenResult> dataList;

	/** 
	 * 页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数量
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setCurrPageSize(Long currPageSize) {
		this.currPageSize = currPageSize;
	}
	public Long getCurrPageSize( ) {
		return this.currPageSize;
	}

	public void setDataList(List<SupplierQueryOpenResult> dataList) {
		this.dataList = dataList;
	}
	public List<SupplierQueryOpenResult> getDataList( ) {
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

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
