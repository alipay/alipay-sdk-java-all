package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 座椅加热
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:40
 */
public class RoboSeatHeatingInfo extends AlipayObject {

	private static final long serialVersionUID = 4129456937263389122L;

	/**
	 * 座椅加热档位信息
	 */
	@ApiField("current_level")
	private RoboCurrentLevel currentLevel;

	/**
	 * 是否有座椅加热能力，0无，1有
	 */
	@ApiField("heating_ability")
	private Long heatingAbility;

	public RoboCurrentLevel getCurrentLevel() {
		return this.currentLevel;
	}
	public void setCurrentLevel(RoboCurrentLevel currentLevel) {
		this.currentLevel = currentLevel;
	}

	public Long getHeatingAbility() {
		return this.heatingAbility;
	}
	public void setHeatingAbility(Long heatingAbility) {
		this.heatingAbility = heatingAbility;
	}

}
