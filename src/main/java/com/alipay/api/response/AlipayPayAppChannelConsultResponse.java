package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChannelInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.channel.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-08 15:00:18
 */
public class AlipayPayAppChannelConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3874715169531331368L;

	/** 
	 * 渠道信息列表
	 */
	@ApiListField("channel_info_list")
	@ApiField("channel_info")
	private List<ChannelInfo> channelInfoList;

	public void setChannelInfoList(List<ChannelInfo> channelInfoList) {
		this.channelInfoList = channelInfoList;
	}
	public List<ChannelInfo> getChannelInfoList( ) {
		return this.channelInfoList;
	}

}
