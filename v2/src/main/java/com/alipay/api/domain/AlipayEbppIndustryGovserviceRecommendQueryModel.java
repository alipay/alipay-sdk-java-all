package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户意图智能服务推荐
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:29:50
 */
public class AlipayEbppIndustryGovserviceRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7284299455146691823L;

	/**
	 * 兜底城市code
	 */
	@ApiField("actual_city_code")
	private String actualCityCode;

	/**
	 * 服务展示渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * lbs城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 当其他端不支持支付宝uid时，用于标识用户的唯一标识
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构所属pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 用户会话内容
	 */
	@ApiField("query")
	private String query;

	/**
	 * token值
	 */
	@ApiField("recommend_token")
	private String recommendToken;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActualCityCode() {
		return this.actualCityCode;
	}
	public void setActualCityCode(String actualCityCode) {
		this.actualCityCode = actualCityCode;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getIdentifyId() {
		return this.identifyId;
	}
	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getRecommendToken() {
		return this.recommendToken;
	}
	public void setRecommendToken(String recommendToken) {
		this.recommendToken = recommendToken;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
