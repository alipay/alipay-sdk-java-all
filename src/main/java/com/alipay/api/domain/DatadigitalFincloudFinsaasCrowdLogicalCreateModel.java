package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建逻辑规则圈人
 *
 * @author auto create
 * @since 1.0, 2022-08-03 16:33:47
 */
public class DatadigitalFincloudFinsaasCrowdLogicalCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1379114629663545492L;

	/**
	 * 逻辑圈人人群基本信息+不唯一
	 */
	@ApiField("logical_rule_crowd_dto")
	private LogicalRuleCrowdDTO logicalRuleCrowdDto;

	/**
	 * 操作人ID+唯一
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人姓名+不唯一
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 机构名称+不唯一
	 */
	@ApiField("organization")
	private String organization;

	/**
	 * 租户Code+唯一
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public LogicalRuleCrowdDTO getLogicalRuleCrowdDto() {
		return this.logicalRuleCrowdDto;
	}
	public void setLogicalRuleCrowdDto(LogicalRuleCrowdDTO logicalRuleCrowdDto) {
		this.logicalRuleCrowdDto = logicalRuleCrowdDto;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOrganization() {
		return this.organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
