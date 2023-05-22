package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上拉包接口
 *
 * @author auto create
 * @since 1.0, 2022-10-11 10:59:15
 */
public class AlipayOpenMiniDeploypackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1895715882861473328L;

	/**
	 * 端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 客户端层面的渠道：CHANNEL_OFFICIAL 正式包  CHANNEL_RC 灰度包
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 客户端版本
	 */
	@ApiField("client")
	private String client;

	/**
	 * 设备号
	 */
	@ApiField("diu")
	private String diu;

	/**
	 * 环境：prepub 预发、线上 production）
	 */
	@ApiField("env")
	private String env;

	/**
	 * 本地已存在的包信息
	 */
	@ApiField("existed")
	private String existed;

	/**
	 * 灰度规则
	 */
	@ApiField("gray_rules")
	private String grayRules;

	/**
	 * 只在应用应用互保,本地应用版本信息
	 */
	@ApiField("local_app_info")
	private String localAppInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 平台标识
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 是否开启互保
	 */
	@ApiField("prefer_local")
	private String preferLocal;

	/**
	 * 协议版本号
	 */
	@ApiField("protocol")
	private String protocol;

	/**
	 * 拉包请求的数据
	 */
	@ApiField("query")
	private String query;

	/**
	 * 请求同步/异步标识
	 */
	@ApiField("req_mode")
	private String reqMode;

	/**
	 * 客户端sdk版本号,一般输出给多端使用
	 */
	@ApiField("sdk")
	private String sdk;

	/**
	 * 是否开启强大的RPC功能
	 */
	@ApiField("stable_rpc")
	private String stableRpc;

	/**
	 * 系统版本号
	 */
	@ApiField("system")
	private String system;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getClient() {
		return this.client;
	}
	public void setClient(String client) {
		this.client = client;
	}

	public String getDiu() {
		return this.diu;
	}
	public void setDiu(String diu) {
		this.diu = diu;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getExisted() {
		return this.existed;
	}
	public void setExisted(String existed) {
		this.existed = existed;
	}

	public String getGrayRules() {
		return this.grayRules;
	}
	public void setGrayRules(String grayRules) {
		this.grayRules = grayRules;
	}

	public String getLocalAppInfo() {
		return this.localAppInfo;
	}
	public void setLocalAppInfo(String localAppInfo) {
		this.localAppInfo = localAppInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPreferLocal() {
		return this.preferLocal;
	}
	public void setPreferLocal(String preferLocal) {
		this.preferLocal = preferLocal;
	}

	public String getProtocol() {
		return this.protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getReqMode() {
		return this.reqMode;
	}
	public void setReqMode(String reqMode) {
		this.reqMode = reqMode;
	}

	public String getSdk() {
		return this.sdk;
	}
	public void setSdk(String sdk) {
		this.sdk = sdk;
	}

	public String getStableRpc() {
		return this.stableRpc;
	}
	public void setStableRpc(String stableRpc) {
		this.stableRpc = stableRpc;
	}

	public String getSystem() {
		return this.system;
	}
	public void setSystem(String system) {
		this.system = system;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
