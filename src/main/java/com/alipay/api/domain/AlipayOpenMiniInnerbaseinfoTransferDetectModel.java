package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部小程序-小程序迁移校验
 *
 * @author auto create
 * @since 1.0, 2019-04-24 16:31:07
 */
public class AlipayOpenMiniInnerbaseinfoTransferDetectModel extends AlipayObject {

	private static final long serialVersionUID = 8466368573559922366L;

	/**
	 * 用户信息
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 需要迁移校验的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
