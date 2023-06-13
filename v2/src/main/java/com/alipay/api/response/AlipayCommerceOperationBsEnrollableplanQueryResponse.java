package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BsEnrollablePlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bs.enrollableplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:46:54
 */
public class AlipayCommerceOperationBsEnrollableplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8682769374975311894L;

	/** 
	 * 可报名计划列表
	 */
	@ApiListField("enroll_list")
	@ApiField("bs_enrollable_plan")
	private List<BsEnrollablePlan> enrollList;

	/** 
	 * 分页页码，从1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询数据总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setEnrollList(List<BsEnrollablePlan> enrollList) {
		this.enrollList = enrollList;
	}
	public List<BsEnrollablePlan> getEnrollList( ) {
		return this.enrollList;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
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
