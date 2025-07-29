package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 变更案件信息
 *
 * @author auto create
 * @since 1.0, 2025-02-20 20:58:38
 */
public class AlipayIserviceCsfuCaseModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7127212693449339713L;

	/**
	 * 案件数据主键id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 修改的信息内容
	 */
	@ApiField("modified_info")
	private String modifiedInfo;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getModifiedInfo() {
		return this.modifiedInfo;
	}
	public void setModifiedInfo(String modifiedInfo) {
		this.modifiedInfo = modifiedInfo;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
