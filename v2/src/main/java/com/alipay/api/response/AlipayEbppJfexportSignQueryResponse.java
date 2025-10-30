package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:52
 */
public class AlipayEbppJfexportSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4228789776985628786L;

	/** 
	 * 资产id银行卡签约号
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 卡类型，枚举值：
EXPRESS_DC：储蓄卡
EXPRESS_CC：信用卡
	 */
	@ApiField("assigned_channel")
	private String assignedChannel;

	/** 
	 * 银行id
	 */
	@ApiField("bank_id")
	private String bankId;

	/** 
	 * 支付渠道名称
	 */
	@ApiField("channel_full_name")
	private String channelFullName;

	/** 
	 * 户号是否当前用户签约
	 */
	@ApiField("current_user_sign")
	private Boolean currentUserSign;

	/** 
	 * 1表示协议正常，0表示协议不正常
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 户号是否被签约
	 */
	@ApiField("user_direct_sign")
	private Boolean userDirectSign;

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getAssetId( ) {
		return this.assetId;
	}

	public void setAssignedChannel(String assignedChannel) {
		this.assignedChannel = assignedChannel;
	}
	public String getAssignedChannel( ) {
		return this.assignedChannel;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankId( ) {
		return this.bankId;
	}

	public void setChannelFullName(String channelFullName) {
		this.channelFullName = channelFullName;
	}
	public String getChannelFullName( ) {
		return this.channelFullName;
	}

	public void setCurrentUserSign(Boolean currentUserSign) {
		this.currentUserSign = currentUserSign;
	}
	public Boolean getCurrentUserSign( ) {
		return this.currentUserSign;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setUserDirectSign(Boolean userDirectSign) {
		this.userDirectSign = userDirectSign;
	}
	public Boolean getUserDirectSign( ) {
		return this.userDirectSign;
	}

}
