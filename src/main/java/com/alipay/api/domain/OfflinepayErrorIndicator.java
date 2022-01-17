package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权码错误指示器
 *
 * @author auto create
 * @since 1.0, 2020-03-18 15:45:34
 */
public class OfflinepayErrorIndicator extends AlipayObject {

	private static final long serialVersionUID = 2395679926548893427L;

	/**
	 * 右动作按钮
	 */
	@ApiField("action_button")
	private String actionButton;

	/**
	 * 右动作按钮跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 针对alipayinside的定制化提示文案
	 */
	@ApiField("alipay_inside_tips")
	private String alipayInsideTips;

	/**
	 * 是否清楚卡片本地缓存
	 */
	@ApiField("clean_card")
	private Boolean cleanCard;

	/**
	 * 左动作按钮
	 */
	@ApiField("default_button")
	private String defaultButton;

	/**
	 * 默认跳转地址
	 */
	@ApiField("default_url")
	private String defaultUrl;

	/**
	 * 错误描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 错误码值
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误提示文案
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
