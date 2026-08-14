package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.healthdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 16:37:50
 */
public class AlipayCommerceMedicalMemberHealthdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6232895838562452196L;

	/** 
	 * 用户头像
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 是否有设备
	 */
	@ApiField("has_device")
	private Boolean hasDevice;

	/** 
	 * 用户健康情况
	 */
	@ApiField("health_condition")
	private String healthCondition;

	/** 
	 * 用户的昵称
	 */
	@ApiField("nick")
	private String nick;

	/** 
	 * 来源
	 */
	@ApiField("source")
	private String source;

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setHasDevice(Boolean hasDevice) {
		this.hasDevice = hasDevice;
	}
	public Boolean getHasDevice( ) {
		return this.hasDevice;
	}

	public void setHealthCondition(String healthCondition) {
		this.healthCondition = healthCondition;
	}
	public String getHealthCondition( ) {
		return this.healthCondition;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick( ) {
		return this.nick;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

}
