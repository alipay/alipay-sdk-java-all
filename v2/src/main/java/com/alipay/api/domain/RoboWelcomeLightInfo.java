package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 迎宾灯信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:40
 */
public class RoboWelcomeLightInfo extends AlipayObject {

	private static final long serialVersionUID = 1118317416877418714L;

	/**
	 * 是否有迎宾灯能力，0无，1有
	 */
	@ApiField("light_ability")
	private Long lightAbility;

	/**
	 * 迎宾灯颜色
	 */
	@ApiField("light_color")
	private String lightColor;

	public Long getLightAbility() {
		return this.lightAbility;
	}
	public void setLightAbility(Long lightAbility) {
		this.lightAbility = lightAbility;
	}

	public String getLightColor() {
		return this.lightColor;
	}
	public void setLightColor(String lightColor) {
		this.lightColor = lightColor;
	}

}
