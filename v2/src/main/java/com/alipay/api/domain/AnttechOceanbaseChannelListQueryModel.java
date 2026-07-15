package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询渠道列表
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:06:40
 */
public class AnttechOceanbaseChannelListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6196853153312536356L;

	/**
	 * 用于查询所有渠道的请求入参模型
	 */
	@ApiField("channel_list_query_request")
	private ChannelListQueryRequest channelListQueryRequest;

	public ChannelListQueryRequest getChannelListQueryRequest() {
		return this.channelListQueryRequest;
	}
	public void setChannelListQueryRequest(ChannelListQueryRequest channelListQueryRequest) {
		this.channelListQueryRequest = channelListQueryRequest;
	}

}
