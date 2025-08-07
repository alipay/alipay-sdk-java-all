package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChannelItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.channel.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-20 13:59:03
 */
public class AlipayPayAppChannelPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8835476212715538522L;

	/** 
	 * 渠道信息列表
	 */
	@ApiListField("channel_info_list")
	@ApiField("channel_item")
	private List<ChannelItem> channelInfoList;

	/** 
	 * 咨询上下文id
	 */
	@ApiField("pre_consult_id")
	private String preConsultId;

	public void setChannelInfoList(List<ChannelItem> channelInfoList) {
		this.channelInfoList = channelInfoList;
	}
	public List<ChannelItem> getChannelInfoList( ) {
		return this.channelInfoList;
	}

	public void setPreConsultId(String preConsultId) {
		this.preConsultId = preConsultId;
	}
	public String getPreConsultId( ) {
		return this.preConsultId;
	}

}
