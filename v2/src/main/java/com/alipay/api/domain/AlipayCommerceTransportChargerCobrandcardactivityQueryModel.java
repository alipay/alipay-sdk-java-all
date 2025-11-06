package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当前冲单活动进度查询
 *
 * @author auto create
 * @since 1.0, 2025-10-11 16:07:13
 */
public class AlipayCommerceTransportChargerCobrandcardactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6883175828648599956L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId，与open_id二选一。
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
