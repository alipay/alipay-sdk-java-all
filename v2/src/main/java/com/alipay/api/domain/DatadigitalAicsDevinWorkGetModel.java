package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取指定数字员工详情
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:06
 */
public class DatadigitalAicsDevinWorkGetModel extends AlipayObject {

	private static final long serialVersionUID = 2447799183773664792L;

	/**
	 * 数字人标识code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 变量分页当前页码，默认1
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 变量分页每页条数，默认100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
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
