package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步数据到支付宝等APP
 *
 * @author auto create
 * @since 1.0, 2023-04-17 15:30:50
 */
public class AlipayMsaasSyncSingledataSendModel extends AlipayObject {

	private static final long serialVersionUID = 5787744719998848823L;

	/**
	 * 支持的最大客户端app版本号
	 */
	@ApiField("app_max_version")
	private String appMaxVersion;

	/**
	 * 支持的最小客户端app版本号
	 */
	@ApiField("app_min_version")
	private String appMinVersion;

	/**
	 * base64编码后的二进制业务数据，与payload二选一
	 */
	@ApiField("binary_payload")
	private String binaryPayload;

	/**
	 * 透传至客户端的业务自定义标签属性
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 业务场景标识，需要申请，文档：https://lark.alipay.com/team-sync/sync/biztype
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 参考文档：https://lark.alipay.com/team-sync/sync/server-down
	 */
	@ApiField("client_app")
	private String clientApp;

	/**
	 * 希望接收数据的移动设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 是否需要立即推送给客户端app，默认为true
	 */
	@ApiField("immediate_sync")
	private Boolean immediateSync;

	/**
	 * 根据申请bizType决定，用户维度业务不要填该字段，请使用open_id字段, 设备维度请再该字段里填写utdid
	 */
	@ApiField("link_token")
	private String linkToken;

	/**
	 * 开放平台open ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 指定接收数据的客户端os类型
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * 字符型业务数据体，与binary_payload二选一
	 */
	@ApiField("payload")
	private String payload;

	/**
	 * 业务数据唯一标识，无特殊要求，主要用做幂等控制
	 */
	@ApiField("third_msg_id")
	private String thirdMsgId;

	/**
	 * 业务数据生效的结束时间
	 */
	@ApiField("valid_end")
	private Date validEnd;

	/**
	 * 业务数据生效的起始时间
	 */
	@ApiField("valid_start")
	private Date validStart;

	public String getAppMaxVersion() {
		return this.appMaxVersion;
	}
	public void setAppMaxVersion(String appMaxVersion) {
		this.appMaxVersion = appMaxVersion;
	}

	public String getAppMinVersion() {
		return this.appMinVersion;
	}
	public void setAppMinVersion(String appMinVersion) {
		this.appMinVersion = appMinVersion;
	}

	public String getBinaryPayload() {
		return this.binaryPayload;
	}
	public void setBinaryPayload(String binaryPayload) {
		this.binaryPayload = binaryPayload;
	}

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getClientApp() {
		return this.clientApp;
	}
	public void setClientApp(String clientApp) {
		this.clientApp = clientApp;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Boolean getImmediateSync() {
		return this.immediateSync;
	}
	public void setImmediateSync(Boolean immediateSync) {
		this.immediateSync = immediateSync;
	}

	public String getLinkToken() {
		return this.linkToken;
	}
	public void setLinkToken(String linkToken) {
		this.linkToken = linkToken;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOsType() {
		return this.osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getPayload() {
		return this.payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getThirdMsgId() {
		return this.thirdMsgId;
	}
	public void setThirdMsgId(String thirdMsgId) {
		this.thirdMsgId = thirdMsgId;
	}

	public Date getValidEnd() {
		return this.validEnd;
	}
	public void setValidEnd(Date validEnd) {
		this.validEnd = validEnd;
	}

	public Date getValidStart() {
		return this.validStart;
	}
	public void setValidStart(Date validStart) {
		this.validStart = validStart;
	}

}
