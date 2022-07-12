package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端服务品牌词查询
 *
 * @author auto create
 * @since 1.0, 2021-01-20 10:44:01
 */
public class AlipayOpenMiniBrandBundleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2832879742957185567L;

	/**
	 * 所需查询的小程序id
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
