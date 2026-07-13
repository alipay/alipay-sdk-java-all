package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceTailPaymentOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.tailpayment.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-05 17:32:56
 */
public class AlipayCommerceMerchantcardTailpaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6691856168494533711L;

	/** 
	 * null
	 */
	@ApiListField("content")
	@ApiField("life_service_tail_payment_order")
	private List<LifeServiceTailPaymentOrder> content;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setContent(List<LifeServiceTailPaymentOrder> content) {
		this.content = content;
	}
	public List<LifeServiceTailPaymentOrder> getContent( ) {
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
