package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账实时人群标签更新
 *
 * @author auto create
 * @since 1.0, 2022-12-06 16:50:19
 */
public class AlipayFundTransIcrowdTagModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7755321137156723684L;

	/**
	 * 手机号码，与user_id不可同时为空
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 标签编码
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签的值
	 */
	@ApiField("tag_value")
	private String tagValue;

	/**
	 * 蚂蚁统一会员ID，与mobile不可同时为空
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
