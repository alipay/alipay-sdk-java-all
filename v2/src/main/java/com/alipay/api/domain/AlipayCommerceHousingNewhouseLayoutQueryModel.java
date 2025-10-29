package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新房户型查询接口
 *
 * @author auto create
 * @since 1.0, 2025-05-19 10:42:31
 */
public class AlipayCommerceHousingNewhouseLayoutQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6539292313748973252L;

	/**
	 * 楼盘id
	 */
	@ApiField("estate_project_id")
	private String estateProjectId;

	/**
	 * 外部户型id
	 */
	@ApiField("external_id")
	private String externalId;

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

	public String getEstateProjectId() {
		return this.estateProjectId;
	}
	public void setEstateProjectId(String estateProjectId) {
		this.estateProjectId = estateProjectId;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
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
