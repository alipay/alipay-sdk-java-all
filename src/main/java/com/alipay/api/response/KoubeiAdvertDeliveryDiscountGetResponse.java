package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:57
 */
public class KoubeiAdvertDeliveryDiscountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6812946961514773857L;

	/** 
	 * 广告推荐的商品信息列表，个数小于等于请求中参数“size”个数
	 */
	@ApiField("discounts")
	private DiscountInfo discounts;

	/** 
	 * 本次推荐的唯一标识， 此字段需回传
	 */
	@ApiField("recommend_id")
	private String recommendId;

	public void setDiscounts(DiscountInfo discounts) {
		this.discounts = discounts;
	}
	public DiscountInfo getDiscounts( ) {
		return this.discounts;
	}

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendId( ) {
		return this.recommendId;
	}

}
