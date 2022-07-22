package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户渠道列表查询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 23:01:13
 */
public class DatadigitalFincloudFinsaasTenantchannelListBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7693399894921778864L;

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
