package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗大模型服务对外接口-会话创建或查询
 *
 * @author auto create
 * @since 1.0, 2024-07-26 12:21:13
 */
public class AlipayCommerceMedicalLargermodelSessionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1654277682653599714L;

	/**
	 * 区分请求来源
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 行业侧生成，首次为空
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用于区分同一个app下的机构
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 用户的userId。
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID；若是open_id时，设置为ALIPAY_OPENID
	 */
	@ApiField("outer_user_type")
	private String outerUserType;

	/**
	 * 若为空则走意图识别
否则跳过意图识别接口，直接路由
医疗科普——MEDICALSCI
用药指南——
DRUGGUIDE
智能导诊——
DEPARTGUIDE
	 */
	@ApiField("pre_intention")
	private String preIntention;

	/**
	 * 用户问题描述，初始化时无query
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用于区分query类型
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 区分当前对话场景意图
前缀不同，不做强枚举校验
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 若为空，则为本轮第一次对话
初始化
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOuterUserType() {
		return this.outerUserType;
	}
	public void setOuterUserType(String outerUserType) {
		this.outerUserType = outerUserType;
	}

	public String getPreIntention() {
		return this.preIntention;
	}
	public void setPreIntention(String preIntention) {
		this.preIntention = preIntention;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
