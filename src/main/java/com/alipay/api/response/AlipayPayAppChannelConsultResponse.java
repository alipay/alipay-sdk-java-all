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
 * @since 1.0, 2020-09-29 21:52:28
 */
public class AlipayPayAppChannelConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3615457279685358861L;

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
