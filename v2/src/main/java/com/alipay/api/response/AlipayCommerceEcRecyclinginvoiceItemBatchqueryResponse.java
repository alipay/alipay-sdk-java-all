package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemQueryOpenResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-17 17:32:40
 */
public class AlipayCommerceEcRecyclinginvoiceItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2793556113598894437L;

	/** 
	 * 当前页实际数据条数
	 */
	@ApiField("curr_page_size")
	private Long currPageSize;

	/** 
	 * 当前页的数据
	 */
	@ApiListField("data_list")
	@ApiField("item_query_open_result")
	private List<ItemQueryOpenResult> dataList;

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
	 * 查询到信息的总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrPageSize(Long currPageSize) {
		this.currPageSize = currPageSize;
	}
	public Long getCurrPageSize( ) {
		return this.currPageSize;
	}

	public void setDataList(List<ItemQueryOpenResult> dataList) {
		this.dataList = dataList;
	}
	public List<ItemQueryOpenResult> getDataList( ) {
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
