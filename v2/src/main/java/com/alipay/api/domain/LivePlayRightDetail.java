package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播玩法权益详情
 *
 * @author auto create
 * @since 1.0, 2025-12-04 13:44:44
 */
public class LivePlayRightDetail extends AlipayObject {

	private static final long serialVersionUID = 1678851822959668971L;

	/**
	 * 券可以领取的过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 跳转链接，用于领取成功之后的跳转
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 1张。权益价值数，非金额，表示展示的权益数字，比如1张
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

	/**
	 * 券的价值(单位：元)
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券价值的单位
	 */
	@ApiField("value_unit")
	private String valueUnit;

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

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

	public String getValueAmount() {
		return this.valueAmount;
	}
	public void setValueAmount(String valueAmount) {
		this.valueAmount = valueAmount;
	}

	public String getValueUnit() {
		return this.valueUnit;
	}
	public void setValueUnit(String valueUnit) {
		this.valueUnit = valueUnit;
	}

}
