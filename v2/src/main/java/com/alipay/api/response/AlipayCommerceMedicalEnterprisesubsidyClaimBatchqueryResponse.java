package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnterpriceSubsidyData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.enterprisesubsidy.claim.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 10:22:36
 */
public class AlipayCommerceMedicalEnterprisesubsidyClaimBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5123589821127342722L;

	/** 
	 * 报销数据
	 */
	@ApiListField("data")
	@ApiField("enterprice_subsidy_data")
	private List<EnterpriceSubsidyData> data;

	/** 
	 * 当前页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页数量
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

	public void setData(List<EnterpriceSubsidyData> data) {
		this.data = data;
	}
	public List<EnterpriceSubsidyData> getData( ) {
		return this.data;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
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
