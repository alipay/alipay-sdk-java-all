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
 * @since 1.0, 2021-05-10 11:55:21
 */
public class AlipayPayAppChannelPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5631564497455799957L;

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
