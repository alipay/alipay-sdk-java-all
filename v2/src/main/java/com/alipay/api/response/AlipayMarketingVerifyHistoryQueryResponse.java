package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AplusVerifyDetailList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.verify.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-02 19:42:50
 */
public class AlipayMarketingVerifyHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3596168689667752119L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private String totalCount;

	/** 
	 * 核销明细列表
	 */
	@ApiField("verify_list")
	private AplusVerifyDetailList verifyList;

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

	public void setVerifyList(AplusVerifyDetailList verifyList) {
		this.verifyList = verifyList;
	}
	public AplusVerifyDetailList getVerifyList( ) {
		return this.verifyList;
	}

}
