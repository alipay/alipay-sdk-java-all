package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 鸣笛信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:39
 */
public class RoboWhistleInfo extends AlipayObject {

	private static final long serialVersionUID = 4879349919383747192L;

	/**
	 * 是否有鸣笛能力，0无，1有
	 */
	@ApiField("whistle_ability")
	private Long whistleAbility;

	public Long getWhistleAbility() {
		return this.whistleAbility;
	}
	public void setWhistleAbility(Long whistleAbility) {
		this.whistleAbility = whistleAbility;
	}

}
