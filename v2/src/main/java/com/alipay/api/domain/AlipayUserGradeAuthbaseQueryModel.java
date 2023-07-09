package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户等级和积分查询接口（不需要授权）
 *
 * @author auto create
 * @since 1.0, 2023-01-31 13:31:18
 */
public class AlipayUserGradeAuthbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5784683968615275129L;

	/**
	 * 用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户的支付宝账户ID
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
