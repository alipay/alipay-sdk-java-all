package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询渠道级比例
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:06:51
 */
public class AnttechOceanbaseChannelRateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2478548134384427393L;

	/**
	 * 渠道抽佣分成比例的请求模型
	 */
	@ApiField("channel_rate_query_request")
	private ChannelRateQueryRequest channelRateQueryRequest;

	public ChannelRateQueryRequest getChannelRateQueryRequest() {
		return this.channelRateQueryRequest;
	}
	public void setChannelRateQueryRequest(ChannelRateQueryRequest channelRateQueryRequest) {
		this.channelRateQueryRequest = channelRateQueryRequest;
	}

}
