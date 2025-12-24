package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrderMemoDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.ordermemo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-10 10:52:30
 */
public class AlipayCommerceMerchantcardOrdermemoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7618625628417273491L;

	/** 
	 * 订单备注分页记录
	 */
	@ApiField("content")
	private OrderMemoDetail content;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setContent(OrderMemoDetail content) {
		this.content = content;
	}
	public OrderMemoDetail getContent( ) {
		return this.content;
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

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
