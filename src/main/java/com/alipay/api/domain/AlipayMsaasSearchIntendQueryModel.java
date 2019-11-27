package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给阿里云语音团队使用的私有接口，传入语音识别的结果，返回根据语音结果识别出的意图信息
 *
 * @author auto create
 * @since 1.0, 2015-12-15 18:12:45
 */
public class AlipayMsaasSearchIntendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1789132864937464322L;

	/**
	 * 搜索框场景code
	 */
	@ApiField("action_src")
	private String actionSrc;

	/**
	 * 用户当前选择的城市（如果有的话）
	 */
	@ApiField("current_city")
	private String currentCity;

	/**
	 * 经度,纬度
	 */
	@ApiField("location")
	private String location;

	/**
	 * 传递给nlu的参数，json格式
	 */
	@ApiField("nlu_param")
	private String nluParam;

	/**
	 * 表示在同一sessionid中的第几次搜索
	 */
	@ApiField("query_index")
	private String queryIndex;

	/**
	 * search_id,由调用放生成uuid，如果不传search系统会生成uuid
	 */
	@ApiField("search_id")
	private String searchId;

	/**
	 * 表示来源的业务，用于记录日志做数据统计
	 */
	@ApiField("search_src")
	private String searchSrc;

	/**
	 * 由调用方生成的uuid，用于唯一标示一次搜索会话
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 支付宝userid
	 */
	@ApiField("uid")
	private String uid;

	public String getActionSrc() {
		return this.actionSrc;
	}
	public void setActionSrc(String actionSrc) {
		this.actionSrc = actionSrc;
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

	public String getNluParam() {
		return this.nluParam;
	}
	public void setNluParam(String nluParam) {
		this.nluParam = nluParam;
	}

	public String getQueryIndex() {
		return this.queryIndex;
	}
	public void setQueryIndex(String queryIndex) {
		this.queryIndex = queryIndex;
	}

	public String getSearchId() {
		return this.searchId;
	}
	public void setSearchId(String searchId) {
		this.searchId = searchId;
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
