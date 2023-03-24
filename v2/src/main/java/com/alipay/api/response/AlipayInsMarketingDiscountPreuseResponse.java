package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsMktPreUseCampaignDTO;
import com.alipay.api.domain.InsMktPreUseCouponDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.discount.preuse response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:57:07
 */
public class AlipayInsMarketingDiscountPreuseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3241196932863278942L;

	/** 
	 * 预核销活动列表
	 */
	@ApiListField("pre_use_campaigns")
	@ApiField("ins_mkt_pre_use_campaign_d_t_o")
	private List<InsMktPreUseCampaignDTO> preUseCampaigns;

	/** 
	 * 预核销权益列表
	 */
	@ApiListField("pre_use_coupons")
	@ApiField("ins_mkt_pre_use_coupon_d_t_o")
	private List<InsMktPreUseCouponDTO> preUseCoupons;

	public void setPreUseCampaigns(List<InsMktPreUseCampaignDTO> preUseCampaigns) {
		this.preUseCampaigns = preUseCampaigns;
	}
	public List<InsMktPreUseCampaignDTO> getPreUseCampaigns( ) {
		return this.preUseCampaigns;
	}

	public void setPreUseCoupons(List<InsMktPreUseCouponDTO> preUseCoupons) {
		this.preUseCoupons = preUseCoupons;
	}
	public List<InsMktPreUseCouponDTO> getPreUseCoupons( ) {
		return this.preUseCoupons;
	}

}
