package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务素材信息
 *
 * @author auto create
 * @since 1.0, 2022-06-29 18:00:31
 */
public class TaskMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 7497559163273929814L;

	/**
	 * 任务领奖按钮文案
	 */
	@ApiField("button_text_award")
	private String buttonTextAward;

	/**
	 * 任务已结束按钮文案
	 */
	@ApiField("button_text_done")
	private String buttonTextDone;

	/**
	 * 任务报名按钮文案
	 */
	@ApiField("button_text_signup")
	private String buttonTextSignup;

	/**
	 * 任务图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 任务跳转链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 任务副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 任务主标题
	 */
	@ApiField("title")
	private String title;

	public String getButtonTextAward() {
		return this.buttonTextAward;
	}
	public void setButtonTextAward(String buttonTextAward) {
		this.buttonTextAward = buttonTextAward;
	}

	public String getButtonTextDone() {
		return this.buttonTextDone;
	}
	public void setButtonTextDone(String buttonTextDone) {
		this.buttonTextDone = buttonTextDone;
	}

	public String getButtonTextSignup() {
		return this.buttonTextSignup;
	}
	public void setButtonTextSignup(String buttonTextSignup) {
		this.buttonTextSignup = buttonTextSignup;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
