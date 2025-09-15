package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使用ACID查询通话音转文
 *
 * @author auto create
 * @since 1.0, 2025-04-14 10:58:55
 */
public class AlipayIserviceCcmCrmTtsmessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6318877955441284556L;

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
