package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户查询线索有关的录音
 *
 * @author auto create
 * @since 1.0, 2026-05-26 10:49:29
 */
public class DatadigitalAicsDevinOneaudioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5748642965247757296L;

	/**
	 * acid，从通话记录获取
	 */
	@ApiField("acid")
	private String acid;

	/**
	 * 租户实例id，必填，智能拓客平台分配
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getAcid() {
		return this.acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
