package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户意图智能服务推荐
 *
 * @author auto create
 * @since 1.0, 2023-12-28 19:39:41
 */
public class AlipayEbppIndustryGovserviceRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6283572851496339772L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
