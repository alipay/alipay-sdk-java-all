package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CompanyItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.industryinvoice.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:12:37
 */
public class AlipayCommerceEcIndustryinvoiceItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6853336718522278259L;

	/** 
	 * 当前页实际数据大小
	 */
	@ApiField("curr_page_size")
	private Long currPageSize;

	/** 
	 * 当前页的数据
	 */
	@ApiListField("data_list")
	@ApiField("company_item")
	private List<CompanyItem> dataList;

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
	 * 返回的数据总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrPageSize(Long currPageSize) {
		this.currPageSize = currPageSize;
	}
	public Long getCurrPageSize( ) {
		return this.currPageSize;
	}

	public void setDataList(List<CompanyItem> dataList) {
		this.dataList = dataList;
	}
	public List<CompanyItem> getDataList( ) {
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
