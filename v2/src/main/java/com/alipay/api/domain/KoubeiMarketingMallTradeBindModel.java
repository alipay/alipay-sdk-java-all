package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定用户与商圈对应的授权关系
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:02:21
 */
public class KoubeiMarketingMallTradeBindModel extends AlipayObject {

	private static final long serialVersionUID = 1712765979817341957L;

	/**
	 * 用户的授权动作：auth授权，unAuth取消授权
	 */
	@ApiField("action")
	private String action;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
