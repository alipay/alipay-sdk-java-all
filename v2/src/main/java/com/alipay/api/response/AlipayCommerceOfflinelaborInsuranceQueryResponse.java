package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OfflineLaborInsurancePolicy;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.offlinelabor.insurance.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 15:42:50
 */
public class AlipayCommerceOfflinelaborInsuranceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7195733518961934623L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * null
	 */
	@ApiListField("policys")
	@ApiField("offline_labor_insurance_policy")
	private List<OfflineLaborInsurancePolicy> policys;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setPolicys(List<OfflineLaborInsurancePolicy> policys) {
		this.policys = policys;
	}
	public List<OfflineLaborInsurancePolicy> getPolicys( ) {
		return this.policys;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
