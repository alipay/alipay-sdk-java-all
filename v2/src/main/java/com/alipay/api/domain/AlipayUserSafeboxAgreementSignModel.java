package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钢铁匣签约
 *
 * @author auto create
 * @since 1.0, 2022-10-28 14:37:14
 */
public class AlipayUserSafeboxAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 5527737719722278996L;

	/**
	 * 用户（UserId）在应用（AppId）下的唯一用户标识
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
