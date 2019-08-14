package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertChannelResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.channel.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionChannelModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2752689287979599726L;

	/** 
	 * 渠道修改接口
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
