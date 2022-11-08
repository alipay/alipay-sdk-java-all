package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建odps人群
 *
 * @author auto create
 * @since 1.0, 2022-05-26 13:58:36
 */
public class DatadigitalFincloudFinsaasCrowdOdpsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1724472547424677374L;

	/**
	 * 人群基本信息
	 */
	@ApiField("crowd_base_info_dto")
	private CrowdBaseInfoDTO crowdBaseInfoDto;

	/**
	 * 操作人员ID+唯一+创建ODPS人群
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人员名称+不唯一+创建ODPS人群
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 机构名称+不唯一+创建ODPS人群
	 */
	@ApiField("organization")
	private String organization;

	/**
	 * 租户Code+唯一+创建ODPS人群
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public CrowdBaseInfoDTO getCrowdBaseInfoDto() {
		return this.crowdBaseInfoDto;
	}
	public void setCrowdBaseInfoDto(CrowdBaseInfoDTO crowdBaseInfoDto) {
		this.crowdBaseInfoDto = crowdBaseInfoDto;
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
