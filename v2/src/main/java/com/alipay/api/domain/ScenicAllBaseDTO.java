package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区基础信息
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class ScenicAllBaseDTO extends AlipayObject {

	private static final long serialVersionUID = 7427872571185152792L;

	/**
	 * 头像图片
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 视频链接
	 */
	@ApiField("avatar_video")
	private String avatarVideo;

	/**
	 * 景点所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 头图主色
	 */
	@ApiField("color_thief")
	private String colorThief;

	/**
	 * 舒适度
	 */
	@ApiField("confort_level")
	private String confortLevel;

	/**
	 * 景点介绍
	 */
	@ApiField("description")
	private String description;

	/**
	 * 介绍一句话
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 营业时间
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 景点标题
	 */
	@ApiField("scenery_name")
	private String sceneryName;

	/**
	 * 景点id
	 */
	@ApiField("scenic_id")
	private String scenicId;

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAvatarVideo() {
		return this.avatarVideo;
	}
	public void setAvatarVideo(String avatarVideo) {
		this.avatarVideo = avatarVideo;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getColorThief() {
		return this.colorThief;
	}
	public void setColorThief(String colorThief) {
		this.colorThief = colorThief;
	}

	public String getConfortLevel() {
		return this.confortLevel;
	}
	public void setConfortLevel(String confortLevel) {
		this.confortLevel = confortLevel;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getSceneryName() {
		return this.sceneryName;
	}
	public void setSceneryName(String sceneryName) {
		this.sceneryName = sceneryName;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

}
