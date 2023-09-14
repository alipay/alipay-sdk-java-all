package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额查询
 *
 * @author auto create
 * @since 1.0, 2023-08-29 17:18:44
 */
public class AlipayCloudCloudbaseWalletBalanceGetModel extends AlipayObject {

	private static final long serialVersionUID = 5525662661556339598L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

}
