package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加实例规则
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:52:00
 */
public class DatadigitalFincloudFinsaasInsuranceInstanceruleSaveModel extends AlipayObject {

	private static final long serialVersionUID = 1519662993898336989L;

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

	/**
	 * 外部产品id
	 */
	@ApiField("outer_product_id")
	private String outerProductId;

	/**
	 * 规则列表
	 */
	@ApiListField("rule_items")
	@ApiField("rule_v_o")
	private List<RuleVO> ruleItems;

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

	public String getOuterProductId() {
		return this.outerProductId;
	}
	public void setOuterProductId(String outerProductId) {
		this.outerProductId = outerProductId;
	}

	public List<RuleVO> getRuleItems() {
		return this.ruleItems;
	}
	public void setRuleItems(List<RuleVO> ruleItems) {
		this.ruleItems = ruleItems;
	}

}
