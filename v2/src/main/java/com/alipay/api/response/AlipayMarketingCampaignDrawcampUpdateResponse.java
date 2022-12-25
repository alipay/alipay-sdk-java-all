package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.update response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:23:47
 */
public class AlipayMarketingCampaignDrawcampUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4688654329774263538L;

	/** 
	 * 操作结果状态，true表示修改成功立即生效，false表示修改失败
	 */
	@ApiField("camp_result")
	private Boolean campResult;

	public void setCampResult(Boolean campResult) {
		this.campResult = campResult;
	}
	public Boolean getCampResult( ) {
		return this.campResult;
	}

}
