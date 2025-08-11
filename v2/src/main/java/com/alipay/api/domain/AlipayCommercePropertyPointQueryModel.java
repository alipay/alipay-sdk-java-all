package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点位查询接口
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class AlipayCommercePropertyPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2244559198672979314L;

	/**
	 * 项目ID
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 点位名称
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
