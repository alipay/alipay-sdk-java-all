package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询通话记录详情
 *
 * @author auto create
 * @since 1.0, 2025-10-23 09:55:57
 */
public class AlipayIserviceCcmCrmCallrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3274189362396246152L;

	/**
	 * 当前页码，可选参数，不选默认值为:1
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 线索ID
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * dataId的数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 页大小，可选，默认:10（单位：条）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 租户实例id，必填，智能拓客平台分配
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
