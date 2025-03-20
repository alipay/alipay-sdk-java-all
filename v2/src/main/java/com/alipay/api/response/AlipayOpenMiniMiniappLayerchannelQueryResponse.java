package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChannelCodeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.layerchannel.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:57:17
 */
public class AlipayOpenMiniMiniappLayerchannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2864462464575571256L;

	/** 
	 * 返回该小程序下所拥有对应渠道列表
	 */
	@ApiListField("channel_code_list")
	@ApiField("channel_code_info")
	private List<ChannelCodeInfo> channelCodeList;

	public void setChannelCodeList(List<ChannelCodeInfo> channelCodeList) {
		this.channelCodeList = channelCodeList;
	}
	public List<ChannelCodeInfo> getChannelCodeList( ) {
		return this.channelCodeList;
	}

}
