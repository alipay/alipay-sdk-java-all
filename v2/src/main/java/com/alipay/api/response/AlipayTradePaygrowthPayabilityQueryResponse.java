package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecommendInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.paygrowth.payability.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:52:00
 */
public class AlipayTradePaygrowthPayabilityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4876591986143383971L;

	/** 
	 * 是否有支付能力，true表示有支付能力，false表示没有支付能力。
	 */
	@ApiField("enable_to_pay")
	private Boolean enableToPay;

	/** 
	 * 是否需要运营干预，true表示需要运营干预，提供文字链、图片+聚合页、数据等多种干预手段。
	 */
	@ApiField("need_recommend")
	private Boolean needRecommend;

	/** 
	 * 支付能力推荐信息，若用户没有支付能力且该场景需要做运营推荐，则返回运营推荐信息，包括推荐类型、文案、图片及跳转地址等。
	 */
	@ApiField("recommend_info")
	private RecommendInfo recommendInfo;

	public void setEnableToPay(Boolean enableToPay) {
		this.enableToPay = enableToPay;
	}
	public Boolean getEnableToPay( ) {
		return this.enableToPay;
	}

	public void setNeedRecommend(Boolean needRecommend) {
		this.needRecommend = needRecommend;
	}
	public Boolean getNeedRecommend( ) {
		return this.needRecommend;
	}

	public void setRecommendInfo(RecommendInfo recommendInfo) {
		this.recommendInfo = recommendInfo;
	}
	public RecommendInfo getRecommendInfo( ) {
		return this.recommendInfo;
	}

}
