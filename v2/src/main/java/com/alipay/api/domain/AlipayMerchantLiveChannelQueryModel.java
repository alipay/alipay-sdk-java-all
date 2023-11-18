package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道信息查询
 *
 * @author auto create
 * @since 1.0, 2022-12-29 20:52:49
 */
public class AlipayMerchantLiveChannelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6454974889836239672L;

	/**
	 * 渠道下单参数(orderStartId)
	 */
	@ApiField("secret")
	private String secret;

	public String getSecret() {
		return this.secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}

}
