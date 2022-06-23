package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询用户下小程序应用信息列表数据
 *
 * @author auto create
 * @since 1.0, 2019-05-30 14:07:46
 */
public class AlipayOpenMiniDeveloperAppinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1164711628445922783L;

	/**
	 * 客户端标识
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
