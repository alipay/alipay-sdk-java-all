package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.inst.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 11:41:49
 */
public class AnttechBlockchainDefinSaasInstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2216445361265337517L;

	/** 
	 * 机构编码
	 */
	@ApiField("channel_member_code")
	private String channelMemberCode;

	/** 
	 * 机构网点联行号
	 */
	@ApiField("channel_official_number")
	private String channelOfficialNumber;

	public void setChannelMemberCode(String channelMemberCode) {
		this.channelMemberCode = channelMemberCode;
	}
	public String getChannelMemberCode( ) {
		return this.channelMemberCode;
	}

	public void setChannelOfficialNumber(String channelOfficialNumber) {
		this.channelOfficialNumber = channelOfficialNumber;
	}
	public String getChannelOfficialNumber( ) {
		return this.channelOfficialNumber;
	}

}
