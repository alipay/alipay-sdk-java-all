package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序预创建确认生成
 *
 * @author auto create
 * @since 1.0, 2018-12-17 17:25:42
 */
public class AlipayOpenMiniInnerbaseinfoPrecreateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1764654167865712818L;

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
