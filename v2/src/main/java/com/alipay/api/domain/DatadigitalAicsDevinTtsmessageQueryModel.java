package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户查询线索有关的文本
 *
 * @author auto create
 * @since 1.0, 2026-05-26 10:52:46
 */
public class DatadigitalAicsDevinTtsmessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6574911121178669474L;

	/**
	 * 通话ID，从通话记录中获取
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
