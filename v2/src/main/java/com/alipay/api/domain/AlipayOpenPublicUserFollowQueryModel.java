package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号用户关注查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-17 20:55:14
 */
public class AlipayOpenPublicUserFollowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8816999268735963312L;

	/**
	 * 支付宝用户唯一的标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
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
