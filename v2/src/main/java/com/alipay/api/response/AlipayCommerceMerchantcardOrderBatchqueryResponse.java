package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CardOrderBatchQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-18 10:47:01
 */
public class AlipayCommerceMerchantcardOrderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7356177854774165116L;

	/** 
	 * 订购分页信息
	 */
	@ApiListField("content")
	@ApiField("card_order_batch_query_response")
	private List<CardOrderBatchQueryResponse> content;

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
	 * 总记录条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setContent(List<CardOrderBatchQueryResponse> content) {
		this.content = content;
	}
	public List<CardOrderBatchQueryResponse> getContent( ) {
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
