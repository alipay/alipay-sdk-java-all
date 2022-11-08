package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据code查询最新编辑版信息
 *
 * @author auto create
 * @since 1.0, 2022-10-10 15:23:56
 */
public class DatadigitalFincloudFinsaasDesignPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5585515266659266433L;

	/**
	 * 页面code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
