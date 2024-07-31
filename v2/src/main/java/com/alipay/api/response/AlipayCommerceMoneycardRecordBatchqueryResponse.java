package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MoneyCardUseRecordDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.moneycard.record.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 14:27:04
 */
public class AlipayCommerceMoneycardRecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4415777897496848588L;

	/** 
	 * 金额卡使用记录详情
	 */
	@ApiField("content")
	private MoneyCardUseRecordDetail content;

	/** 
	 * 页码，单位页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小，单位条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数，单位页
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总记录条数，单位条
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setContent(MoneyCardUseRecordDetail content) {
		this.content = content;
	}
	public MoneyCardUseRecordDetail getContent( ) {
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
