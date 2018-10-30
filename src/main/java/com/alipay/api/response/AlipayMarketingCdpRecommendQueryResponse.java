package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-18 15:36:04
 */
public class AlipayMarketingCdpRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3579526768614893662L;

	/** 
	 * 当前推荐的唯一标识,用于不同方案的效果跟踪
	 */
	@ApiField("recommend_id")
	private String recommendId;

	/** 
	 * 商家信息列表，最多返回20条，返回json数组，包含shopTitle=店名；cuisine=菜系；address=具体位置；bizCircle=所属商圈；discount=优惠；orderCount=已领/已享人数；avgPrice=人均价格；starLevel=评分；distance=距离（单位米）。以上属性可以为空或不存在
	 */
	@ApiField("shop_info")
	private String shopInfo;

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendId( ) {
		return this.recommendId;
	}

	public void setShopInfo(String shopInfo) {
		this.shopInfo = shopInfo;
	}
	public String getShopInfo( ) {
		return this.shopInfo;
	}

}
