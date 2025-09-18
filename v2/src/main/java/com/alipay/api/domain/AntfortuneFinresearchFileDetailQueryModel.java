package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支小助获取文件详情
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:36:21
 */
public class AntfortuneFinresearchFileDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6551644492799731874L;

	/**
	 * 合作方的用户唯一标识
	 */
	@ApiField("bu_unique_id")
	private String buUniqueId;

	/**
	 * 文件唯一标识
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 从小助获取的租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getBuUniqueId() {
		return this.buUniqueId;
	}
	public void setBuUniqueId(String buUniqueId) {
		this.buUniqueId = buUniqueId;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
