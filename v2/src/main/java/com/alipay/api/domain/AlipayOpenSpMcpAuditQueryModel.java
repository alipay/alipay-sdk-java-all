package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代商户MCP审核结果查询
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpMcpAuditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3679554682541697586L;

	/**
	 * MCP能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

}
