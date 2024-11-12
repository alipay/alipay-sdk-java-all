package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询租户产品列表
 *
 * @author auto create
 * @since 1.0, 2024-08-21 17:17:06
 */
public class DatadigitalFincloudFinsaasInsuranceOutproductlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1322278172561755276L;

	/**
	 * 实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 外部租户id
	 */
	@ApiField("out_tenant_id")
	private String outTenantId;

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getOutTenantId() {
		return this.outTenantId;
	}
	public void setOutTenantId(String outTenantId) {
		this.outTenantId = outTenantId;
	}

}
