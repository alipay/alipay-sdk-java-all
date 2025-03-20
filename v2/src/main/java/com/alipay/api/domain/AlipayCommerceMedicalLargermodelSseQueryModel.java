package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗大模型服务对外接口_流式会话
 *
 * @author auto create
 * @since 1.0, 2024-12-11 20:35:12
 */
public class AlipayCommerceMedicalLargermodelSseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2417495534236519653L;

	/**
	 * 流式会话最大存活时间(毫秒)
	 */
	@ApiField("alive_time")
	private Long aliveTime;

	/**
	 * 区分请求来源
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 纬度 无需携带单位符号
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度 无需携带单位符号
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
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
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 若为空则走意图识别 否则跳过意图识别接口，直接路由 医疗科普——MEDICALSCI 用药指南—— DRUGGUIDE 智能导诊—— DEPARTGUIDE
	 */
	@ApiField("pre_intention")
	private String preIntention;

	/**
	 * 用户问题描述，初始化时无query
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户提问类型
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 区分当前对话场景意图 待分配后传入固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public Long getAliveTime() {
		return this.aliveTime;
	}
	public void setAliveTime(Long aliveTime) {
		this.aliveTime = aliveTime;
	}

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
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

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
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
