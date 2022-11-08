package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建标签圈人
 *
 * @author auto create
 * @since 1.0, 2022-05-26 09:36:53
 */
public class DatadigitalFincloudFinsaasCrowdTagCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3117531868491564962L;

	/**
	 * 操作人ID+唯一
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人名称+不唯一
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 机构名称+不唯一
	 */
	@ApiField("organization")
	private String organization;

	/**
	 * 标签圈人人群基本信息+不唯一
	 */
	@ApiField("tag_rule_crowd_dto")
	private TagRuleCrowdDTO tagRuleCrowdDto;

	/**
	 * 租户Code+唯一
	 */
	@ApiField("tenant_code")
	private String tenantCode;

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

	public TagRuleCrowdDTO getTagRuleCrowdDto() {
		return this.tagRuleCrowdDto;
	}
	public void setTagRuleCrowdDto(TagRuleCrowdDTO tagRuleCrowdDto) {
		this.tagRuleCrowdDto = tagRuleCrowdDto;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
