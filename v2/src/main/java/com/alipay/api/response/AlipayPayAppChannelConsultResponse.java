package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChannelInfo;
import com.alipay.api.domain.BizExtInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.channel.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-30 00:06:47
 */
public class AlipayPayAppChannelConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7396973939529625422L;

	/** 
	 * 渠道信息列表
	 */
	@ApiListField("channel_info_list")
	@ApiField("channel_info")
	private List<ChannelInfo> channelInfoList;

	/** 
	 * 该参数为Map结构，用于在二方前置咨询返回一些基于特殊业务场景可选返回的参数
	 */
	@ApiField("ext_info")
	private BizExtInfo extInfo;

	/** 
	 * 前置咨询id
	 */
	@ApiField("pre_consult_id")
	private String preConsultId;

	/** 
	 * 真实账号
	 */
	@ApiField("real_alipay_account_id")
	private String realAlipayAccountId;

	/** 
	 * 真实账号
	 */
	@ApiField("real_alipay_open_id")
	private String realAlipayOpenId;

	/** 
	 * 虚拟账号
	 */
	@ApiField("virtual_alipay_open_id")
	private String virtualAlipayOpenId;

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

	public void setExtInfo(BizExtInfo extInfo) {
		this.extInfo = extInfo;
	}
	public BizExtInfo getExtInfo( ) {
		return this.extInfo;
	}

	public void setPreConsultId(String preConsultId) {
		this.preConsultId = preConsultId;
	}
	public String getPreConsultId( ) {
		return this.preConsultId;
	}

	public void setRealAlipayAccountId(String realAlipayAccountId) {
		this.realAlipayAccountId = realAlipayAccountId;
	}
	public String getRealAlipayAccountId( ) {
		return this.realAlipayAccountId;
	}

	public void setRealAlipayOpenId(String realAlipayOpenId) {
		this.realAlipayOpenId = realAlipayOpenId;
	}
	public String getRealAlipayOpenId( ) {
		return this.realAlipayOpenId;
	}

	public void setVirtualAlipayOpenId(String virtualAlipayOpenId) {
		this.virtualAlipayOpenId = virtualAlipayOpenId;
	}
	public String getVirtualAlipayOpenId( ) {
		return this.virtualAlipayOpenId;
	}

	public void setVirtualAlipayUserId(String virtualAlipayUserId) {
		this.virtualAlipayUserId = virtualAlipayUserId;
	}
	public String getVirtualAlipayUserId( ) {
		return this.virtualAlipayUserId;
	}

}
