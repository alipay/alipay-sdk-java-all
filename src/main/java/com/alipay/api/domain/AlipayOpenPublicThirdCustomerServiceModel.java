package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务窗第三方渠道商配置接口，用于记录服务窗商户授权的第三方渠道商
 *
 * @author auto create
 * @since 1.0, 2021-06-23 10:53:28
 */
public class AlipayOpenPublicThirdCustomerServiceModel extends AlipayObject {

	private static final long serialVersionUID = 4597822395567169861L;

	/**
	 * 服务窗商户在渠道商处对应的用户id
	 */
	@ApiField("channel_uid")
	private String channelUid;

	public String getChannelUid() {
		return this.channelUid;
	}
	public void setChannelUid(String channelUid) {
		this.channelUid = channelUid;
	}

}
