package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExternalBillInfoResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.merchant.externalbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-15 15:33:11
 */
public class AlipayEbppMerchantExternalbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6294747319681354283L;

	/** 
	 * 账单列表
	 */
	@ApiField("external_bill_list")
	private ExternalBillInfoResult externalBillList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/** 
	 * 分页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setExternalBillList(ExternalBillInfoResult externalBillList) {
		this.externalBillList = externalBillList;
	}
	public ExternalBillInfoResult getExternalBillList( ) {
		return this.externalBillList;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Long getPageNumber( ) {
		return this.pageNumber;
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

}
