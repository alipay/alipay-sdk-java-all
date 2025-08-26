package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeductionOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.deductionorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 11:12:30
 */
public class AlipayCommerceMerchantcardDeductionorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1232698474572424346L;

	/** 
	 * 返回内容
	 */
	@ApiListField("content")
	@ApiField("deduction_order_info")
	private List<DeductionOrderInfo> content;

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

	public void setContent(List<DeductionOrderInfo> content) {
		this.content = content;
	}
	public List<DeductionOrderInfo> getContent( ) {
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
