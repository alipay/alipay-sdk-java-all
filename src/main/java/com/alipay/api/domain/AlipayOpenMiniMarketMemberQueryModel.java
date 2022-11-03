package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员咨询服务
 *
 * @author auto create
 * @since 1.0, 2022-09-26 14:15:20
 */
public class AlipayOpenMiniMarketMemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6782617815361553762L;

	/**
	 * 小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 支付宝用户UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
