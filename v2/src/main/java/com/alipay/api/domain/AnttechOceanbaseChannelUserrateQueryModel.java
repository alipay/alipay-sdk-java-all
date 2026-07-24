package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户级比例
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:06:59
 */
public class AnttechOceanbaseChannelUserrateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5126546494888998967L;

	/**
	 * 用户级抽佣分成比例请求模型
	 */
	@ApiField("channel_user_rate_query_request")
	private ChannelUserRateQueryRequest channelUserRateQueryRequest;

	public ChannelUserRateQueryRequest getChannelUserRateQueryRequest() {
		return this.channelUserRateQueryRequest;
	}
	public void setChannelUserRateQueryRequest(ChannelUserRateQueryRequest channelUserRateQueryRequest) {
		this.channelUserRateQueryRequest = channelUserRateQueryRequest;
	}

}
