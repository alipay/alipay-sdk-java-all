package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消AQ会话H5页面授权
 *
 * @author auto create
 * @since 1.0, 2025-11-05 18:02:25
 */
public class AlipayCommerceMedicalAqTokenCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1562858335649867768L;

	/**
	 * 支付宝openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝uid
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
