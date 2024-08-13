package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot请求类
 *
 * @author auto create
 * @since 1.0, 2022-11-01 09:26:56
 */
public class IntentQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 6581937659614617122L;

	/**
	 * 用户的请求来自的操作动作来源
	 */
	@ApiField("action_src")
	private String actionSrc;

	/**
	 * 客户端操作系统类型
	 */
	@ApiField("client_os")
	private String clientOs;

	/**
	 * 客户端版本号
	 */
	@ApiField("client_version")
	private String clientVersion;

	/**
	 * 用户当前的城市code
	 */
	@ApiField("current_city")
	private String currentCity;

	/**
	 * 用户当前位置坐标
	 */
	@ApiField("location")
	private String location;

	/**
	 * nluJsonParam
	 */
	@ApiField("nlu_json_param")
	private String nluJsonParam;

	/**
	 * 全局唯一 open id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户输入的query
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户具体一次的请求的id,唯一
	 */
	@ApiField("query_id")
	private String queryId;

	/**
	 * 服务器端分配的场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 请求的不同入口
	 */
	@ApiField("search_src")
	private String searchSrc;

	/**
	 * 用户多轮会话的id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户的id
	 */
	@ApiField("uid")
	private String uid;

	public String getActionSrc() {
		return this.actionSrc;
	}
	public void setActionSrc(String actionSrc) {
		this.actionSrc = actionSrc;
	}

	public String getClientOs() {
		return this.clientOs;
	}
	public void setClientOs(String clientOs) {
		this.clientOs = clientOs;
	}

	public String getClientVersion() {
		return this.clientVersion;
	}
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public String getCurrentCity() {
		return this.currentCity;
	}
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getNluJsonParam() {
		return this.nluJsonParam;
	}
	public void setNluJsonParam(String nluJsonParam) {
		this.nluJsonParam = nluJsonParam;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getQueryId() {
		return this.queryId;
	}
	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSearchSrc() {
		return this.searchSrc;
	}
	public void setSearchSrc(String searchSrc) {
		this.searchSrc = searchSrc;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
