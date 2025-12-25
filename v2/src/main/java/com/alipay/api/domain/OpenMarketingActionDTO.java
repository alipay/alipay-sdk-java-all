package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销行动点
 *
 * @author auto create
 * @since 1.0, 2025-11-06 17:01:31
 */
public class OpenMarketingActionDTO extends AlipayObject {

	private static final long serialVersionUID = 5258332169453639245L;

	/**
	 * 行动点ID
	 */
	@ApiField("action_id")
	private String actionId;

	/**
	 * 行动点名称
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 行动点类型
	 */
	@ApiField("action_type")
	private String actionType;

	public String getActionId() {
		return this.actionId;
	}
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

}
