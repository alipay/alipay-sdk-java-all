package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动可用人群信息，如人群类型、规则值等
 *
 * @author auto create
 * @since 1.0, 2026-01-04 10:21:01
 */
public class ActivityCrowdInfo extends AlipayObject {

	private static final long serialVersionUID = 4791345439249735618L;

	/**
	 * 人群规则名称
	 */
	@ApiField("crowd_rule_name")
	private String crowdRuleName;

	/**
	 * 可用的人群类型
	 */
	@ApiField("crowd_type")
	private String crowdType;

	/**
	 * 限制可用的企业ID列表，为订购了服务商发布的场景服务的企业。
	 */
	@ApiListField("enterprise_id_list")
	@ApiField("string")
	private List<String> enterpriseIdList;

	/**
	 * 活动限制人群的类型
	 */
	@ApiField("limit_type")
	private String limitType;

	public String getCrowdRuleName() {
		return this.crowdRuleName;
	}
	public void setCrowdRuleName(String crowdRuleName) {
		this.crowdRuleName = crowdRuleName;
	}

	public String getCrowdType() {
		return this.crowdType;
	}
	public void setCrowdType(String crowdType) {
		this.crowdType = crowdType;
	}

	public List<String> getEnterpriseIdList() {
		return this.enterpriseIdList;
	}
	public void setEnterpriseIdList(List<String> enterpriseIdList) {
		this.enterpriseIdList = enterpriseIdList;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

}
