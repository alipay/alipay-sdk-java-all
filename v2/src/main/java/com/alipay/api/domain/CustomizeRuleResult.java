package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规则配置返回结果
 *
 * @author auto create
 * @since 1.0, 2023-02-20 15:50:27
 */
public class CustomizeRuleResult extends AlipayObject {

	private static final long serialVersionUID = 2143964487412349363L;

	/**
	 * 提交唯一标识，幂等性验证
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 规则编码
	 */
	@ApiField("rule_code")
	private String ruleCode;

	/**
	 * 规则状态
	 */
	@ApiField("rule_status")
	private String ruleStatus;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleStatus() {
		return this.ruleStatus;
	}
	public void setRuleStatus(String ruleStatus) {
		this.ruleStatus = ruleStatus;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
