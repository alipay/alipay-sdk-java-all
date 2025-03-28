package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手房批量查询
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:26
 */
public class AlipayCommerceHousingHouseSaleBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5799693142135426695L;

	/**
	 * 小区id
	 */
	@ApiField("community_id")
	private String communityId;

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

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
