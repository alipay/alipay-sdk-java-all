package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询碰出惊喜活动
 *
 * @author auto create
 * @since 1.0, 2026-08-28 13:52:52
 */
public class AlipayCommerceIotnspplaycenterActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5469273197395657518L;

	/**
	 * 碰出惊喜活动ID，可从碰出惊喜活动创建或活动查询结果中获取。
	 */
	@ApiField("act_scheme_id")
	private String actSchemeId;

	/**
	 * 支付宝用户标识，平台转换为内部用户ID后用于查询用户的活动详情。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户标识，平台转换为内部用户ID后用于查询用户的活动详情。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActSchemeId() {
		return this.actSchemeId;
	}
	public void setActSchemeId(String actSchemeId) {
		this.actSchemeId = actSchemeId;
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
