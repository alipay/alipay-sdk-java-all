package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LeaseEnrollDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lease.enroll.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:36:42
 */
public class AlipayCommerceLeaseEnrollQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7899393515741265728L;

	/** 
	 * 租赁商报名计划信息列表
	 */
	@ApiListField("enroll_list")
	@ApiField("lease_enroll_d_t_o")
	private List<LeaseEnrollDTO> enrollList;

	/** 
	 * 当前页数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setEnrollList(List<LeaseEnrollDTO> enrollList) {
		this.enrollList = enrollList;
	}
	public List<LeaseEnrollDTO> getEnrollList( ) {
		return this.enrollList;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
