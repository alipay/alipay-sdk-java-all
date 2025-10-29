package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户意图智能服务搜索
 *
 * @author auto create
 * @since 1.0, 2025-01-17 17:59:17
 */
public class AlipayEbppIndustryGovserviceSearchRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 6771784593782539254L;

	/**
	 * 服务展示渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 当其他端不支持支付宝uid时，用于标识用户的唯一标识
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户搜索内容
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户query和服务相关性的最低分数。大模型会返回相关性大于该值的服务信息
	 */
	@ApiField("search_score")
	private String searchScore;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSearchScore() {
		return this.searchScore;
	}
	public void setSearchScore(String searchScore) {
		this.searchScore = searchScore;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
