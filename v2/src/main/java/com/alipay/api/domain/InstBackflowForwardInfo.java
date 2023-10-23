package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构回传的forward边缘网关信息
 *
 * @author auto create
 * @since 1.0, 2023-10-20 20:38:59
 */
public class InstBackflowForwardInfo extends AlipayObject {

	private static final long serialVersionUID = 8647754417243111612L;

	/**
	 * forward服务器的域名信息
	 */
	@ApiField("forward_host")
	private String forwardHost;

	/**
	 * 机房信息
	 */
	@ApiField("forward_room")
	private String forwardRoom;

	/**
	 * forward发送的时间
	 */
	@ApiField("forward_time")
	private String forwardTime;

	/**
	 * 链路追踪Id
	 */
	@ApiField("forward_trace")
	private String forwardTrace;

	/**
	 * 环境信息
	 */
	@ApiField("forward_zone")
	private String forwardZone;

	public String getForwardHost() {
		return this.forwardHost;
	}
	public void setForwardHost(String forwardHost) {
		this.forwardHost = forwardHost;
	}

	public String getForwardRoom() {
		return this.forwardRoom;
	}
	public void setForwardRoom(String forwardRoom) {
		this.forwardRoom = forwardRoom;
	}

	public String getForwardTime() {
		return this.forwardTime;
	}
	public void setForwardTime(String forwardTime) {
		this.forwardTime = forwardTime;
	}

	public String getForwardTrace() {
		return this.forwardTrace;
	}
	public void setForwardTrace(String forwardTrace) {
		this.forwardTrace = forwardTrace;
	}

	public String getForwardZone() {
		return this.forwardZone;
	}
	public void setForwardZone(String forwardZone) {
		this.forwardZone = forwardZone;
	}

}
