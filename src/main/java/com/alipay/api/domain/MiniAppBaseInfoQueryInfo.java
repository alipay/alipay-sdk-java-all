package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询小程序信息
 *
 * @author auto create
 * @since 1.0, 2019-05-09 11:30:28
 */
public class MiniAppBaseInfoQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 2669651685996464995L;

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
