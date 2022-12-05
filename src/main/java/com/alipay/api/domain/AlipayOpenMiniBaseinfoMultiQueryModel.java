package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序查询多端基础信息
 *
 * @author auto create
 * @since 1.0, 2019-09-16 11:49:26
 */
public class AlipayOpenMiniBaseinfoMultiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8888174838167311635L;

	/**
	 * 应用端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
