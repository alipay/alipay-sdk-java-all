package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版实例查询
 *
 * @author auto create
 * @since 1.0, 2023-02-08 10:35:06
 */
public class AlipayFincoreComplianceTemplateInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3859247158664478835L;

	/**
	 * 模版业务实例id
	 */
	@ApiField("biz_instance_id")
	private String bizInstanceId;

	/**
	 * 系统来源
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBizInstanceId() {
		return this.bizInstanceId;
	}
	public void setBizInstanceId(String bizInstanceId) {
		this.bizInstanceId = bizInstanceId;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
