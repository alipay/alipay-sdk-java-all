package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询碰出惊喜活动的用户参与情况
 *
 * @author auto create
 * @since 1.0, 2026-08-19 22:12:29
 */
public class AlipayCommerceNxactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4479671587914178433L;

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

}
