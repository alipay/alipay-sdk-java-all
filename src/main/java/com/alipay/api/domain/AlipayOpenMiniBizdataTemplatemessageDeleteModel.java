package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序服务信息删除
 *
 * @author auto create
 * @since 1.0, 2019-12-03 20:10:06
 */
public class AlipayOpenMiniBizdataTemplatemessageDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3246784169691948161L;

	/**
	 * 商户业务流水id，应该是商户侧数据的唯一键
	 */
	@ApiField("id")
	private String id;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
