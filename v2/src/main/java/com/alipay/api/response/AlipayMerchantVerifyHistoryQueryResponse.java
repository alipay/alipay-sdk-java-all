package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupBuyVerifyDetailList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.verify.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-11 01:22:45
 */
public class AlipayMerchantVerifyHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3377789127597426764L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 核销明细列表
	 */
	@ApiField("verify_list")
	private GroupBuyVerifyDetailList verifyList;

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

	public void setVerifyList(GroupBuyVerifyDetailList verifyList) {
		this.verifyList = verifyList;
	}
	public GroupBuyVerifyDetailList getVerifyList( ) {
		return this.verifyList;
	}

}
