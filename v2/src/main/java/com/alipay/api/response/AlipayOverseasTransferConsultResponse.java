package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOverseasTransferConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2862836644611715677L;

	/** 
	 * 通道列表
	 */
	@ApiListField("channel_list")
	@ApiField("string")
	private List<String> channelList;

	/** 
	 * 默认通道
	 */
	@ApiField("default_channel")
	private String defaultChannel;

	public void setChannelList(List<String> channelList) {
		this.channelList = channelList;
	}
	public List<String> getChannelList( ) {
		return this.channelList;
	}

	public void setDefaultChannel(String defaultChannel) {
		this.defaultChannel = defaultChannel;
	}
	public String getDefaultChannel( ) {
		return this.defaultChannel;
	}

}
