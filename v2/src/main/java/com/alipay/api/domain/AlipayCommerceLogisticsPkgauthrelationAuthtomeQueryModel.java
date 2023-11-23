package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权给我的包裹授权关系查询
 *
 * @author auto create
 * @since 1.0, 2022-11-18 11:07:15
 */
public class AlipayCommerceLogisticsPkgauthrelationAuthtomeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6812479297278417929L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
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
