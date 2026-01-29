package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车前灯信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:39
 */
public class RoboFrontLightInfo extends AlipayObject {

	private static final long serialVersionUID = 2743529479937116418L;

	/**
	 * 当前车前灯的类型，枚举1-6，为0则是没开启
	 */
	@ApiField("current_type")
	private Long currentType;

	/**
	 * 车前灯动画视频url
	 */
	@ApiField("gif_in")
	private String gifIn;

	/**
	 * 车前灯动画视频url
	 */
	@ApiField("gif_out")
	private String gifOut;

	/**
	 * 是否有车前灯能力，0无，1有
	 */
	@ApiField("light_ability")
	private Long lightAbility;

	/**
	 * 最近一次设置的版本号
	 */
	@ApiField("light_version")
	private Long lightVersion;

	/**
	 * 剩余修改次数
	 */
	@ApiField("remain_modify_num")
	private Long remainModifyNum;

	public Long getCurrentType() {
		return this.currentType;
	}
	public void setCurrentType(Long currentType) {
		this.currentType = currentType;
	}

	public String getGifIn() {
		return this.gifIn;
	}
	public void setGifIn(String gifIn) {
		this.gifIn = gifIn;
	}

	public String getGifOut() {
		return this.gifOut;
	}
	public void setGifOut(String gifOut) {
		this.gifOut = gifOut;
	}

	public Long getLightAbility() {
		return this.lightAbility;
	}
	public void setLightAbility(Long lightAbility) {
		this.lightAbility = lightAbility;
	}

	public Long getLightVersion() {
		return this.lightVersion;
	}
	public void setLightVersion(Long lightVersion) {
		this.lightVersion = lightVersion;
	}

	public Long getRemainModifyNum() {
		return this.remainModifyNum;
	}
	public void setRemainModifyNum(Long remainModifyNum) {
		this.remainModifyNum = remainModifyNum;
	}

}
