package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ThirdPartyRefundExceptionOrderList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.thirdparty.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 10:47:56
 */
public class AlipayMarketingThirdpartyRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3463739232337624569L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 订单列表
	 */
	@ApiField("query_result_list")
	private ThirdPartyRefundExceptionOrderList queryResultList;

	/** 
	 * 去重后的订单总数
	 */
	@ApiField("total_count")
	private Long totalCount;

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

	public void setQueryResultList(ThirdPartyRefundExceptionOrderList queryResultList) {
		this.queryResultList = queryResultList;
	}
	public ThirdPartyRefundExceptionOrderList getQueryResultList( ) {
		return this.queryResultList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
