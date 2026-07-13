package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI眼镜声纹核身推荐开通接口
 *
 * @author auto create
 * @since 1.0, 2026-05-08 17:29:49
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 8118253786851372171L;

	/**
	 * 回调URL
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 推荐类型，仅支持consult或render，consult表示咨询是否推荐，render表示获取推荐详情
	 */
	@ApiField("recommend_type")
	private String recommendType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getRecommendType() {
		return this.recommendType;
	}
	public void setRecommendType(String recommendType) {
		this.recommendType = recommendType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
