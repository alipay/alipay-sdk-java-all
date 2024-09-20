package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义规则删除请求
 *
 * @author auto create
 * @since 1.0, 2023-02-20 19:09:45
 */
public class CommercializationDeleteRuleReq extends AlipayObject {

	private static final long serialVersionUID = 1682839961645537238L;

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
	 * 所属场景编码
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
