package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动核销小程序详情
 *
 * @author auto create
 * @since 1.0, 2021-11-15 17:46:30
 */
public class ActivityAppInfo extends AlipayObject {

	private static final long serialVersionUID = 8771669753391963449L;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
