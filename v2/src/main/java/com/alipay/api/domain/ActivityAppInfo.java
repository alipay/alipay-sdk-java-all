package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动核销小程序详情
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:34
 */
public class ActivityAppInfo extends AlipayObject {

	private static final long serialVersionUID = 5667277681829887641L;

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
