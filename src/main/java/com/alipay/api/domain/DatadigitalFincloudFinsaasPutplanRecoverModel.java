package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 恢复投放计划
 *
 * @author auto create
 * @since 1.0, 2022-07-21 17:28:01
 */
public class DatadigitalFincloudFinsaasPutplanRecoverModel extends AlipayObject {

	private static final long serialVersionUID = 5168888552222955853L;

	/**
	 * 操作人 id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 投放计划主键 id
	 */
	@ApiField("put_plan_id")
	private Long putPlanId;

	/**
	 * 租户 code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Long getPutPlanId() {
		return this.putPlanId;
	}
	public void setPutPlanId(Long putPlanId) {
		this.putPlanId = putPlanId;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
