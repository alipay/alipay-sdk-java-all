package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新建会话
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:34:52
 */
public class AntfortuneFinresearchSessionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5593858967536161427L;

	/**
	 * 合作方内部的用户体系用户信息
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
