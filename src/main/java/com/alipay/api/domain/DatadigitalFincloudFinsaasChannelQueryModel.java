package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取渠道详情
 *
 * @author auto create
 * @since 1.0, 2022-07-05 14:39:11
 */
public class DatadigitalFincloudFinsaasChannelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7853696498814285563L;

	/**
	 * 渠道id+唯一+获取渠道详情+数据库
	 */
	@ApiField("channel_id")
	private Long channelId;

	public Long getChannelId() {
		return this.channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

}
