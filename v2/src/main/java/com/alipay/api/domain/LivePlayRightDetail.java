package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播玩法权益详情
 *
 * @author auto create
 * @since 1.0, 2025-04-22 14:14:14
 */
public class LivePlayRightDetail extends AlipayObject {

	private static final long serialVersionUID = 3586532427485195983L;

	/**
	 * 跳转链接，用于领取成功之后的跳转
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 权益价值数，非金额，表示展示的权益数字
	 */
	@ApiField("right_amount")
	private String rightAmount;

	/**
	 * 权益描述文案
	 */
	@ApiField("right_desc_text")
	private String rightDescText;

	/**
	 * 权益名称
	 */
	@ApiField("right_name_text")
	private String rightNameText;

	/**
	 * 权益标题
	 */
	@ApiField("right_title_text")
	private String rightTitleText;

	/**
	 * 权益单位
	 */
	@ApiField("right_unit")
	private String rightUnit;

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getRightAmount() {
		return this.rightAmount;
	}
	public void setRightAmount(String rightAmount) {
		this.rightAmount = rightAmount;
	}

	public String getRightDescText() {
		return this.rightDescText;
	}
	public void setRightDescText(String rightDescText) {
		this.rightDescText = rightDescText;
	}

	public String getRightNameText() {
		return this.rightNameText;
	}
	public void setRightNameText(String rightNameText) {
		this.rightNameText = rightNameText;
	}

	public String getRightTitleText() {
		return this.rightTitleText;
	}
	public void setRightTitleText(String rightTitleText) {
		this.rightTitleText = rightTitleText;
	}

	public String getRightUnit() {
		return this.rightUnit;
	}
	public void setRightUnit(String rightUnit) {
		this.rightUnit = rightUnit;
	}

}
