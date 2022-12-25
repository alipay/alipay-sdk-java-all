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
 * @since 1.0, 2022-12-08 17:39:49
 */
public class AlipayPayAppChannelConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5825949543391381989L;

	/** 
	 * 渠道信息列表
	 */
	@ApiListField("channel_info_list")
	@ApiField("channel_info")
	private List<ChannelInfo> channelInfoList;

	/** 
	 * 前置咨询id
	 */
	@ApiField("pre_consult_id")
	private String preConsultId;

	/** 
	 * 虚拟账号
	 */
	@ApiField("virtual_alipay_user_id")
	private String virtualAlipayUserId;

	public void setChannelInfoList(List<ChannelInfo> channelInfoList) {
		this.channelInfoList = channelInfoList;
	}
	public List<ChannelInfo> getChannelInfoList( ) {
		return this.channelInfoList;
	}

	public void setPreConsultId(String preConsultId) {
		this.preConsultId = preConsultId;
	}
	public String getPreConsultId( ) {
		return this.preConsultId;
	}

	public void setVirtualAlipayUserId(String virtualAlipayUserId) {
		this.virtualAlipayUserId = virtualAlipayUserId;
	}
	public String getVirtualAlipayUserId( ) {
		return this.virtualAlipayUserId;
	}

}
