package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序端信息查询
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:55:31
 */
public class AlipayOpenMiniInnerclientinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5622422664983981975L;

	/**
	 * 端创建时提供的bundle_id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

}
