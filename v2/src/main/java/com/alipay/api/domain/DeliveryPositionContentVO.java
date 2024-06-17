package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放展位内容及配置、配置包含内容疲劳度、创意疲劳度、埋点信息
 *
 * @author auto create
 * @since 1.0, 2024-06-03 15:57:19
 */
public class DeliveryPositionContentVO extends AlipayObject {

	private static final long serialVersionUID = 7671227929888211954L;

	/**
	 * 展位召回内容的疲劳度相关配置
	 */
	@ApiField("content_fatigue")
	private DeliveryFatigueContent contentFatigue;

	/**
	 * 经营基建展位内容埋点信息，用于完成埋点信息上报
	 */
	@ApiField("content_info_log")
	private String contentInfoLog;

	/**
	 * 创意对应的疲劳度配置信息
	 */
	@ApiField("creativity_fatigue")
	private CreativityFatigue creativityFatigue;

	/**
	 * 展位图片url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 展位跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 展位内容埋点配置信息,无任何用户信息
	 */
	@ApiField("scm")
	private String scm;

	public DeliveryFatigueContent getContentFatigue() {
		return this.contentFatigue;
	}
	public void setContentFatigue(DeliveryFatigueContent contentFatigue) {
		this.contentFatigue = contentFatigue;
	}

	public String getContentInfoLog() {
		return this.contentInfoLog;
	}
	public void setContentInfoLog(String contentInfoLog) {
		this.contentInfoLog = contentInfoLog;
	}

	public CreativityFatigue getCreativityFatigue() {
		return this.creativityFatigue;
	}
	public void setCreativityFatigue(CreativityFatigue creativityFatigue) {
		this.creativityFatigue = creativityFatigue;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getScm() {
		return this.scm;
	}
	public void setScm(String scm) {
		this.scm = scm;
	}

}
