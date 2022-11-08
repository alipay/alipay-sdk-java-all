package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询交互式风控用户交互记录
 *
 * @author auto create
 * @since 1.0, 2022-10-28 10:37:57
 */
public class AlipaySecurityDataInteractiverecordListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7599389244441122426L;

	/**
	 * 起始值为1，若参数值<=0，则交互式风控侧取默认值1
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 过滤参数，JSON格式
	 */
	@ApiField("filter_params")
	private String filterParams;

	/**
	 * 若参数值<=0，则交互式风控侧取默认值10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getFilterParams() {
		return this.filterParams;
	}
	public void setFilterParams(String filterParams) {
		this.filterParams = filterParams;
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
