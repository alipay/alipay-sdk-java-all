package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecommendCard;
import com.alipay.api.domain.RecommendServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.promo.intelligentguide.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-13 17:15:34
 */
public class KoubeiServindustryPromoIntelligentguideConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4714148642641694231L;

	/** 
	 * 预计消费最大金额
	 */
	@ApiField("consume_max")
	private Long consumeMax;

	/** 
	 * 预计最少消费金额
	 */
	@ApiField("consume_min")
	private Long consumeMin;

	/** 
	 * 推荐卡项信息
	 */
	@ApiField("recommend_card")
	private RecommendCard recommendCard;

	/** 
	 * 推荐具体服务项目
	 */
	@ApiListField("recommend_service_info")
	@ApiField("recommend_service_info")
	private List<RecommendServiceInfo> recommendServiceInfo;

	/** 
	 * 用户兴趣标签，多个用'|' 分隔符分隔
	 */
	@ApiField("user_tags")
	private String userTags;

	public void setConsumeMax(Long consumeMax) {
		this.consumeMax = consumeMax;
	}
	public Long getConsumeMax( ) {
		return this.consumeMax;
	}

	public void setConsumeMin(Long consumeMin) {
		this.consumeMin = consumeMin;
	}
	public Long getConsumeMin( ) {
		return this.consumeMin;
	}

	public void setRecommendCard(RecommendCard recommendCard) {
		this.recommendCard = recommendCard;
	}
	public RecommendCard getRecommendCard( ) {
		return this.recommendCard;
	}

	public void setRecommendServiceInfo(List<RecommendServiceInfo> recommendServiceInfo) {
		this.recommendServiceInfo = recommendServiceInfo;
	}
	public List<RecommendServiceInfo> getRecommendServiceInfo( ) {
		return this.recommendServiceInfo;
	}

	public void setUserTags(String userTags) {
		this.userTags = userTags;
	}
	public String getUserTags( ) {
		return this.userTags;
	}

}
