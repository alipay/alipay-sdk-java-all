package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务广告完成状态查询接口
 *
 * @author auto create
 * @since 1.0, 2024-08-26 11:39:33
 */
public class AlipayDataDataserviceXlightTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4335364177854566194L;

	/**
	 * 广告检索时每个任务返回的唯一流水号，用此流水号来查询用户是否完成了这条任务
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 支付宝用户在应用维度下的唯一id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
