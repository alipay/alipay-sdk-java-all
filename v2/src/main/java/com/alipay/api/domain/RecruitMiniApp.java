package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名提交的小程序信息
 *
 * @author auto create
 * @since 1.0, 2022-02-23 11:50:36
 */
public class RecruitMiniApp extends AlipayObject {

	private static final long serialVersionUID = 5199216335612883172L;

	/**
	 * 小程序ID
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
