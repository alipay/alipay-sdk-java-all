package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫im消息发送
 *
 * @author auto create
 * @since 1.0, 2026-04-17 14:57:46
 */
public class AlipayCommerceMedicalHdfImmessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 7442469356325319676L;

	/**
	 * 消息行为
	 */
	@ApiField("action")
	private String action;

	/**
	 * 前端消息唯一id
	 */
	@ApiField("app_msg_id")
	private String appMsgId;

	/**
	 * app版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 业务标识
	 */
	@ApiField("business")
	private String business;

	/**
	 * 业务标识详细
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 连接申请设备类型
	 */
	@ApiField("device")
	private String device;

	/**
	 * 连接申请设备唯一标识
	 */
	@ApiField("device_key")
	private String deviceKey;

	/**
	 * 消息发送者连接id
	 */
	@ApiField("from_connection_id")
	private String fromConnectionId;

	/**
	 * 消息发送者账号id
	 */
	@ApiField("from_source_id")
	private String fromSourceId;

	/**
	 * 消息发送者账号类型
	 */
	@ApiField("from_source_type")
	private String fromSourceType;

	/**
	 * 接口行为
	 */
	@ApiField("method_action")
	private String methodAction;

	/**
	 * 消息体
	 */
	@ApiField("msg_body")
	private String msgBody;

	/**
	 * 消息唯一KEY
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 是否需要Xss
	 */
	@ApiField("need_xss")
	private Boolean needXss;

	/**
	 * im sdk版本号
	 */
	@ApiField("sdk_version")
	private String sdkVersion;

	/**
	 * 消息接收详细id集合，适用于发送给群内某些人
	 */
	@ApiField("to_detail_id_list")
	private String toDetailIdList;

	/**
	 * 消息接收者账号id
	 */
	@ApiField("to_source_id")
	private String toSourceId;

	/**
	 * 消息接收者类型
	 */
	@ApiField("to_source_type")
	private String toSourceType;

	/**
	 * 消息类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 好大夫用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAppMsgId() {
		return this.appMsgId;
	}
	public void setAppMsgId(String appMsgId) {
		this.appMsgId = appMsgId;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBusiness() {
		return this.business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDevice() {
		return this.device;
	}
	public void setDevice(String device) {
		this.device = device;
	}

	public String getDeviceKey() {
		return this.deviceKey;
	}
	public void setDeviceKey(String deviceKey) {
		this.deviceKey = deviceKey;
	}

	public String getFromConnectionId() {
		return this.fromConnectionId;
	}
	public void setFromConnectionId(String fromConnectionId) {
		this.fromConnectionId = fromConnectionId;
	}

	public String getFromSourceId() {
		return this.fromSourceId;
	}
	public void setFromSourceId(String fromSourceId) {
		this.fromSourceId = fromSourceId;
	}

	public String getFromSourceType() {
		return this.fromSourceType;
	}
	public void setFromSourceType(String fromSourceType) {
		this.fromSourceType = fromSourceType;
	}

	public String getMethodAction() {
		return this.methodAction;
	}
	public void setMethodAction(String methodAction) {
		this.methodAction = methodAction;
	}

	public String getMsgBody() {
		return this.msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public Boolean getNeedXss() {
		return this.needXss;
	}
	public void setNeedXss(Boolean needXss) {
		this.needXss = needXss;
	}

	public String getSdkVersion() {
		return this.sdkVersion;
	}
	public void setSdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	public String getToDetailIdList() {
		return this.toDetailIdList;
	}
	public void setToDetailIdList(String toDetailIdList) {
		this.toDetailIdList = toDetailIdList;
	}

	public String getToSourceId() {
		return this.toSourceId;
	}
	public void setToSourceId(String toSourceId) {
		this.toSourceId = toSourceId;
	}

	public String getToSourceType() {
		return this.toSourceType;
	}
	public void setToSourceType(String toSourceType) {
		this.toSourceType = toSourceType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
