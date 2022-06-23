package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业-蚂蚁森林能量事件上报接口
 *
 * @author auto create
 * @since 1.0, 2021-11-15 15:10:16
 */
public class AlipayEbppIndustryAntforestEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 8114871991756327335L;

	/**
	 * 用于标识行业-蚂蚁森林能量事件的类别
	 */
	@ApiField("type")
	private String type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
