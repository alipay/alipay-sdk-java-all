package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DepositQueryOpenResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.deposit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-29 10:52:50
 */
public class AlipayCommerceEcRecyclinginvoiceDepositQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1656175287124432378L;

	/** 
	 * 当前页实际数据条数
	 */
	@ApiField("curr_page_size")
	private Long currPageSize;

	/** 
	 * 待入账订单信息
	 */
	@ApiField("data_list")
	private DepositQueryOpenResult dataList;

	/** 
	 * 页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小，条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数量，条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrPageSize(Long currPageSize) {
		this.currPageSize = currPageSize;
	}
	public Long getCurrPageSize( ) {
		return this.currPageSize;
	}

	public void setDataList(DepositQueryOpenResult dataList) {
		this.dataList = dataList;
	}
	public DepositQueryOpenResult getDataList( ) {
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
