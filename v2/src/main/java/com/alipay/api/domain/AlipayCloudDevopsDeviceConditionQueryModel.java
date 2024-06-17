package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备聚合条件
 *
 * @author auto create
 * @since 1.0, 2024-01-09 13:55:19
 */
public class AlipayCloudDevopsDeviceConditionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2764721386129637557L;

	/**
	 * 空闲设备
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 渠道用户id
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道用户标记
	 */
	@ApiField("channel_user_tag")
	private String channelUserTag;

	/**
	 * 过滤平台
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 独享设备
	 */
	@ApiField("private_device")
	private Boolean privateDevice;

	/**
	 * 正常状态设备
	 */
	@ApiField("state")
	private String state;

	/**
	 * 可以远程真机使用
	 */
	@ApiField("vnc")
	private Boolean vnc;

	public String getBizState() {
		return this.bizState;
	}
	public void setBizState(String bizState) {
		this.bizState = bizState;
	}

	public String getChannelUserId() {
		return this.channelUserId;
	}
	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

	public String getChannelUserTag() {
		return this.channelUserTag;
	}
	public void setChannelUserTag(String channelUserTag) {
		this.channelUserTag = channelUserTag;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Boolean getPrivateDevice() {
		return this.privateDevice;
	}
	public void setPrivateDevice(Boolean privateDevice) {
		this.privateDevice = privateDevice;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public Boolean getVnc() {
		return this.vnc;
	}
	public void setVnc(Boolean vnc) {
		this.vnc = vnc;
	}

}
