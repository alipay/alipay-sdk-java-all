package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支小助查询用户的会话列表
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:36:09
 */
public class AntfortuneFinresearchSessionListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4267253426814184738L;

	/**
	 * 合作方用户标识
	 */
	@ApiField("bu_unique_id")
	private String buUniqueId;

	/**
	 * 小助分配给用户的租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getBuUniqueId() {
		return this.buUniqueId;
	}
	public void setBuUniqueId(String buUniqueId) {
		this.buUniqueId = buUniqueId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
