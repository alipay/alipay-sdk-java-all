package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.live.channel.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:11:48
 */
public class AlipayMerchantLiveChannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7246214167365283469L;

	/** 
	 * 渠道内容，包含主播、文章的上游信息。字符串内容为Map，需要转换
	 */
	@ApiField("channel_content")
	private String channelContent;

	/** 
	 * 渠道业务标识
	 */
	@ApiField("channel_identity")
	private String channelIdentity;

	/** 
	 * 渠道密文
	 */
	@ApiField("channel_secret")
	private String channelSecret;

	/** 
	 * 渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	public void setChannelContent(String channelContent) {
		this.channelContent = channelContent;
	}
	public String getChannelContent( ) {
		return this.channelContent;
	}

	public void setChannelIdentity(String channelIdentity) {
		this.channelIdentity = channelIdentity;
	}
	public String getChannelIdentity( ) {
		return this.channelIdentity;
	}

	public void setChannelSecret(String channelSecret) {
		this.channelSecret = channelSecret;
	}
	public String getChannelSecret( ) {
		return this.channelSecret;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getChannelType( ) {
		return this.channelType;
	}

}
