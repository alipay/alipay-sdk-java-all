package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertChannelResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.channel.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionChannelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1498619166497681428L;

	/** 
	 * 新增渠道接口，需要记录渠道ID
	 */
	@ApiListField("channel_response")
	@ApiField("kb_advert_channel_response")
	private List<KbAdvertChannelResponse> channelResponse;

	public void setChannelResponse(List<KbAdvertChannelResponse> channelResponse) {
		this.channelResponse = channelResponse;
	}
	public List<KbAdvertChannelResponse> getChannelResponse( ) {
		return this.channelResponse;
	}

}
