package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas根据id查询页面详情
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:57:07
 */
public class DatadigitalFincloudFinsaasDesignPageGetModel extends AlipayObject {

	private static final long serialVersionUID = 5384595137125855498L;

	/**
	 * 数据库id
	 */
	@ApiField("page_id")
	private Long pageId;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public Long getPageId() {
		return this.pageId;
	}
	public void setPageId(Long pageId) {
		this.pageId = pageId;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
