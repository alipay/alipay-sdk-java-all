package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndirectMerchantProcessorResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.indirectmerchant.page.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-10 10:35:47
 */
public class AlipayCommerceIndirectmerchantPageBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4574193479988625871L;

	/** 
	 * 结果
	 */
	@ApiListField("content")
	@ApiField("indirect_merchant_processor_response")
	private List<IndirectMerchantProcessorResponse> content;

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

	public void setContent(List<IndirectMerchantProcessorResponse> content) {
		this.content = content;
	}
	public List<IndirectMerchantProcessorResponse> getContent( ) {
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
