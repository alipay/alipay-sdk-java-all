package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代商户SKILL审核结果查询
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class AlipayOpenSpSkillAuditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8444831163237593453L;

	/**
	 * SKILL能力编码code
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
