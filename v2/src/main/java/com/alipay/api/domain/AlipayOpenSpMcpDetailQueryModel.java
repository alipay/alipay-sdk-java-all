package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代商户MCP接口详情查询
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpMcpDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2718959184798373651L;

	/**
	 * MCP能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * MCP版本号，不传默认查询最新版本的
	 */
	@ApiField("ability_version")
	private String abilityVersion;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getAbilityVersion() {
		return this.abilityVersion;
	}
	public void setAbilityVersion(String abilityVersion) {
		this.abilityVersion = abilityVersion;
	}

}
