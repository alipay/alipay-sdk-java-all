package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动奖品配置信息
 *
 * @author auto create
 * @since 1.0, 2025-10-11 16:07:13
 */
public class ActivityRewardConfig extends AlipayObject {

	private static final long serialVersionUID = 6839249441215788463L;

	/**
	 * 奖品副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 主标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 权益奖品单位
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 权益奖品数目，仅做展示使用。单位包含个、折等，由业务运营定义
	 */
	@ApiField("value")
	private String value;

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

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
