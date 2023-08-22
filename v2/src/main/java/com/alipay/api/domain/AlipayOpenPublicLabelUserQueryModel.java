package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-查询用户标签
 *
 * @author auto create
 * @since 1.0, 2022-11-18 15:53:14
 */
public class AlipayOpenPublicLabelUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6718614635523868423L;

	/**
	 * 支付宝用户的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userid，2088开头长度为16位的字符串
	 */
	@ApiField("user_id")
	private String userId;

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
