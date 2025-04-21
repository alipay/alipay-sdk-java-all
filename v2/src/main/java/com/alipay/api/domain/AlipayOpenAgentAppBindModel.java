package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定智能体ID
 *
 * @author auto create
 * @since 1.0, 2025-04-11 10:19:56
 */
public class AlipayOpenAgentAppBindModel extends AlipayObject {

	private static final long serialVersionUID = 6557226334253138154L;

	/**
	 * 智能体code
	 */
	@ApiField("app_agentcode")
	private String appAgentcode;

	public String getAppAgentcode() {
		return this.appAgentcode;
	}
	public void setAppAgentcode(String appAgentcode) {
		this.appAgentcode = appAgentcode;
	}

}
