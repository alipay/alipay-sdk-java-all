package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道投放计划列表查询
 *
 * @author auto create
 * @since 1.0, 2022-07-05 14:39:49
 */
public class DatadigitalFincloudFinsaasPutplanListBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3346529172238968797L;

	/**
	 * 投放计划名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分页参数
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页参数
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 投放计划状态码
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户码，对应门户 SaaS 系统上一个唯一的租户
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	/**
	 * 用户 id
	 */
	@ApiField("user_id")
	private String userId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
