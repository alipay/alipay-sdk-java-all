package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果页配置
 *
 * @author auto create
 * @since 1.0, 2026-01-19 16:47:42
 */
public class ResultPageConfig extends AlipayObject {

	private static final long serialVersionUID = 3421844458961744263L;

	/**
	 * 按钮跳转类型
	 */
	@ApiField("button_jump_type")
	private String buttonJumpType;

	/**
	 * 按钮跳转地址
	 */
	@ApiField("button_jump_url")
	private String buttonJumpUrl;

	/**
	 * 按钮文案
	 */
	@ApiField("button_text")
	private String buttonText;

	/**
	 * 主标题
	 */
	@ApiField("main_title")
	private String mainTitle;

	/**
	 * 副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	public String getButtonJumpType() {
		return this.buttonJumpType;
	}
	public void setButtonJumpType(String buttonJumpType) {
		this.buttonJumpType = buttonJumpType;
	}

	public String getButtonJumpUrl() {
		return this.buttonJumpUrl;
	}
	public void setButtonJumpUrl(String buttonJumpUrl) {
		this.buttonJumpUrl = buttonJumpUrl;
	}

	public String getButtonText() {
		return this.buttonText;
	}
	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getMainTitle() {
		return this.mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

}
