package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbAdvertAdvResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.mission.promote response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionMissionPromoteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5451439648286714562L;

	/** 
	 * 广告详情
	 */
	@ApiField("advert")
	private KbAdvertAdvResponse advert;

	/** 
	 * true:可以二级分佣配置
false:不可以
	 */
	@ApiField("can_cascade_mission")
	private String canCascadeMission;

	public void setAdvert(KbAdvertAdvResponse advert) {
		this.advert = advert;
	}
	public KbAdvertAdvResponse getAdvert( ) {
		return this.advert;
	}

	public void setCanCascadeMission(String canCascadeMission) {
		this.canCascadeMission = canCascadeMission;
	}
	public String getCanCascadeMission( ) {
		return this.canCascadeMission;
	}

}
