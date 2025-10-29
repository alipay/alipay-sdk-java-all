package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务上下文包括环境信息和用户信息
 *
 * @author auto create
 * @since 1.0, 2023-02-20 19:56:11
 */
public class ServiceContext extends AlipayObject {

	private static final long serialVersionUID = 2282124991593294991L;

	/**
	 * 客户端IP
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 客户端UMID
	 */
	@ApiField("client_pcidguid")
	private String clientPcidguid;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 服务器名
	 */
	@ApiField("server_name")
	private String serverName;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getClientPcidguid() {
		return this.clientPcidguid;
	}
	public void setClientPcidguid(String clientPcidguid) {
		this.clientPcidguid = clientPcidguid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getServerName() {
		return this.serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
