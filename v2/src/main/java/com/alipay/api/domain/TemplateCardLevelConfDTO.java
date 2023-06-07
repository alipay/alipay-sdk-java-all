package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡级别配置信息
 *
 * @author auto create
 * @since 1.0, 2019-03-06 21:29:56
 */
public class TemplateCardLevelConfDTO extends AlipayObject {

	private static final long serialVersionUID = 8175535359914483255L;

	/**
	 * 会员级别 该级别和开卡接口中的level要一致
	 */
	@ApiField("level")
	private String level;

	/**
	 * 会员级别描述
	 */
	@ApiField("level_desc")
	private String levelDesc;

	/**
	 * 会员级别对应icon， 通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("level_icon")
	private String levelIcon;

	/**
	 * 会员级别显示名称
	 */
	@ApiField("level_show_name")
	private String levelShowName;

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevelDesc() {
		return this.levelDesc;
	}
	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}

	public String getLevelIcon() {
		return this.levelIcon;
	}
	public void setLevelIcon(String levelIcon) {
		this.levelIcon = levelIcon;
	}

	public String getLevelShowName() {
		return this.levelShowName;
	}
	public void setLevelShowName(String levelShowName) {
		this.levelShowName = levelShowName;
	}

}
