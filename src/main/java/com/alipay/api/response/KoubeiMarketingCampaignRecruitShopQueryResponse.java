package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecruitShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.recruit.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-17 10:46:17
 */
public class KoubeiMarketingCampaignRecruitShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3294287774494495574L;

	/** 
	 * 招商活动id
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 总量
	 */
	@ApiField("shop_count")
	private String shopCount;

	/** 
	 * 招商门店确认详情
	 */
	@ApiListField("shop_info")
	@ApiField("recruit_shop_info")
	private List<RecruitShopInfo> shopInfo;

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setShopCount(String shopCount) {
		this.shopCount = shopCount;
	}
	public String getShopCount( ) {
		return this.shopCount;
	}

	public void setShopInfo(List<RecruitShopInfo> shopInfo) {
		this.shopInfo = shopInfo;
	}
	public List<RecruitShopInfo> getShopInfo( ) {
		return this.shopInfo;
	}

}
