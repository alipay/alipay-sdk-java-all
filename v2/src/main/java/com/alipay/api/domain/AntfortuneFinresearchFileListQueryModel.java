package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户上传的文件列表
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:35:01
 */
public class AntfortuneFinresearchFileListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2271275216885162652L;

	/**
	 * 合作方用户标识
	 */
	@ApiField("bu_unique_id")
	private String buUniqueId;

	/**
	 * tenant_id
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
