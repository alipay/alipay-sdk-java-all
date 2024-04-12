package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序服务信息删除
 *
 * @author auto create
 * @since 1.0, 2022-12-20 13:23:50
 */
public class AlipayOpenMiniBizdataTemplatemessageDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1292177165911386389L;

	/**
	 * 商户业务流水id，应该是商户侧数据的唯一键
	 */
	@ApiField("id")
	private String id;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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
