package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务显示内容。
 *
 * @author auto create
 * @since 1.0, 2020-05-19 16:13:02
 */
public class AppletTaskDisplayVO extends AlipayObject {

	private static final long serialVersionUID = 5846657164728815451L;

	/**
	 * 显示的任务未完成时的按钮文本。
	 */
	@ApiField("button_text")
	private String buttonText;

	/**
	 * 显示的任务已完成时的按钮文本。
	 */
	@ApiField("button_text_disabled")
	private String buttonTextDisabled;

	/**
	 * 任务跳转链接。
	 */
	@ApiField("link")
	private String link;

	/**
	 * 业务链接。
	 */
	@ApiField("promo_link")
	private String promoLink;

	/**
	 * 任务标签图标链接。
	 */
	@ApiField("tag_icon")
	private String tagIcon;

	/**
	 * 任务标签后缀文案。
	 */
	@ApiField("tag_suffix")
	private String tagSuffix;

	/**
	 * 显示的任务描述。
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 显示的任务图标链接。
	 */
	@ApiField("task_icon")
	private String taskIcon;

	/**
	 * 显示的任务名称
	 */
	@ApiField("task_title")
	private String taskTitle;

	public String getButtonText() {
		return this.buttonText;
	}
	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getButtonTextDisabled() {
		return this.buttonTextDisabled;
	}
	public void setButtonTextDisabled(String buttonTextDisabled) {
		this.buttonTextDisabled = buttonTextDisabled;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getPromoLink() {
		return this.promoLink;
	}
	public void setPromoLink(String promoLink) {
		this.promoLink = promoLink;
	}

	public String getTagIcon() {
		return this.tagIcon;
	}
	public void setTagIcon(String tagIcon) {
		this.tagIcon = tagIcon;
	}

	public String getTagSuffix() {
		return this.tagSuffix;
	}
	public void setTagSuffix(String tagSuffix) {
		this.tagSuffix = tagSuffix;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTaskIcon() {
		return this.taskIcon;
	}
	public void setTaskIcon(String taskIcon) {
		this.taskIcon = taskIcon;
	}

	public String getTaskTitle() {
		return this.taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

}
