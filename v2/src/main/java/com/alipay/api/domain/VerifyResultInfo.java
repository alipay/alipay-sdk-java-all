package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-19 16:42:43
 */
public class VerifyResultInfo extends AlipayObject {

	private static final long serialVersionUID = 5756938965717146117L;

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
	 * 审核备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景描述
	 */
	@ApiField("scene_desc")
	private String sceneDesc;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 核验提示
	 */
	@ApiField("verify_issue_desc")
	private String verifyIssueDesc;

	/**
	 * 核验结果
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneDesc() {
		return this.sceneDesc;
	}
	public void setSceneDesc(String sceneDesc) {
		this.sceneDesc = sceneDesc;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getVerifyIssueDesc() {
		return this.verifyIssueDesc;
	}
	public void setVerifyIssueDesc(String verifyIssueDesc) {
		this.verifyIssueDesc = verifyIssueDesc;
	}

	public String getVerifyIssueType() {
		return this.verifyIssueType;
	}
	public void setVerifyIssueType(String verifyIssueType) {
		this.verifyIssueType = verifyIssueType;
	}

}
