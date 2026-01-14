package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-31 17:50:53
 */
public class VerifyResultConfig extends AlipayObject {

	private static final long serialVersionUID = 7369559283771441275L;

	/**
	 * 点击跳转地址
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

	/**
	 * 核验提示类型
	 */
	@ApiField("verify_issue_type")
	private String verifyIssueType;

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

	public String getVerifyIssueType() {
		return this.verifyIssueType;
	}
	public void setVerifyIssueType(String verifyIssueType) {
		this.verifyIssueType = verifyIssueType;
	}

}
