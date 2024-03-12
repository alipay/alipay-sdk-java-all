package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 建立连接
 *
 * @author auto create
 * @since 1.0, 2023-10-07 15:24:20
 */
public class AlipayIserviceCliveConnectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2797192958515435521L;

	/**
	 * 客户端类型
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 浏览器信息
	 */
	@ApiField("client_info")
	private String clientInfo;

	/**
	 * 访客Ip地址
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 来源网页url，用于记录用户行为轨迹
	 */
	@ApiField("enter_url")
	private String enterUrl;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_values")
	private String extValues;

	/**
	 * 技能组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 埋点服务路径id
	 */
	@ApiField("path_id")
	private String pathId;

	/**
	 * 用户的优先级，如无特殊优先级，默认值为0
	 */
	@ApiField("priority")
	private String priority;

	/**
	 * 是否重连原始客服,如果重连，请传true
	 */
	@ApiField("reconnect")
	private String reconnect;

	/**
	 * 小二id:指定小二连接
	 */
	@ApiField("server_id")
	private String serverId;

	/**
	 * 一次服务的token，必须唯一，相当于本次服务的唯一标识
	 */
	@ApiField("service_token")
	private String serviceToken;

	/**
	 * 机器人会话id参数名称
	 */
	@ApiField("session_uuid")
	private String sessionUuid;

	/**
	 * 访问DT的渠道
11:LINKS
12:HELLO_BIKE
	 */
	@ApiField("src")
	private String src;

	/**
	 * 访客uid
	 */
	@ApiField("visitor_id")
	private String visitorId;

	/**
	 * 访客名称
	 */
	@ApiField("visitor_name")
	private String visitorName;

	/**
	 * 访客类型，COMMON_VISITOR(普通登录访客)/ANONYMITY_VISITOR(匿名访客)
	 */
	@ApiField("visitor_type")
	private String visitorType;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getClientInfo() {
		return this.clientInfo;
	}
	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getEnterUrl() {
		return this.enterUrl;
	}
	public void setEnterUrl(String enterUrl) {
		this.enterUrl = enterUrl;
	}

	public String getExtValues() {
		return this.extValues;
	}
	public void setExtValues(String extValues) {
		this.extValues = extValues;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPathId() {
		return this.pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getReconnect() {
		return this.reconnect;
	}
	public void setReconnect(String reconnect) {
		this.reconnect = reconnect;
	}

	public String getServerId() {
		return this.serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public String getServiceToken() {
		return this.serviceToken;
	}
	public void setServiceToken(String serviceToken) {
		this.serviceToken = serviceToken;
	}

	public String getSessionUuid() {
		return this.sessionUuid;
	}
	public void setSessionUuid(String sessionUuid) {
		this.sessionUuid = sessionUuid;
	}

	public String getSrc() {
		return this.src;
	}
	public void setSrc(String src) {
		this.src = src;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorName() {
		return this.visitorName;
	}
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorType() {
		return this.visitorType;
	}
	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}

}
