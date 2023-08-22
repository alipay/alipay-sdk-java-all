package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额查询
 *
 * @author auto create
 * @since 1.0, 2023-08-22 20:30:34
 */
public class AlipayCloudCloudbaseWalletBalanceGetModel extends AlipayObject {

	private static final long serialVersionUID = 8286363341169211426L;

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
