package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取卡数据时返回的错误信息
 *
 * @author auto create
 * @since 1.0, 2020-02-25 18:31:01
 */
public class WorldErrorIndicator extends AlipayObject {

	private static final long serialVersionUID = 6294989315813871622L;

	/**
	 * 右动作按钮
	 */
	@ApiField("action_button")
	private String actionButton;

	/**
	 * 右动作按钮目标地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 针对alipayInside的定制提示文案
	 */
	@ApiField("alipay_inside_tips")
	private String alipayInsideTips;

	/**
	 * 清楚卡片提示
	 */
	@ApiField("clean_card")
	private Boolean cleanCard;

	/**
	 * 左动作按钮
	 */
	@ApiField("default_button")
	private String defaultButton;

	/**
	 * 左动作按钮目标地址
	 */
	@ApiField("default_url")
	private String defaultUrl;

	/**
	 * 错误描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 客户端提示文案
	 */
	@ApiField("tips")
	private String tips;

	/**
	 * 客户端提示类型
	 */
	@ApiField("type")
	private String type;

	public String getActionButton() {
		return this.actionButton;
	}
	public void setActionButton(String actionButton) {
		this.actionButton = actionButton;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getAlipayInsideTips() {
		return this.alipayInsideTips;
	}
	public void setAlipayInsideTips(String alipayInsideTips) {
		this.alipayInsideTips = alipayInsideTips;
	}

	public Boolean getCleanCard() {
		return this.cleanCard;
	}
	public void setCleanCard(Boolean cleanCard) {
		this.cleanCard = cleanCard;
	}

	public String getDefaultButton() {
		return this.defaultButton;
	}
	public void setDefaultButton(String defaultButton) {
		this.defaultButton = defaultButton;
	}

	public String getDefaultUrl() {
		return this.defaultUrl;
	}
	public void setDefaultUrl(String defaultUrl) {
		this.defaultUrl = defaultUrl;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
