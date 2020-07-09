package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiscountInfo;
import com.alipay.api.domain.KbAdvertIdentifyResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDeliveryDiscountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3854268994655721164L;

	/** 
	 * 广告投放出去的商品信息
	 */
	@ApiListField("discounts")
	@ApiField("discount_info")
	private List<DiscountInfo> discounts;

	/** 
	 * 券领取结果
	 */
	@ApiField("purchase_datas")
	private KbAdvertIdentifyResponse purchaseDatas;

	/** 
	 * 本次推荐的唯一标识
	 */
	@ApiField("recommend_id")
	private String recommendId;

	public void setDiscounts(List<DiscountInfo> discounts) {
		this.discounts = discounts;
	}
	public List<DiscountInfo> getDiscounts( ) {
		return this.discounts;
	}

	public void setPurchaseDatas(KbAdvertIdentifyResponse purchaseDatas) {
		this.purchaseDatas = purchaseDatas;
	}
	public KbAdvertIdentifyResponse getPurchaseDatas( ) {
		return this.purchaseDatas;
	}

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendId( ) {
		return this.recommendId;
	}

}
