package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支小助预设专家框架列表
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:34:38
 */
public class AntfortuneFinresearchExpertframeworkListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4179111767491813358L;

	/**
	 * 分配给调用方的唯一id用于鉴权等操作，请勿转给别人
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
