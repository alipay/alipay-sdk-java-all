package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户渠道列表查询
 *
 * @author auto create
 * @since 1.0, 2022-07-05 14:38:51
 */
public class DatadigitalFincloudFinsaasTenantchannelListBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5657222279976497677L;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
